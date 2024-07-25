package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CreateTagResResult
 */
@lombok.Data
public final class CreateTagResResult  {

    /**
     * <p>标签创建成功，返回创建的标签 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagId")
    private String tagId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
