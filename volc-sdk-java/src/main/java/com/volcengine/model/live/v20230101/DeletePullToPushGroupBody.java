package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeletePullToPushGroupBody
 */
@lombok.Data
public final class DeletePullToPushGroupBody  {

    /**
     * <p>拉流转推群组名称，您可以调用 [ListPullToPushGroup](https://www.volcengine.com/docs/6469/1327382) 接口获取群组名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
