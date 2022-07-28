package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.cms.Context;
import lombok.Data;

@Data
public class ArticleRelatedFeedRequest {
    @JSONField(name = "UniqUserId")
    String uniqUserId; // 用户唯一标识
    @JSONField(name = "Category")
    String category; // 场景id，取值路径：控制台 - 内容分发 - 场景管理 - 场景ID
    @JSONField(name = "RelatedBizId")
    String relatedBizId; // GroupId，文章唯一标识
    @JSONField(name = "Context")
    Context context;
}
