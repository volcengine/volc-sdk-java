package com.volcengine.model.beans;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionsCaptionInput {
    @JSONField(name = "Title")
    String title;
    @JSONField(name = "Format")
    String format;
    @JSONField(name = "Vid")
    String vid;
    @JSONField(name = "Fid")
    String fid;
    @JSONField(name = "Language")
    String language;
    @JSONField(name = "StoreUri")
    String storeUri;
    @JSONField(name = "Source")
    String source;
    @JSONField(name = "Tag")
    String tag;
    @JSONField(name = "AutoPublish")
    boolean autoPublish;
    @JSONField(name = "ActionType")
    String actionType;
}