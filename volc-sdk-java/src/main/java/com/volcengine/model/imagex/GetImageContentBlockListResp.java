package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageContentBlockListResp {
    @JSONField(name = "Total")
    Integer total;
    @JSONField(name = "PageNum")
    Integer pageNum;
    @JSONField(name = "PageSize")
    Integer pageSize;
    @JSONField(name = "Data")
    List<GetImageContentBlockListRespData> data;
}
