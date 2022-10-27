package com.volcengine.service.stream;

import com.volcengine.service.IBaseService;

public interface MonitorService extends IBaseService {

    void monitor(String partner, String category, String accessToken, String action, int httpCode, int topRespCode, byte[] respData, long latency);
}
