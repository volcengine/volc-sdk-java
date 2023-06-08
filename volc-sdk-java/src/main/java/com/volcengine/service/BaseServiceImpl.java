package com.volcengine.service;

import com.alibaba.fastjson.JSON;
import com.volcengine.auth.ISignerV4;
import com.volcengine.auth.impl.SignerV4Impl;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.http.ClientConfiguration;
import com.volcengine.http.HttpClientFactory;
import com.volcengine.http.IdleConnectionMonitorThread;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.sts2.InnerToken;
import com.volcengine.model.sts2.Policy;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.util.EncodeUtil;
import com.volcengine.util.NameValueComparator;
import com.volcengine.util.Sts2Utils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.volcengine.model.tls.Const.LZ4;

public abstract class BaseServiceImpl implements IBaseService {


    private static final Log LOG = LogFactory.getLog(BaseServiceImpl.class);
    private String VERSION;

    protected ServiceInfo serviceInfo;
    protected Map<String, ApiInfo> apiInfoList;
    private HttpClient httpClient;
    private ISignerV4 ISigner;
    private int socketTimeout;
    private int connectionTimeout;

    private IdleConnectionMonitorThread monitorThread;

    private Credentials credentials;


    private BaseServiceImpl() {
    }

    public BaseServiceImpl(ServiceInfo info, HttpHost proxy, Map<String, ApiInfo> apiInfoList) {
        this.serviceInfo = info;
        this.apiInfoList = apiInfoList;
        this.ISigner = new SignerV4Impl();

        HttpClientFactory.ClientInstance clientInstance = HttpClientFactory.create(new ClientConfiguration(), proxy);
        this.httpClient = clientInstance.getHttpClient();
        this.monitorThread = clientInstance.getDaemonThread();
        this.credentials = new Credentials();
        this.credentials.setService(info.getCredentials().getService());
        this.credentials.setRegion(info.getCredentials().getRegion());
        this.credentials.setAccessKeyID(info.getCredentials().getAccessKeyID());
        this.credentials.setSecretAccessKey(info.getCredentials().getSecretAccessKey());
        this.credentials.setSessionToken(info.getCredentials().getSessionToken());

        init(info);
    }

    public BaseServiceImpl(ServiceInfo info, Map<String, ApiInfo> apiInfoList) {
        this(info, null, apiInfoList);
    }

    public void destroy() {
        if (monitorThread == null) {
            return;
        }
        try {
            monitorThread.shutdown();
        }catch (Error e) {
            LOG.error("Try to destroy monitor thread failed", e);
        } finally {
            monitorThread = null;
        }
    }


