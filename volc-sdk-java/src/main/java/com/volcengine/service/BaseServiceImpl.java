package com.volcengine.service;

import com.alibaba.fastjson.JSON;
import com.volcengine.auth.ISignerV4;
import com.volcengine.auth.impl.SignerV4Impl;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.http.DynamicTimeoutInterceptor;
import com.volcengine.http.OkHttpClientFactory;
import com.volcengine.http.VolcengineInterceptor;
import com.volcengine.model.*;
import com.volcengine.model.Credentials;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.sts2.InnerToken;
import com.volcengine.model.sts2.Policy;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.util.Sts2Utils;
import okhttp3.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class BaseServiceImpl implements IBaseService {
    public static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json");

    private static final Log LOG = LogFactory.getLog(BaseServiceImpl.class);
    protected ServiceInfo serviceInfo;
    protected Map<String, ApiInfo> apiInfoList;
    private OkHttpClient httpClient;
    private ISignerV4 ISigner;

    private BaseServiceImpl() {
    }

    public BaseServiceImpl(ServiceInfo info, Proxy proxy, Map<String, ApiInfo> apiInfoList) {
        initBean(info, proxy, apiInfoList);
    }

    public BaseServiceImpl(ServiceInfo info, Map<String, ApiInfo> apiInfoList) {
        initBean(info, null, apiInfoList);
    }

    private void initBean(ServiceInfo info, Proxy proxy, Map<String, ApiInfo> apiInfoList) {
        this.serviceInfo = info;
        this.apiInfoList = apiInfoList;
        this.ISigner = new SignerV4Impl();
        VolcengineInterceptor volcengineInterceptor = new VolcengineInterceptor(this.ISigner, serviceInfo.getCredentials());

        DynamicTimeoutInterceptor.DynamicTimeoutConfig defaultTimeout = new DynamicTimeoutInterceptor.DynamicTimeoutConfig(info.getConnectionTimeout(), info.getSocketTimeout());
        Map<String, DynamicTimeoutInterceptor.DynamicTimeoutConfig> apiTimeoutMap = new HashMap<String, DynamicTimeoutInterceptor.DynamicTimeoutConfig>();
        for (Map.Entry<String, ApiInfo> entry : apiInfoList.entrySet()) {
            ApiInfo apiInfo = entry.getValue();

            if (apiInfo.getConnectionTimeout()==0 && apiInfo.getSocketTimeout() == 0) {
                continue;
            }
            if (apiInfo.getConnectionTimeout() == defaultTimeout.getConnectTimeout() && apiInfo.getSocketTimeout() == defaultTimeout.getReadTimeout()) {
                continue;
            }
            apiTimeoutMap.put(entry.getKey(), new DynamicTimeoutInterceptor.DynamicTimeoutConfig(apiInfo.getConnectionTimeout(), apiInfo.getSocketTimeout()));
        }

        DynamicTimeoutInterceptor dynamicTimeoutInterceptor = new DynamicTimeoutInterceptor(defaultTimeout, apiTimeoutMap);
        if (proxy == null) {
            this.httpClient = OkHttpClientFactory.create(volcengineInterceptor, dynamicTimeoutInterceptor);
        } else {
            this.httpClient = OkHttpClientFactory.create(proxy, volcengineInterceptor, dynamicTimeoutInterceptor);
        }

        init(info);
    }


    private void init(ServiceInfo info) {
        String accessKey = System.getenv(Const.ACCESS_KEY);
        String secretKey = System.getenv(Const.SECRET_KEY);

        if (accessKey != null && !accessKey.equals("") && secretKey != null && !secretKey.equals("")) {
            info.getCredentials().setAccessKeyID(accessKey);
            info.getCredentials().setSecretAccessKey(secretKey);
        } else {
            File file = new File(System.getenv("HOME") + "/.volc/config");
            if (file.exists()) {
                try {
                    long length = file.length();
                    byte[] content = new byte[(int) length];
                    FileInputStream in = new FileInputStream(file);
                    in.read(content);
                    in.close();
                    Credentials credentials = JSON.parseObject(content, Credentials.class);
                    if (credentials.getAccessKeyID() != null) {
                        info.getCredentials().setAccessKeyID(credentials.getAccessKeyID());
                    }
                    if (credentials.getSecretAccessKey() != null) {
                        info.getCredentials().setSecretAccessKey(credentials.getSecretAccessKey());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    LOG.error("Read file " + file.getName() + " fail.");
                }
            }
        }
    }

    @Override
    public String getSignUrl(String api, List<NameValuePair> params) throws Exception {
        ApiInfo apiInfo = apiInfoList.get(api);

        if (apiInfo == null) {
            throw new Exception(SdkError.getErrorDesc(SdkError.ENOAPI));
        }

        List<NameValuePair> mergedNV = mergeQuery(params, apiInfo.getQuery());

        RequestParam requestParam = RequestParam.builder().isSignUrl(true)
                .body(new byte[0])
                .host(serviceInfo.getHost())
                .path(apiInfo.getPath())
                .method(apiInfo.getMethod().toUpperCase())
                .date(new Date())
                .queryList(mergedNV)
                .build();
        SignRequest signRequest = ISigner.getSignRequest(requestParam, serviceInfo.getCredentials());

        HttpUrl.Builder urlBuilder = new HttpUrl.Builder();
        urlBuilder.scheme(serviceInfo.getScheme()).host(serviceInfo.getHost()).encodedPath(apiInfo.getPath());

        for (NameValuePair pair : mergedNV) {
            urlBuilder.addQueryParameter(pair.getName(), pair.getValue());
        }

        urlBuilder.addQueryParameter(Const.XDate, signRequest.getXDate());
        urlBuilder.addQueryParameter(Const.XNotSignBody, signRequest.getXNotSignBody());
        urlBuilder.addQueryParameter(Const.XCredential, signRequest.getXCredential());
        urlBuilder.addQueryParameter(Const.XAlgorithm, signRequest.getXAlgorithm());
        urlBuilder.addQueryParameter(Const.XSignedHeaders, signRequest.getXSignedHeaders());
        urlBuilder.addQueryParameter(Const.XSignedQueries, signRequest.getXSignedQueries());
        urlBuilder.addQueryParameter(Const.XSignature, signRequest.getXSignature());
        if (StringUtils.isNotEmpty(signRequest.getXSecurityToken())) {
            urlBuilder.addQueryParameter(Const.XSecurityToken, signRequest.getXSecurityToken());
        }

        return urlBuilder.build().toString();
    }

    @Override
    public RawResponse query(String api, List<NameValuePair> params) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        Request request = prepareRequestBuilder(api, params).get().build();
        return makeRequest(api, request);
    }

    /**
     * Origin put method which without volcengine signer
     *
     * @param url url
     * @param data data
     * @param headers headers
     * @return true if the http response code is 200, otherwise false
     */
    protected boolean originPutData(String url, byte[] data, Map<String, String> headers) {
        RequestBody body = RequestBody.create(data);
        return doOriginPut(url, body, headers).getCode() == 200;
    }

    /**
     * Origin put method which without volcengine signer
     *
     * @param url url
     * @param data data
     * @param headers headers
     * @return the raw response
     */
    protected RawResponse originPutDataWithResponse(String url, byte[] data, Map<String, String> headers) {
        return doOriginPut(url, RequestBody.create(data), headers);
    }

    private RawResponse doOriginPut(String url, RequestBody entity, Map<String, String> headers) {
        Request.Builder httpPut = new Request.Builder();
        httpPut.url(url);
        httpPut.put(entity);
        if (headers != null && headers.size() > 0) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpPut.addHeader(entry.getKey(), entry.getValue());
            }
        }
        OkHttpClient client;
        Response response = null;
        RawResponse rawResponse = new RawResponse();
        try {
            client = OkHttpClientFactory.create();
            if (client == null) {
                return new RawResponse(null, SdkError.UNKNOWN.getNumber(), new IllegalStateException(""));
            }
            Call call = client.newCall(httpPut.build());
            response = call.execute();
            int statusCode = response.code();
            rawResponse.setCode(statusCode);
            ResponseBody body = response.body();
            if (body != null) {
                rawResponse.setData(body.bytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
            rawResponse.setException(e);
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return rawResponse;
    }

    @Override
    public RawResponse json(String api, List<NameValuePair> params, String body) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        Request.Builder requestBuilder = prepareRequestBuilder(api, params);
        requestBuilder.post(RequestBody.create(body, MEDIA_TYPE_JSON));
        return makeRequest(api, requestBuilder.build());
    }

    @Override
    public RawResponse post(String api, List<NameValuePair> query, List<NameValuePair> form) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        Request.Builder requestBuilder = prepareRequestBuilder(api, query);
        List<NameValuePair> mergedForm = mergeQuery(form, apiInfo.getForm());
        FormBody.Builder bodyBuilder = new FormBody.Builder();
        for (NameValuePair pair : mergedForm) {
            bodyBuilder.add(pair.getName(), pair.getValue());
        }


        return makeRequest(api, requestBuilder.post(bodyBuilder.build()).build());
    }

    private RawResponse makeRequest(String api, Request request) {
        OkHttpClient client;
        Response response = null;
        try {
            client = getHttpClient();
            if (client == null) {
                return new RawResponse(null, SdkError.UNKNOWN.getNumber(), new IllegalStateException(""));
            }

            Call call = client.newCall(request);
            response = call.execute();
            ResponseBody body = response.body();
            byte[] bytes = null;
            int statusCode = response.code();
            if (statusCode >= 300) {
                if (body != null) {
                    return new RawResponse(null, SdkError.EHTTP.getNumber(), new Exception(body.string()));
                }
            }
            if (body != null) {
                bytes = body.bytes();
            }
            return new RawResponse(bytes, SdkError.SUCCESS.getNumber(), null);
        } catch (Exception e) {
            e.printStackTrace();
            return new RawResponse(null, SdkError.EHTTP.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.EHTTP)));
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }

    private Request.Builder prepareRequestBuilder(String api, List<NameValuePair> params) {
        Request.Builder requestBuilder = new Request.Builder();
        ApiInfo apiInfo = apiInfoList.get(api);

        HttpUrl.Builder urlBuilder = new HttpUrl.Builder();

        Collection<Header> mergedH = mergeHeader(serviceInfo.getHeader(), apiInfo.getHeader());
        for (Header header : mergedH) {
            requestBuilder.addHeader(header.getName(), header.getValue());
        }
        List<NameValuePair> mergedNV = mergeQuery(params, apiInfo.getQuery());


        urlBuilder.scheme(serviceInfo.getScheme());
        urlBuilder.host(serviceInfo.getHost());
        urlBuilder.encodedPath(apiInfo.getPath());
        for (NameValuePair pair : mergedNV) {
            urlBuilder.addQueryParameter(pair.getName(), pair.getValue());
        }

        requestBuilder.url(urlBuilder.build());
        return requestBuilder;
    }

    private Collection<Header> mergeHeader(List<Header> header1, List<Header> header2) {
        Set<Header> set = new HashSet<>();
        if (header1 != null) {
            set.addAll(header1);
        }
        if (header2 != null) {
            set.addAll(header2);
        }
        return set;
    }

    private List<NameValuePair> mergeQuery(List<NameValuePair> query1, List<NameValuePair> query2) {
        List<NameValuePair> res = new ArrayList<NameValuePair>();
        if (query1 != null) {
            res.addAll(query1);
        }
        if (query2 != null) {
            res.addAll(query2);
        }
        return res;
    }

    @Override
    public void setClientNoReuse() {
        this.httpClient = null;
    }

    @Override
    public String getAccessKey() {
        return serviceInfo.getCredentials().getAccessKeyID();
    }

    @Override
    public void setAccessKey(String accessKey) {
        serviceInfo.getCredentials().setAccessKeyID(accessKey);
    }

    @Override
    public String getSecretKey() {
        return serviceInfo.getCredentials().getSecretAccessKey();
    }

    @Override
    public void setSecretKey(String secretKey) {
        serviceInfo.getCredentials().setSecretAccessKey(secretKey);
    }

    @Override
    public String getSessionToken() {
        return serviceInfo.getCredentials().getSessionToken();
    }

    @Override
    public void setSessionToken(String sessionToken) {
        serviceInfo.getCredentials().setSessionToken(sessionToken);
    }

    @Override
    public void setRegion(String region) {
        serviceInfo.getCredentials().setRegion(region);
    }


    @Override
    public String getRegion() {
        return serviceInfo.getCredentials().getRegion();
    }

    @Override
    public void setHost(String host) {
        serviceInfo.setHost(host);
    }

    @Override
    public void setScheme(String scheme) {
        serviceInfo.setScheme(scheme);
    }

    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    @Override
    public void setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    @Override
    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public Map<String, ApiInfo> getApiInfoList() {
        return apiInfoList;
    }

    public ISignerV4 getISigner() {
        return ISigner;
    }

    @Override
    public SecurityToken2 signSts2(Policy inlinePolicy, long expire) throws Exception {
        SecurityToken2 sts2 = new SecurityToken2();
        sts2.setAccessKeyId(Sts2Utils.generateAccessKeyId("AKTP"));
        sts2.setSecretAccessKey(Sts2Utils.generateSecretKey());

        Date now = new Date();
        Date expireTime = new Date(now.getTime() + expire);
        sts2.setCurrentTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(now));
        sts2.setExpiredTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(expireTime));

        InnerToken innerToken = Sts2Utils.createInnerToken(serviceInfo.getCredentials(), sts2, inlinePolicy, expireTime.getTime() / 1000);

        String sessionToken = "STS2" + Base64.encodeBase64String(JSON.toJSONString(innerToken).getBytes());
        sts2.setSessionToken(sessionToken);
        return sts2;
    }


}
