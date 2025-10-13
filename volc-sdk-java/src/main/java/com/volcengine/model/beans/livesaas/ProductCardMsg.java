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
    @JSONField(name = "SellingPointTag")
    String SellingPointTag;
    @JSONField(name = "ReminderType")
    Integer ReminderType;
    @JSONField(name = "HotSale")
    String HotSale;
    @JSONField(name = "Stock")
    String Stock;
    @JSONField(name = "PromotionTagUrl")
    String PromotionTagUrl;
    @JSONField(name = "PromotionTagType")
    Integer PromotionTagType;
    @JSONField(name = "IsOrderMsgEnable")
    Integer IsOrderMsgEnable;
    @JSONField(name = "OutOfStock")
    Integer OutOfStock;
    @JSONField(name = "PriceHidden")
    Integer PriceHidden;
}
