package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ProductCardMsg {
    @JSONField(name = "Highlight")
    String Highlight;
    @JSONField(name = "IntroduceImage")
    String IntroduceImage;
    @JSONField(name = "RedirectUrl")
    String RedirectUrl;
    @JSONField(name = "Index")
    Integer Index;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Remark")
    String Remark;
    @JSONField(name = "EnableStatus")
    Integer EnableStatus;
    @JSONField(name = "Strikethrough")
    String Strikethrough;
    @JSONField(name = "MiniAppDirectUrl")
    String MiniAppDirectUrl;
    @JSONField(name = "DirectUrls")
    List<String> DirectUrls;
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "RedirectImage")
    String RedirectImage;
}