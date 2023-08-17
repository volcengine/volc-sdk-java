package com.volcengine.service.stream.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.SearchGroupResponse;
import com.volcengine.model.stream.SearchRequest;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.MonitorService;
import com.volcengine.service.stream.SearchConfig;
import com.volcengine.service.stream.SearchService;
import org.apache.http.HttpHost;

public class SearchServiceImpl extends BaseServiceImpl implements SearchService {
    static HttpHost Mproxy;
    //单例
    private volatile static SearchServiceImpl instance = null;
    boolean needMonitor;

    private SearchServiceImpl() {
        super(SearchConfig.serviceInfo, SearchConfig.apiInfoList);
        needMonitor = true;
    }

    private SearchServiceImpl(HttpHost proxy) {
        super(SearchConfig.serviceInfo, proxy, SearchConfig.apiInfoList);
        needMonitor = true;
    }

    public static SearchServiceImpl getInstance() {
        if (instance == null) {
            synchronized (SearchServiceImpl.class) {
                if (instance == null) {
                    instance = new SearchServiceImpl();
                }
            }
        }
        return instance;
    }

    public static SearchServiceImpl getInstance(HttpHost proxy) {
        if (instance == null) {
            synchronized (SearchServiceImpl.class) {
                if (instance == null) {
                    instance = new SearchServiceImpl(proxy);
                    Mproxy = proxy;
                }
            }
        }
        return instance;
    }

    @Override
    public SearchGroupResponse searchGroup(SearchRequest request) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.ContentSearch, Utils.mapToPairList(Utils.paramsToMap(request)));
        long end = System.currentTimeMillis();

        sendToMonitor(instance, request.getPartner(), request.getAccessToken(),
                Const.ContentSearch, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), SearchGroupResponse.class);
    }

    @Override
    public void SetNeedMonitor(boolean open) {
        needMonitor = open;
    }

    private void sendToMonitor(SearchService searchService, String partner, String accessToken, String action, int httpCode, int topRespCode, byte[] respData, long latency) {
        if (needMonitor) {
            MonitorService monitorService = MonitorServiceImpl.getInstance(searchService.getAccessKey(), searchService.getSecretKey(), Mproxy);
            monitorService.monitor(partner, "search", accessToken, action, httpCode, topRespCode, respData, latency);
        }
    }
}