    private void init(ServiceInfo info) {
        String accessKey = System.getenv(Const.ACCESS_KEY);
        String secretKey = System.getenv(Const.SECRET_KEY);

        if (accessKey != null && !accessKey.equals("") && secretKey != null && !secretKey.equals("")) {
            this.credentials.setAccessKeyID(accessKey);
            this.credentials.setSecretAccessKey(secretKey);
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
                        this.credentials.setAccessKeyID(credentials.getAccessKeyID());
                    }
                    if (credentials.getSecretAccessKey() != null) {
                        this.credentials.setSecretAccessKey(credentials.getSecretAccessKey());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    LOG.error("Read file " + file.getName() + " fail.");
                    this.VERSION = "";
                }
            }
        }

        final Properties properties = new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("com/volcengine/version"));
            this.VERSION = properties.getProperty("version");
        } catch (IOException e) {
            LOG.error("Read file version file fail.");
        }
    }

    @Override
    public String getSignUrl(String api, List<NameValuePair> params) throws Exception {
        ApiInfo apiInfo = apiInfoList.get(api);

        if (apiInfo == null) {
            throw new Exception(SdkError.getErrorDesc(SdkError.ENOAPI));
        }

        List<NameValuePair> mergedNV = mergeQuery(params, apiInfo.getQuery());

        SignableRequest request = new SignableRequest();
        URIBuilder builder = request.getUriBuilder();

        request.setMethod(apiInfo.getMethod().toUpperCase());
        builder.setScheme(serviceInfo.getScheme());
        builder.setHost(serviceInfo.getHost());
        builder.setPath(apiInfo.getPath());
        builder.setParameters(mergedNV);

        return ISigner.signUrl(request, this.credentials);
    }

    @Override
    public RawResponse query(String api, List<NameValuePair> params) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        SignableRequest request = prepareRequest(api, params);
        return makeRequest(api, request);
    }

    @Override
    public boolean put(String url, String filePath, Map<String, String> headers) {
        HttpEntity httpEntity = new FileEntity(new File(filePath));
        return doPut(url, httpEntity, headers);
    }

    @Override
    public boolean putData(String url, byte[] data, Map<String, String> headers) {
        HttpEntity httpEntity = new ByteArrayEntity(data);
        return doPut(url, httpEntity, headers);
    }

    public HttpResponse putDataWithResponse(String url, byte[] data, Map<String, String> headers) {
        HttpPut httpPut = new HttpPut(url);
        HttpEntity httpEntity = new ByteArrayEntity(data);
        if (headers != null && headers.size() > 0) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpPut.setHeader(entry.getKey(), entry.getValue());
            }
        }
        httpPut.setEntity(httpEntity);
        HttpResponse response = null;
        try {
            HttpClient client;
            if (getHttpClient() != null) {
                client = getHttpClient();
            } else {
                client = HttpClients.createDefault();
            }
            return client.execute(httpPut);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                EntityUtils.consumeQuietly(response.getEntity());
            }
        }
        return null;
    }

    public boolean putData(String url, InputStream inputStream, Map<String, String> headers) {
        HttpEntity httpEntity = new InputStreamEntity(inputStream);
        return doPut(url, httpEntity, headers);
    }

    public HttpResponse putDataWithResponse(String url, InputStream inputStream, Map<String, String> headers) {
        HttpPut httpPut = new HttpPut(url);
        HttpEntity httpEntity = new InputStreamEntity(inputStream);
        if (headers != null && headers.size() > 0) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpPut.setHeader(entry.getKey(), entry.getValue());
            }
        }
        httpPut.setEntity(httpEntity);
        HttpResponse response = null;
        try {
            HttpClient client;
            if (getHttpClient() != null) {
                client = getHttpClient();
            } else {
                client = HttpClients.createDefault();
            }
            return client.execute(httpPut);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                EntityUtils.consumeQuietly(response.getEntity());
            }
        }
        return null;
    }

    private boolean doPut(String url, HttpEntity entity, Map<String, String> headers) {
        HttpPut httpPut = new HttpPut(url);
        if (headers != null && headers.size() > 0) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpPut.setHeader(entry.getKey(), entry.getValue());
            }
        }
        httpPut.setEntity(entity);
        HttpResponse response = null;
        try {
            HttpClient client;
            if (getHttpClient() != null) {
                client = getHttpClient();
            } else {
                client = HttpClients.createDefault();
            }
            response = client.execute(httpPut);
            if (response.getStatusLine().getStatusCode() == 200) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                EntityUtils.consumeQuietly(response.getEntity());
            }
        }
        return false;
    }

    @Override
    public RawResponse json(String api, List<NameValuePair> params, String body) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        SignableRequest request = prepareRequest(api, params);
        request.setHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(body, "utf-8"));
        return makeRequest(api, request);
    }

    @Override
    public RawResponse post(String api, List<NameValuePair> query, List<NameValuePair> form) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        SignableRequest request = prepareRequest(api, query);
        request.setHeader("Content-Type", "application/x-www-form-urlencoded");
        List<NameValuePair> mergedForm = mergeQuery(form, apiInfo.getForm());

        try {
            Collections.sort(mergedForm, NameValueComparator.INSTANCE);
            request.setEntity(new UrlEncodedFormEntity(mergedForm));
        } catch (Exception e) {
            e.printStackTrace();
            return new RawResponse(null, SdkError.EENCODING.getNumber(), e);
        }
        return makeRequest(api, request);
    }

    private RawResponse makeRequest(String api, SignableRequest request) {
        try {
            ISigner.sign(request, this.credentials);
        } catch (Exception e) {
            e.printStackTrace();
            return new RawResponse(null, SdkError.ESIGN.getNumber(), e);
        }

        HttpClient client;
        HttpResponse response = null;
        try {
            if (getHttpClient() != null) {
                client = getHttpClient();
            } else {
                client = HttpClients.createDefault();
            }
            response = client.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            Header[] responseHeaders = response.getAllHeaders();
            if (statusCode >= 300) {
                String msg = SdkError.getErrorDesc(SdkError.EHTTP);
                byte[] bytes = EntityUtils.toByteArray(response.getEntity());
                if (bytes != null && bytes.length > 0) {
                    msg = new String(bytes, StandardCharsets.UTF_8);
                }
                return new RawResponse(null, SdkError.EHTTP.getNumber(), new Exception(msg), responseHeaders, statusCode);
            }
            byte[] bytes = EntityUtils.toByteArray(response.getEntity());
            return new RawResponse(bytes, SdkError.SUCCESS.getNumber(), null, responseHeaders);
        } catch (Exception e) {
            e.printStackTrace();
            if (response != null) {
                EntityUtils.consumeQuietly(response.getEntity());
            }
            return new RawResponse(null, SdkError.EHTTP.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.EHTTP), e));
        }
    }

    private SignableRequest prepareRequest(String api, List<NameValuePair> params) {
        ApiInfo apiInfo = apiInfoList.get(api);

        int socketTimeout = getSocketTimeout(serviceInfo.getSocketTimeout(), apiInfo.getSocketTimeout());
        int connectionTimeout = getConnectionTimeout(serviceInfo.getConnectionTimeout(), apiInfo.getConnectionTimeout());
        SignableRequest request = new SignableRequest();
        request.setMethod(apiInfo.getMethod().toUpperCase());

        Collection<Header> mergedH = mergeHeader(serviceInfo.getHeader(), apiInfo.getHeader());
        for (Header header : mergedH) {
            request.setHeader(header);
        }
        request.setHeader("User-Agent", "volc-sdk-java/v" + this.VERSION);
        List<NameValuePair> mergedNV = mergeQuery(params, apiInfo.getQuery());
        URIBuilder builder = request.getUriBuilder();

        builder.setScheme(serviceInfo.getScheme());
        builder.setHost(serviceInfo.getHost());
        builder.setPath(apiInfo.getPath());
        //修复空参数导致url构造多了？的404错误
        if (!mergedNV.isEmpty())
            builder.setParameters(mergedNV);

        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectionTimeout).build();
        request.setConfig(requestConfig);

        return request;
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


    private int getConnectionTimeout(int serviceTimeout, int apiTimeout) {
        int timeout = 5000;
        if (serviceTimeout != 0) {
            timeout = serviceTimeout;
        }
        if (apiTimeout != 0) {
            timeout = apiTimeout;
        }
        if (connectionTimeout != 0) {
            timeout = connectionTimeout;
        }
        return timeout;
    }

    private int getSocketTimeout(int serviceTimeout, int apiTimeout) {
        int timeout = 5000;
        if (serviceTimeout != 0) {
            timeout = serviceTimeout;
        }
        if (apiTimeout != 0) {
            timeout = apiTimeout;
        }
        if (socketTimeout != 0) {
            timeout = socketTimeout;
        }
        return timeout;
    }

    @Override
    public String getAccessKey() {
        return this.credentials.getAccessKeyID();
    }

    @Override
    public void setAccessKey(String accessKey) {
        this.credentials.setAccessKeyID(accessKey);
    }

    @Override
    public String getSecretKey() {
        return this.credentials.getSecretAccessKey();
    }

    @Override
    public void setSecretKey(String secretKey) {
        this.credentials.setSecretAccessKey(secretKey);
    }

    @Override
    public String getSessionToken() {
        return this.credentials.getSessionToken();
    }

    @Override
    public void setSessionToken(String sessionToken) {
        this.credentials.setSessionToken(sessionToken);
    }

    @Override
    public void setRegion(String region) {
        this.credentials.setRegion(region);
    }


    @Override
    public String getRegion() {
        return this.credentials.getRegion();
    }

    @Override
    public void setHost(String host) {
        serviceInfo.setHost(host);
    }

    @Override
    public void setScheme(String scheme) {
        serviceInfo.setScheme(scheme);
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }

    @Override
    public void setHttpClient(HttpClient httpClient) {
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
    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    @Override
    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
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

        InnerToken innerToken = Sts2Utils.createInnerToken(this.credentials, sts2, inlinePolicy, expireTime.getTime() / 1000);

        String sessionToken = "STS2" + Base64.encodeBase64String(JSON.toJSONString(innerToken).getBytes());
        sts2.setSessionToken(sessionToken);
        return sts2;
    }

    @Override
    public RawResponse proto(String api, List<NameValuePair> params, Map<String, String> header, byte[] body, String compressType) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        SignableRequest request = prepareRequest(api, params);
        request.setHeader(Const.CONTENT_TYPE, Const.APPLICATION_X_PROTOBUF);
        if (header != null && header.size() > 0) {
            header.forEach(request::setHeader);
        }
        byte[] compressedData = body.clone();
        if (compressType != null && compressType.equalsIgnoreCase(LZ4)) {
            compressedData = EncodeUtil.lz4Compress(body);
        }
        if (compressedData != null && compressedData.length > 0)
            request.setEntity(new ByteArrayEntity(compressedData));
        return makeRequest(api, request);
    }
}
