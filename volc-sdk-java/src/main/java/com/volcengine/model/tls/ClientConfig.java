package com.volcengine.model.tls;

import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import lombok.Data;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

import java.util.ArrayList;
import java.util.HashMap;

import static com.volcengine.model.tls.Const.TLS;

@Data
public class ClientConfig {
    String endpoint;
    String accessKeyId;
    String accessKeySecret;
    String securityToken;
    String region;

    public ClientConfig(String endPoint, String region, String accessKeyId, String accessKeySecret, String securityToken
    ) {
        this.endpoint = endPoint;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
        this.region = region;
    }

    public ClientConfig(String endPoint, String region, String accessKeyId, String accessKeySecret) {
        this(endPoint, region, accessKeyId, accessKeySecret, null);
    }

    public static ServiceInfo initServiceInfo(ClientConfig config) {
        String endPoint = config.getEndpoint().toLowerCase();
        String[] url = endPoint.split("\\/\\/");
        String schema = endPoint.startsWith(com.volcengine.helper.Const.HTTPS) ?
                com.volcengine.helper.Const.HTTPS : com.volcengine.helper.Const.HTTP;
        return new ServiceInfo(
                new HashMap<String, Object>() {
                    {
                        put(com.volcengine.helper.Const.CONNECTION_TIMEOUT,
                                com.volcengine.model.tls.Const.CONNECTION_TIMEOUT_MS);
                        put(com.volcengine.helper.Const.SOCKET_TIMEOUT,
                                com.volcengine.model.tls.Const.SOCKET_TIMEOUT_MS);
                        put(com.volcengine.helper.Const.Scheme, schema);
                        put(com.volcengine.helper.Const.Host, url[1]);
                        put(com.volcengine.helper.Const.Header, new ArrayList<Header>() {
                            {
                                add(new BasicHeader(com.volcengine.helper.Const.ACCEPT,
                                        com.volcengine.helper.Const.ACCEPT_ALL));
                                add(new BasicHeader(com.volcengine.helper.Const.ACCEPT_ENCODING,
                                        com.volcengine.helper.Const.GZIP_DEFLATE_BR));
                                add(new BasicHeader(com.volcengine.model.tls.Const.REGION, config.getRegion()));
                            }
                        });
                        put(com.volcengine.helper.Const.Credentials, new Credentials(config.getRegion(), TLS));
                    }
                }
        );
    }

    public void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) {
        setAccessKeyId(accessKey);
        setAccessKeySecret(secretKey);
        setSecurityToken(securityToken);
    }
}
