package com.volcengine.service.sms;

import com.volcengine.helper.Const;
import com.volcengine.http.ClientConfiguration;
import lombok.Data;
import org.apache.http.HttpHost;



@Data
public class SmsServiceInfoConfig {
    /**
     * 可以设置/不设置默认5000
     */
    private int connectionTimeout;
    /**
     * 可以设置/不设置默认5000
     */
    private int socketTimeout;
    /**
     * 可以设置/不设置默认https
     */
    private String scheme;

    /**
     * 可以设置/不设置默认sms.volcengineapi.com
     */
    private String host;

    /**
     * 必须设置
     */
    private String accessKey;

    /**
     * 必须设置
     */
    private String secretAccessKey;

    /**
     * 可以设置/不设置，默认cn-north-1
     */
    private String region;

    /**
     * 可以设置/不设置
     */
    private HttpHost proxy;

    public SmsServiceInfoConfig(){

    }
    public SmsServiceInfoConfig(String ak,String sk){
                this.setAccessKey(ak)
                .setSecretAccessKey(sk)
                .setHost("sms.volcengineapi.com")
                .setRegion(Const.REGION_CN_NORTH_1)
                .setScheme(Const.HTTPS)
                .setConnectionTimeout(ClientConfiguration.DEFAULT_CONNECTION_TIMEOUT)
                .setSocketTimeout(ClientConfiguration.DEFAULT_SOCKET_TIMEOUT);
    }

    public SmsServiceInfoConfig setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    public SmsServiceInfoConfig setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
        return this;
    }


    public SmsServiceInfoConfig setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }


    public SmsServiceInfoConfig setHost(String host) {
        this.host = host;
        return this;
    }


    public SmsServiceInfoConfig setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }


    public SmsServiceInfoConfig setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    public SmsServiceInfoConfig setRegion(String region) {
        this.region = region;
        return this;
    }

    public SmsServiceInfoConfig setProxy(HttpHost proxy) {
        this.proxy = proxy;
        return this;
    }
}
