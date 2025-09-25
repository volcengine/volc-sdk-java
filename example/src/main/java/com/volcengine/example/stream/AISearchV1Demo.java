package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.AISearchResponse;
import com.volcengine.model.stream.AISearchRequest;
import com.volcengine.service.stream.SearchService;
import com.volcengine.service.stream.impl.SearchServiceImpl;

public class AISearchV1Demo {
    public static void main(String[] args) {
        SearchService searchService = SearchServiceImpl.getInstance();
        searchService.setAccessKey("ak");
        searchService.setSecretKey("sk");
        searchService.SetNeedMonitor(true);

        AISearchRequest request = new AISearchRequest();
        request.setPartner("fake partner");
        request.setAccessToken("fake token");
        request.setKeyword("黄金");
        request.setNeedVideoDetail("1");
        request.setOffset(0);
        request.setCount(10);
        request.setSearchSource("feed_search");

        try {
            AISearchResponse response = searchService.aiSearchV1(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
