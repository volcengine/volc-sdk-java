package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class RequestCntDataItem {
    private @JSONField(name = "AdvFeat") String advFeat;
    private @JSONField(name = "Data") List<TSFloatItem> data;

}
