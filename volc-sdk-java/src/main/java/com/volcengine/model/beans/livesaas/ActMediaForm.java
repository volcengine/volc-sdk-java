package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActMediaForm  {
    @JSONField(name = "Duration")
    Integer Duration;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "MediaType")
    Integer MediaType;
    @JSONField(name = "Name")
    java.lang.String Name;
    @JSONField(name = "Url")
    java.lang.String Url;
    @JSONField(name = "SourceType")
    Integer SourceType;
    @JSONField(name = "SourceId")
    Long SourceId;
    @JSONField(name = "AccountId")
    Long AccountId;
    @JSONField(name = "MediaId")
    Long MediaId;
    @JSONField(name = "Vid")
    java.lang.String Vid;
    @JSONField(name = "InteractionScript")
    ActMediaFormInteractionScript InteractionScript;


    @Data
    public static class ActMediaFormInteractionScript {
        @JSONField(name = "ScriptId")
        Long ScriptId;
        @JSONField(name = "CommentOffset")
        Integer CommentOffset;
    }
}
