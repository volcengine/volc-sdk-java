package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityBonusTaskWinners;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityBonusTaskWinnersResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListActivityBonusTaskWinnersResponseBody result;

    @Data
    public static class ListActivityBonusTaskWinnersResponseBody {
        @JSONField(name = "Winners")
        List<ActivityBonusTaskWinners> Winners;

        @JSONField(name = "Total")
        Long Total;
    }
}

