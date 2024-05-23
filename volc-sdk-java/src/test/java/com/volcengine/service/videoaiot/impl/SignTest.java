package com.volcengine.service.videoaiot.impl;

import com.volcengine.auth.ISignerV4;
import com.volcengine.auth.impl.SignerV4Impl;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.SignableRequest;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class SignTest {


    @Test
    public void testSigner() throws Exception {
        String ak = System.getenv("AK");
        String sk = System.getenv("SK");

        Signer signer = new Signer(ak, sk, System.getenv("Host"), "https", null);

        signer.putAPI("GetStream", "GET", "2021-01-01");

        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", ""));
            }
        };

        SignableRequest r = signer.sign("GetStream", nameValuePairs, "");
        for (Header h : r.getAllHeaders()) {
            System.out.println(h.getName() + ":" + h.getValue());
        }
        RawResponse invoke = invoke(r);
        if (invoke.getException() != null) {
            throw invoke.getException();
        } else {
            System.out.println(new String(invoke.getData()));
        }
    }

    public RawResponse invoke(SignableRequest request) {
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = null;
        try {
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

    public static class Signer {
        ISignerV4 ISigner;
        Map<String, ApiInfo> apiInfoMap = new HashMap<>();

        Credentials c = new Credentials();

        ServiceInfo serviceInfo;

        public Signer(String AK, String SK, String host, String schema, Map<String, ApiInfo> apiInfoMap) {
            this.ISigner = new SignerV4Impl();
            this.apiInfoMap = apiInfoMap;
            final Credentials c = new Credentials(Const.REGION_CN_NORTH_1, "aiotvideo");
            this.c = c;
            this.c.setAccessKeyID(AK);
            this.c.setSecretAccessKey(SK);
            this.serviceInfo = new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, schema);
                            put(Const.Host, host);
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, c);
                        }
                    }
            );
        }

        public void putAPI(String action, String method, String version) {
            if (this.apiInfoMap == null) {
                this.apiInfoMap = new HashMap<>();
            }
            ApiInfo a = new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, method);
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", action));
                                    add(new BasicNameValuePair("Version", version));
                                }
                            });
                        }
                    }
            );
            this.apiInfoMap.put(action, a);
        }

        public SignableRequest sign(String action, List<NameValuePair> params, String jsonBody) throws Exception {
            ApiInfo info = this.apiInfoMap.get(action);
            if (info == null) {
                throw new RuntimeException("api not found");
            }
            SignableRequest request = prepareRequest(info, params, serviceInfo);
            request.setHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(jsonBody, "utf-8"));
            this.ISigner.sign(request, this.c);

            return request;
        }


        protected SignableRequest prepareRequest(ApiInfo apiInfo, List<NameValuePair> params, ServiceInfo serviceInfo) {
            SignableRequest request = new SignableRequest();
            request.setMethod(apiInfo.getMethod().toUpperCase());

            Collection<Header> mergedH = mergeHeader(serviceInfo.getHeader(), apiInfo.getHeader());
            for (Header header : mergedH) {
                request.setHeader(header);
            }
            request.setHeader("User-Agent", "volc-sdk-java/v" + "VOP");
            List<NameValuePair> mergedNV = mergeQuery(params, apiInfo.getQuery());
            URIBuilder builder = request.getUriBuilder();

            builder.setScheme(serviceInfo.getScheme());
            builder.setHost(serviceInfo.getHost());
            builder.setPath(apiInfo.getPath());
            //修复空参数导致url构造多了？的404错误
            if (!mergedNV.isEmpty())
                builder.setParameters(mergedNV);

            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(serviceInfo.getSocketTimeout()).setConnectTimeout(serviceInfo.getConnectionTimeout()).build();
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
    }

}
