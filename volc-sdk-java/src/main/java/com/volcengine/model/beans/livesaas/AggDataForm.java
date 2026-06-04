package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AggDataForm {
    @JSONField(name = "TimeStamp")
    Long TimeStamp;
    @JSONField(name = "OnlineUV")
    Long OnlineUV;
    @JSONField(name = "EnterUV")
    Long EnterUV;
    @JSONField(name = "ViewUV")
    Long ViewUV;
    @JSONField(name = "InviteUV")
    Long InviteUV;
    @JSONField(name = "ThumbUpCount")
    Long ThumbUpCount;
    @JSONField(name = "CommentCount")
    Long CommentCount;
    @JSONField(name = "ProductClickCount")
    Long ProductClickCount;
}
