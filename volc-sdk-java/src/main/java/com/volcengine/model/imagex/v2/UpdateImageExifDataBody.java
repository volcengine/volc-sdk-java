package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageExifDataBody
 */
@lombok.Data
public final class UpdateImageExifDataBody  {

    /**
     * <p>原图存储 URI。您可以通过调用[获取服务下的上传文件](https://www.volcengine.com/docs/508/9392)来获取所需的图片存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>指定图片的处理操作，最多支持填写 50 条。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Actions")
    private List<UpdateImageExifDataBodyActionsItem> actions;

    /**
     * <p>指定修改后图片的文件名。最大长度限制为 180 个字节，不传则随机生成一个文件名。输入限制如下所示：</p>
     *
     *
     *
     * <p>- 不支持空格，如果中间有空格将会导致重命名失败。</p>
     *
     * <p>- 不支持以/开头或结尾，不支持/连续出现。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>若指定的文件名已存在，那么当在服务维度开启[重名覆盖上传](https://www.volcengine.com/docs/508/1119912)时，将覆盖原文件，否则接口将返回失败。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstKey")
    private String dstKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
