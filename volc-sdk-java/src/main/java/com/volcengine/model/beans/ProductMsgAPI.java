package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ProductMsgAPI {
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "Highlight")
    String Highlight;
    @JSONField(name = "IntroduceImage")
    String IntroduceImage;
    @JSONField(name = "RedirectImage")
    String RedirectImage;
    @JSONField(name = "RedirectUrl")
    String RedirectUrl;
    @JSONField(name = "Index")
    Integer Index;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "EnableStatus")
    Integer EnableStatus;
}
