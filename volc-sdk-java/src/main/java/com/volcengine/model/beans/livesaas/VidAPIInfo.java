package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class VidAPIInfo {
    @JSONField(name = "PlayUrl")
    private String PlayUrl;
    @JSONField(name = "CoverImage")
    private String CoverImage;
    @JSONField(name = "Vid")
    private String Vid;
    @JSONField(name = "Duration")
    private Double Duration;
    @JSONField(name = "Size")
    private Long Size;
    @JSONField(name = "Width")
    private Long Width;
    @JSONField(name = "Height")
    private Long Height;
    @JSONField(name = "FileHash")
    private String FileHash;
    @JSONField(name = "TranscodeVodInfos")
    private List<TranscodeVidAPIInfo> TranscodeVodInfos;
}