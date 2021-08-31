package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.VidInfo;
import lombok.Data;
import java.util.List;

@Data
public class UploadLibAPIRequest {
    @JSONField(name = "Vids")
    List<VidInfo> Vids;
}
