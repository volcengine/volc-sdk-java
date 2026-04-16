package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetSpeechConfigResResultData
 */
@lombok.Data
public final class GetSpeechConfigResResultData  {

    /**
     * <p>支持的字体。格式为 `"Key":"Value"`，每个 `"Key":"Value"` 之间用英文逗号（,）隔开。其中，`"Key"` 为字体名称，`"Value"` 为字体信息，包括 `Lang` 和 `Alias` 字段。</p>
     *
     * <p>- `Lang`：字体支持的语种编号。</p>
     *
     * <p>- `Alias`：字体的中文名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Font")
    private Map<String, Object> font;

    /**
     * <p>支持的语种。格式为 `"Key":"Value"`，每个 `"Key":"Value"` 之间用英文逗号（,）隔开。其中，`"Key"` 为语种编号，`"Value"` 为语种中文名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Lang")
    private Map<String, Object> lang;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
