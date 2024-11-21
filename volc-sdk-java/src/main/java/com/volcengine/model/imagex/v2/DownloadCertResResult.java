package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DownloadCertResResult
 */
@lombok.Data
public final class DownloadCertResResult  {

    /**
     * <p>证书压缩文件名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ZipName")
    private String zipName;

    /**
     * <p>证书压缩数据，经 base64 编码后的字符串信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ZipData")
    private String zipData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
