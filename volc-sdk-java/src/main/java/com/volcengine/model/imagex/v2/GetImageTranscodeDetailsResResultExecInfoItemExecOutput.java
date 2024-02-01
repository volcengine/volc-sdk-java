package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeDetailsResResultExecInfoItemExecOutput
 */
@lombok.Data
public final class GetImageTranscodeDetailsResResultExecInfoItemExecOutput  {

    /**
     * <p>转码结果图大小，单位为 byte</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Long size;

    /**
     * <p>转码结果图格式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>转码失败错误信息。仅当`Status`值为`Fail`时，`ErrMsg`有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>转码结果图的存储 URI。仅当`Status`值为`Success`时，`Output`有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private String output;

    /**
     * <p>转码失败[错误码](https://www.volcengine.com/docs/508/1104726#%E9%94%99%E8%AF%AF%E7%A0%81)。仅当`Status`值为`Fail`时，`ErrCode`有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private String errCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
