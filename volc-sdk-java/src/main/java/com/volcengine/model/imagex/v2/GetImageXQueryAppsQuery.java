package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageXQueryAppsQuery
 */
@lombok.Data
public final class GetImageXQueryAppsQuery  {

    /**
     * <p>数据来源，账号下近 60 天内有数据上报的应用 ID，缺省情况下返回账号对应的全部应用 ID。</p>
     *
     * <p>* `upload`：上传 1.0 数据。</p>
     *
     * <p>* `cdn`：下行网络数据。</p>
     *
     * <p>* `client`：客户端数据。</p>
     *
     * <p>* `sensible`：感知数据。</p>
     *
     * <p>* `uploadv2`：上传 2.0 数据。</p>
     *
     * <p>* `exceed`：大图监控数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private String source;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
