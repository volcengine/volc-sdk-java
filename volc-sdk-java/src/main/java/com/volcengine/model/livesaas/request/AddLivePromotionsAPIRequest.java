package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AddLivePromotionsInfo;
import lombok.Data;

import java.util.List;

@Data
public class AddLivePromotionsAPIRequest {
    // 批量添加直播推广自定义平台
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "AddLivePromotionsInfos")
    List<AddLivePromotionsInfo> AddLivePromotionsInfos;
}