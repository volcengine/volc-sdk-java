package com.volcengine.model.tls;

import com.volcengine.model.ServiceInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.TLSLogClientImpl;
import com.volcengine.service.tls.TLSHttpUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class ClientBuilder {
    public static final String HTTP = "http";
    private static volatile TLSLogClient client;
    private final static Log log = LogFactory.getLog(ClientBuilder.class);

    public ClientBuilder() {
    }

    public static TLSLogClient newClient(ClientConfig config) throws LogException {
        if (config == null || config.getRegion() == null || config.getAccessKeySecret() == null ||
                config.getAccessKeyId() == null || config.getEndpoint() == null ||
                !config.getEndpoint().toLowerCase().startsWith(HTTP)) {
            log.error("client config null error");
            throw new LogException("", "client config null error", null);
        }
        //init config for service
        ServiceInfo serviceInfo = ClientConfig.initServiceInfo(config);
        if (client == null) {
            synchronized (ClientBuilder.class) {
                if (client == null) {
                    TLSHttpUtil tlsHttpUtil = new TLSHttpUtil(serviceInfo, TLSHttpUtil.API_INFO_LIST);
                    tlsHttpUtil.setAccessKey(config.getAccessKeyId());
                    tlsHttpUtil.setSecretKey(config.getAccessKeySecret());
                    tlsHttpUtil.setSessionToken(config.getSecurityToken());
                    tlsHttpUtil.setSocketTimeout(60000);
                    tlsHttpUtil.setConnectionTimeout(60000);
                    client = new TLSLogClientImpl(tlsHttpUtil, config);
                }
            }
        }
        return client;
    }

}
