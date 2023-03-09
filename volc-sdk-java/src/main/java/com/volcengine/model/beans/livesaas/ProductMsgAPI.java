package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ProductMsgAPI  {
    @JSONField(name = "Index")
    Integer Index;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "DirectUrl")
    java.lang.String DirectUrl;
    @JSONField(name = "Strikethrough")
    java.lang.String Strikethrough;
    @JSONField(name = "Remark")
    String Remark;
    @JSONField(name = "Title")
    java.lang.String Title;
    @JSONField(name = "Highlight")
    java.lang.String Highlight;
    @JSONField(name = "IntroduceImage")
    java.lang.String IntroduceImage;
    @JSONField(name = "RedirectImage")
    java.lang.String RedirectImage;
    @JSONField(name = "RedirectUrl")
    java.lang.String RedirectUrl;
    @JSONField(name = "EnableStatus")
    Integer EnableStatus;
    @JSONField(name = "MiniAppDirectUrl")
    String MiniAppDirectUrl;
}
