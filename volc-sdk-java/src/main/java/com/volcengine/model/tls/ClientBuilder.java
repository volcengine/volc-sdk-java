package com.volcengine.model.tls;

import com.volcengine.model.ServiceInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.service.tls.TLSHttpUtil;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.TLSLogClientImpl;
import com.volcengine.service.tls.TLSUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static com.volcengine.model.tls.Const.SOCKET_TIMEOUT_MS;
import static com.volcengine.model.tls.Const.CONNECTION_TIMEOUT_MS;


public class ClientBuilder {
    public static final String HTTP = "http";
    private final static Log log = LogFactory.getLog(ClientBuilder.class);

    public ClientBuilder() {
    }

    public static TLSLogClient newClientWithApiKey(String endpoint, String region, String apiKey) throws LogException {
        return newClientWithApiKey(endpoint, region, apiKey, null, null, null);
    }

    public static TLSLogClient newClientWithApiKey(String endpoint, String region, String apiKey,
                                                   String accessKeyId, String accessKeySecret) throws LogException {
        return newClientWithApiKey(endpoint, region, apiKey, accessKeyId, accessKeySecret, null);
    }

    public static TLSLogClient newClientWithApiKey(String endpoint, String region, String apiKey,
                                                   String accessKeyId, String accessKeySecret,
                                                   String securityToken) throws LogException {
        ClientConfig config = new ClientConfig(endpoint, region, accessKeyId, accessKeySecret, securityToken);
        config.setApiKey(apiKey);
        return newClient(config);
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
        boolean hasApiKey = StringUtils.isNotEmpty(config.getApiKey());
        boolean hasAkSk = StringUtils.isNotEmpty(config.getAccessKeyId()) && StringUtils.isNotEmpty(config.getAccessKeySecret());
        if (!hasApiKey && config.getAccessKeySecret() == null) {
            log.error("client config accessKeySecret null error");
            throw new LogException("", "client config accessKeySecret null error", null);
        }
        if (!hasApiKey && config.getAccessKeyId() == null) {
            log.error("client config accessKeyId null error");
            throw new LogException("", "client config accessKeyId null error", null);
        }
        if (!hasApiKey && !hasAkSk) {
            log.error("client config accessKeyId/accessKeySecret missing error");
            throw new LogException("", "client config accessKeyId/accessKeySecret missing error", null);
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
        TLSHttpUtil tlsHttpUtil = new TLSHttpUtil(serviceInfo, TLSHttpUtil.API_INFO_LIST);
        tlsHttpUtil.setAccessKey(config.getAccessKeyId());
        tlsHttpUtil.setSecretKey(config.getAccessKeySecret());
        tlsHttpUtil.setSessionToken(config.getSecurityToken());
        tlsHttpUtil.setApiKey(config.getApiKey());
        tlsHttpUtil.setSocketTimeout(SOCKET_TIMEOUT_MS);
        tlsHttpUtil.setConnectionTimeout(CONNECTION_TIMEOUT_MS);
        if (config.isVerifySsl()) {
            tlsHttpUtil.setHttpClientConnectionManager(TLSUtil.createHttpClientConnectionManager(true));
        }

        TLSLogClientImpl client = new TLSLogClientImpl(tlsHttpUtil, config);
        return client;
    }

}
