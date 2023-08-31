package com.volcengine.service.sms;

import com.volcengine.helper.Const;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import lombok.Data;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.message.BasicHeader;

import java.util.*;

import static com.volcengine.helper.Const.*;

@Data
public class SmsServiceInfo {
    private int connectionTimeout;
    private int socketTimeout;
    private String scheme;
    private String host;
    private List<Header> header;
    private Credentials credentials;

    private String ak;

    private String sk;

    private HttpHost proxy;

    public SmsServiceInfo(SmsServiceInfoConfig config) {
        this.connectionTimeout = config.getConnectionTimeout();
        this.socketTimeout = config.getSocketTimeout();
        this.scheme = Objects.equals(config.getScheme(), "") ? HTTPS : config.getScheme();
        this.host = config.getHost();
        this.header = new ArrayList<Header>() {
            {
                add(new BasicHeader("Accept", "application/json"));
            }
        };
        this.credentials = new Credentials(config.getRegion(), "volcSMS");
        this.credentials.setSecretAccessKey(config.getSecretAccessKey());
        this.credentials.setAccessKeyID(config.getAccessKey());
        this.proxy = config.getProxy();
        this.ak = config.getAccessKey();
        this.sk = config.getSecretAccessKey();
    }

    public ServiceInfo GetServiceInfo() {
        Map<String, Object> param = new HashMap<>();
        param.put(Const.CONNECTION_TIMEOUT, this.getConnectionTimeout());
        param.put(Const.SOCKET_TIMEOUT, this.getSocketTimeout());
        param.put(Const.Scheme, this.getScheme());
        param.put(Const.Host, this.getHost());
        param.put(Const.Header, this.getHeader());
        param.put(Const.Credentials, this.getCredentials());
        return new ServiceInfo(param);
    }
}
