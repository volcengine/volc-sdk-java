package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CommentConfig;
import com.volcengine.model.beans.livesaas.ProductCard;
import lombok.Data;


@Data
public class UpdateActivityCommentConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "CommentConfig")
    CommentConfig CommentConfig;
}