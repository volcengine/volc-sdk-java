package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.SearchGroupResponse;
import com.volcengine.model.stream.SearchGroupResponseV2;
import com.volcengine.model.stream.SearchRequest;
import com.volcengine.service.stream.SearchService;
import com.volcengine.service.stream.impl.SearchServiceImpl;

public class SearchGroupDemoV2 {
    public static void main(String[] args) {
        SearchService searchService = SearchServiceImpl.getInstance();
        searchService.setAccessKey("ak");
        searchService.setSecretKey("sk");

        searchService.SetNeedMonitor(true);
        SearchRequest request = new SearchRequest();
        request.setPartner("server_sdk_demo_default_content");
        request.setAccessToken("31170522212716956578152898865559");
        request.setKeyword("美食");
        request.setNeedVideoDetail("1");
        request.setOffset(0);
        request.setCount(10);

        try {
            SearchGroupResponseV2 response = searchService.searchGroupV2(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
