package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAIDetailsResResultExecInfoItemExecOutput
 */
@lombok.Data
public final class GetImageAIDetailsResResultExecInfoItemExecOutput  {

    /**
     * <p>AI 图像处理失败错误信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>AI 图像处理失败[错误码](https://www.volcengine.com/docs/508/1104726#%E9%94%99%E8%AF%AF%E7%A0%81)。仅当 `Status` 值为 `Fail` 时，`ErrCode` 有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private String errCode;

    /**
     * <p>AI 图像处理结果，是 JSON 压缩并转义后的字符串，仅当 `Status` 值为 `Success` 时，`Output` 有值。参看 [AI 图像处理模板](https://www.volcengine.com/docs/508/1515840)页面获取模板 ID 和参数信息，根据具体的工作流的说明进行解析。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private String output;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
