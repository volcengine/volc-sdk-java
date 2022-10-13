package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleMGetVideoRequest;
import com.volcengine.model.response.ArticleMGetVideoResponse;
import com.volcengine.service.cms.CmsApiService;

import java.util.ArrayList;
import java.util.List;

public class MGetVideoDemo {
    public static void main(String[] args) {
        CmsApiService apiService = Instance.getApiInstance();

        ArticleMGetVideoRequest.GroupVideo groupVideo = new ArticleMGetVideoRequest.GroupVideo();
        // set group id here
        groupVideo.setGroupId(0L);
        // set vid here
        groupVideo.setVid("");

        ArticleMGetVideoRequest request = new ArticleMGetVideoRequest();
        List<ArticleMGetVideoRequest.GroupVideo> groupVideos = new ArrayList<>();
        groupVideos.add(groupVideo);
        request.setGroupVideos(groupVideos);

        try {
            ArticleMGetVideoResponse response = apiService.mGetVideoByVids(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
