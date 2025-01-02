package com.volcengine.service.vikingDB;

import lombok.Getter;

public class BaseService {
    @Getter
    private static final VikingDBService service;

    static {
        String host = System.getenv("host");
        String region = System.getenv("region");
        String scheme = System.getenv("scheme");
        String ak = System.getenv("ak");
        String sk = System.getenv("sk");
        try {
            service = new VikingDBService(host, region, ak, sk, scheme);
        } catch (Exception e) {
            throw new RuntimeException("failed to init VikingDBService", e);
        }
    }

}
