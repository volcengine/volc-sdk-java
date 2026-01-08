package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyShipperRequest {
    @JSONField(name = SHIPPER_ID)
    private String shipperId;

    @JSONField(name = SHIPPER_NAME)
    private String shipperName;

    @JSONField(name = SHIPPER_TYPE)
    private String shipperType;

    @JSONField(name = STATUS)
    private Boolean status;

    @JSONField(name = ROLE_TRN)
    private String roleTrn;

    @JSONField(name = CONTENT_INFO)
    private ContentInfo contentInfo;

    @JSONField(name = KAFKA_SHIPPER_INFO)
    private KafkaShipperInfo kafkaShipperInfo;

    @JSONField(name = TOS_SHIPPER_INFO)
    private TosShipperInfo tosShipperInfo;

    public boolean CheckValidation() {
        return this.shipperId != null && !this.shipperId.isEmpty();
    }
}