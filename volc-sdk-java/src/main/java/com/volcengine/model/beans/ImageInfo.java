package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ImageInfo {
    @JSONField(name = "ImageUri")
    String uri;
    @JSONField(name = "FileName")
    String fileName;
    @JSONField(name = "ImageWidth")
    int width;
    @JSONField(name = "ImageHeight")
    int height;
    @JSONField(name = "ImageMd5")
    String md5;
}
