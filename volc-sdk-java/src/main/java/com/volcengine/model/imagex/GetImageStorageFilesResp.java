package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageStorageFilesResp {
    @JSONField(name = "Items")
    List<GetImageStorageFilesRespItems> items;

    @JSONField(name = "Marker")
    String marker;

    @JSONField(name = "HasMore")
    Boolean hasMore;

    @JSONField(name = "CommonPrefix")
    List<String> commonPrefix;
}