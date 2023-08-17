package com.volcengine.model.tls;

import com.volcengine.model.ServiceInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.service.tls.TLSHttpUtil;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.TLSLogClientImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class ClientBuilder {
    public static final String HTTP = "http";
    private static volatile TLSLogClient client;
    private final static Log log = LogFactory.getLog(ClientBuilder.class);

    public ClientBuilder() {
    }

    public static TLSLogClient newClient(ClientConfig config) throws LogException {
        if (config == null) {
            log.error("client config null error");
            throw new LogException("", "client config null error", null);
        }
        if (config.getRegion() == null) {
            log.error("client config region null error");
            throw new LogException("", "client config region null error", null);
        }
        if (config.getAccessKeySecret() == null) {
            log.error("client config accessKeySecret null error");
            throw new LogException("", "client config accessKeySecret null error", null);
        }
        if (config.getAccessKeyId() == null) {
            log.error("client config accessKeyId null error");
            throw new LogException("", "client config accessKeyId null error", null);
        }
        if (config.getEndpoint() == null) {
            log.error("client config endpoint null error");
            throw new LogException("", "client config endpoint null error", null);
        }
        if (!config.getEndpoint().toLowerCase().startsWith(HTTP)) {
            log.error("client config endpoint should start with http:// or https://");
            throw new LogException("", "client config endpoint should start with http:// or https://", null);
        }

        if (config.apiVersion == null) {
            log.error("client config api version null error");
            throw new LogException("", "client config api version null error", null);
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
