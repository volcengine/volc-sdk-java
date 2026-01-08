package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateShipperRequest {
    @JSONField(name = "ContentInfo")
    private ContentInfo contentInfo;
    
    @JSONField(name = "KafkaShipperInfo")
    private KafkaShipperInfo kafkaShipperInfo;
    
    @JSONField(name = "ShipperEndTime")
    private Long shipperEndTime;
    
    @JSONField(name = "ShipperName")
    private String shipperName;
    
    @JSONField(name = "ShipperStartTime")
    private Long shipperStartTime;
    
    @JSONField(name = "ShipperType")
    private String shipperType;
    
    @JSONField(name = TOPIC_ID)
    private String topicId;
    
    @JSONField(name = "TosShipperInfo")
    private TosShipperInfo tosShipperInfo;
    
    @JSONField(name = "RoleTrn")
    private String roleTrn;

    public boolean CheckValidation() {
        if (this.contentInfo == null || this.shipperName == null || this.shipperType == null || this.topicId == null) {
            return false;
        }
        
        if ("tos".equals(this.shipperType) && this.tosShipperInfo == null) {
            return false;
        }
        
        if ("kafka".equals(this.shipperType) && this.kafkaShipperInfo == null) {
            return false;
        }
        
        return true;
    }
}
