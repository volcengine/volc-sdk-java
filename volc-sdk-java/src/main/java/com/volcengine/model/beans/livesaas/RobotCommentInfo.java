package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RobotCommentInfo {
    @JSONField(name = "Comment")
    String Comment;
    @JSONField(name = "Nickname")
    String Nickname;
}