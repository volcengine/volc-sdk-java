package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.SearchGroupResponse;
import com.volcengine.model.stream.SearchRequest;
import com.volcengine.service.stream.SearchService;
import com.volcengine.service.stream.impl.SearchServiceImpl;

public class SearchGroupDemo {
    public static void main(String[] args) {
        SearchService searchService = SearchServiceImpl.getInstance();
        searchService.setAccessKey("ak");
        searchService.setSecretKey("sk");

        searchService.SetNeedMonitor(true);
        SearchRequest request = new SearchRequest();
        request.setPartner("partner");
        request.setAccessToken("at");
        request.setKeyword("hello world");
        request.setNeedVideoDetail("1");
        request.setOffset(0);
        request.setCount(10);

        try {
            SearchGroupResponse response = searchService.searchGroup(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
