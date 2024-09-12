package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateTemplatesFromBinResResultResultsItem
 */
@lombok.Data
public final class CreateTemplatesFromBinResResultResultsItem  {

    /**
     * <p>回收站中的模板名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BinName")
    private String binName;

    /**
     * <p>恢复后的模板名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NewName")
    private String newName;

    /**
     * <p>是否恢复成功，取值如下所示：</p>
     *
     * <p>- `true`：恢复成功</p>
     *
     * <p>- `false`：恢复不成功</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Success")
    private Boolean success;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
