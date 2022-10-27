package com.volcengine.service.stream.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.CommonPo;
import com.volcengine.model.stream.SdkMonitorRequest;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.MonitorConfig;
import com.volcengine.service.stream.MonitorService;
import com.volcengine.service.stream.StreamConfig;
import org.apache.http.HttpHost;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MonitorServiceImpl extends BaseServiceImpl implements MonitorService {
    ThreadPoolExecutor threadPool;

    private MonitorServiceImpl() {
        super(StreamConfig.serviceInfo, MonitorConfig.apiInfoList);
        int availProcessors = Runtime.getRuntime().availableProcessors();
        threadPool = new ThreadPoolExecutor(2 * availProcessors + 1, 5 * availProcessors + 1, 1000, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
    }

    private MonitorServiceImpl(HttpHost proxy) {
        super(StreamConfig.serviceInfo, proxy, MonitorConfig.apiInfoList);
        int availProcessors = Runtime.getRuntime().availableProcessors();
        threadPool = new ThreadPoolExecutor(2 * availProcessors + 1, 5 * availProcessors + 1, 1000, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
    }

    //单例
    private volatile static MonitorServiceImpl instance = null;

    public static MonitorService getInstance(String ak, String sk, HttpHost proxy) {
        if (instance == null) {
            synchronized (StreamServiceImpl.class) {
                if (instance == null) {
                    if (proxy != null) {
                        instance = new MonitorServiceImpl(proxy);
                    } else {
                        instance = new MonitorServiceImpl();
                    }
                    instance.setAccessKey(ak);
                    instance.setSecretKey(sk);
                }
            }
        }
        return instance;
    }

    @Override
    public void monitor(String partner, String category, String accessToken, String action, int httpCode, int topRespCode, byte[] respData, long latency) {
        //初始化一个request
        boolean needSendMonitor = false;
        SdkMonitorRequest req = new SdkMonitorRequest();
        req.setPartner(partner);
        req.setCategory(category);
        req.setAccessToken(accessToken);
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        if (respData != null) {
            Map<String, String> respMap = JSON.parseObject(new String(respData), new TypeReference<Map<String, String>>() {
            });
            respMap.remove("Result");
            req.setRespData(JSON.toJSONString(respMap));
            CommonPo.ResponseMetadata responseMetadata = JSONObject.parseObject(respMap.get("ResponseMetadata"), CommonPo.ResponseMetadata.class);
            if (responseMetadata != null && responseMetadata.getError() != null && responseMetadata.getError().getCodeN() != 0) { //返回error监控
                needSendMonitor = true;
            }
        }
        req.setOriginalAction(action);
        req.setHttpCode(httpCode == 0 ? 200 : httpCode);
        if (httpCode != 0) {   //httpcode监控
            needSendMonitor = true;
        }
        req.setTopRespCode(topRespCode);
        req.setLatency(latency);
        if (latency >= 800) { //接口时延大于800
            needSendMonitor = true;
        }
        if (needSendMonitor) {
            threadPool.submit(() -> {
                try {
                    RawResponse response = query(Const.SdkMonitor, Utils.mapToPairList(Utils.paramsToMap(req)));
                } catch (Exception ignored) {
                }
            });
        }
    }
}
