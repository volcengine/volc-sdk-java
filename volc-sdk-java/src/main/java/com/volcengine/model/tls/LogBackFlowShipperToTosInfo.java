package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.CONTENT_INFO;
import static com.volcengine.model.tls.Const.TOS_SHIPPER_INFO;

@Data
@NoArgsConstructor
public class LogBackFlowShipperToTosInfo {
    @JSONField(name = TOS_SHIPPER_INFO)
    private TosShipperInfo tosShipperInfo;
    @JSONField(name = CONTENT_INFO)
    private ContentInfo contentInfo;
}
