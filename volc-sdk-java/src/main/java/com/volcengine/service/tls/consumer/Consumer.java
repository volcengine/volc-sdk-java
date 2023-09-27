package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.exception.LogException;

public interface Consumer {
    void start() throws LogException;
    void stop() throws InterruptedException;
    void resetAccessKeyToken(String accessKeyID, String accessKeySecret, String securityToken);
}
