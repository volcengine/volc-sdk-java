package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CloudEditSourceVideo;
import lombok.Data;

import java.util.List;

@Data
public class ExportHighlightClipRequest {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "CloudEditSourceVideoList")
    List<CloudEditSourceVideo> CloudEditSourceVideoList;
}
