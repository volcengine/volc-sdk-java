package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAllImageServicesResResultServicesItemImageYAttribute
 */
@lombok.Data
public final class GetAllImageServicesResResultServicesItemImageYAttribute  {

    /**
     * <p>是否开启原图保护，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageProtect")
    private Boolean imageProtect;

    /**
     * <p>样式分割符</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageStyleSeparators")
    private List<String> imageStyleSeparators;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QnCosPreference")
    private String qnCosPreference;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryStyleCombine")
    private Boolean queryStyleCombine;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
