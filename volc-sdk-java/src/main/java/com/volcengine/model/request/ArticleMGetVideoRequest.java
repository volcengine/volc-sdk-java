package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ArticleMGetVideoRequest {
    @JSONField(name = "GroupVideos")
    List<GroupVideo> groupVideos;

    @Data
    public static class GroupVideo {
        @JSONField(name = "GroupId")
        Long groupId;
        @JSONField(name = "Vid")
        String vid;
    }
}
