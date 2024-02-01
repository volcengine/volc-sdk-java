package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXEdgeRequestRegionsResResult
 */
@lombok.Data
public final class DescribeImageXEdgeRequestRegionsResResult  {

    /**
     * <p>客户端省份</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserProvince")
    private List<String> userProvince;

    /**
     * <p>客户端国家</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserCountry")
    private List<String> userCountry;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
