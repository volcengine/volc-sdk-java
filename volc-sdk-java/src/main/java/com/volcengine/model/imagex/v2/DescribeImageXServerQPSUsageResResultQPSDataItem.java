package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXServerQPSUsageResResultQPSDataItem
 */
@lombok.Data
public final class DescribeImageXServerQPSUsageResResultQPSDataItem  {

    /**
     * <p>QPS 类型，取值：</p>
     *
     * <p>- `Request`：专有图像处理和高效压缩</p>
     *
     * <p>- `Mirror`：资源下载与镜像代理</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QPSType")
    private String qPSType;

    /**
     * <p>时序数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXServerQPSUsageResResultQPSDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
