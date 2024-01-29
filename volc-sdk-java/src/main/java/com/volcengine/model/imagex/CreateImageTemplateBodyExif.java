package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageTemplateBodyExif
 */
@lombok.Data
public final class CreateImageTemplateBodyExif  {

    /**
     * <p>是否开启保留全部 EXIF 信息。取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoOrientOff")
    private Boolean autoOrientOff;

    /**
     * <p>保留部分 EXIF 信息的具体内容，多个之间用`,`分隔。更多信息请参考[标准 EXIF 标签](https://exiv2.org/tags.html)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExifRetainNames")
    private List<String> exifRetainNames;

    /**
     * <p>是否开启保留全部 EXIF 信息，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExifReserve")
    private Boolean exifReserve;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
