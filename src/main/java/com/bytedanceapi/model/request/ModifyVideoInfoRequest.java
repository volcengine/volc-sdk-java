package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ModifyVideoInfoRequest {
    @JSONField(name = "SpaceName")
    String spaceName;
    @JSONField(name = "Vid")
    String vid;
    @JSONField(name = "Info")
    UserMetaInfo info;
    @JSONField(name = "Tags")
    TagControl tags;

    @Data
    public static class UserMetaInfo {
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "Category")
        String category;
        @JSONField(name = "PosterUri")
        String posterUri;
    }

    @Data
    public static class TagControl {
        @JSONField(name = "Deletes")
        String deletes;
        @JSONField(name = "Adds")
        String adds;
    }
}
