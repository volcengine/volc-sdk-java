package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.cms.Context;
import lombok.Data;

import java.util.List;

@Data
public class ArticleMGetGoodsRelatedRequest {
    @JSONField(name = "GoodsIds")
    List<String> goodsIds;
    @JSONField(name = "Cursor")
    String cursor;
    @JSONField(name = "GenerateTypes")
    List<String> generateTypes;
    @JSONField(name = "Current")
    @Deprecated
    Integer current;
    @JSONField(name = "PageSize")
    Integer pageSize;
    @JSONField(name = "GroupCategory")
    String groupCategory;
    @JSONField(name = "BaseGoodsRelateParam")
    BaseGoodsRelateParam baseGoodsRelateParam;

    @Data
    public static class BaseGoodsRelateParam {
        @JSONField(name = "UniqUserId")
        String uniqUserId;
        @JSONField(name = "Category")
        String category;
        @JSONField(name = "GoodsSourceId")
        String goodsSourceId;
        @JSONField(name = "Context")
        Context context;
    }
}
