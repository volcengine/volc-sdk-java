package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ArticleSearchRequest {
    @JSONField(name = "Keyword")
    String keyword; // 搜索关键词
    @JSONField(name = "UniqUserId")
    String uniqUserId; // 用户唯一标识
    @JSONField(name = "Category")
    String category; // 场景ID
    @JSONField(name = "GenerateTypeList")
    List<String> generateTypeList; // 查询特定来源的内容
    @JSONField(name = "PageSize")
    Integer pageSize; // 分页数量限制
    @JSONField(name = "Offset")
    Integer offset; // 分页内容位置
}
