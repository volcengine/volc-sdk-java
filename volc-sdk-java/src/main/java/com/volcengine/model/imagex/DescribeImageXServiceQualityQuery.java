package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXServiceQualityQuery
 */
@lombok.Data
public final class DescribeImageXServiceQualityQuery  {

    /**
     * <p>获取指定地区的数据。默认为空，表示获取国内数据。</p>
     *
     * <p>* `cn`：国内。</p>
     *
     * <p>* `va`：美东。</p>
     *
     * <p>* `sg`：新加坡。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
