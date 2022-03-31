package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
public class HotBoardListResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<HotBoardResponse.HotBoard> result;
}

