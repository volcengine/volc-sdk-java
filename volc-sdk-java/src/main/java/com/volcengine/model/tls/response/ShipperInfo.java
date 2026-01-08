package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ShipperInfo {
    @JSONField(name = "Status")
    private Boolean status;

    @JSONField(name = TOPIC_ID)
    private String topicId;

    @JSONField(name = PROJECT_ID)
    private String projectId;

    @JSONField(name = SHIPPER_ID)
    private String shipperId;

    @JSONField(name = TOPIC_NAME)
    private String topicName;

    @JSONField(name = CREATE_TIME)
    private String createTime;

    @JSONField(name = MODIFY_TIME)
    private String modifyTime;

    @JSONField(name = CONTENT_INFO)
    private ContentInfo contentInfo;

    @JSONField(name = DASHBOARD_ID)
    private String dashboardId;

    @JSONField(name = PROJECT_NAME)
    private String projectName;

    @JSONField(name = SHIPPER_NAME)
    private String shipperName;

    @JSONField(name = SHIPPER_TYPE)
    private String shipperType;

    @JSONField(name = SHIPPER_END_TIME)
    private Long shipperEndTime;

    @JSONField(name = TOS_SHIPPER_INFO)
    private TosShipperInfo tosShipperInfo;

    @JSONField(name = KAFKA_SHIPPER_INFO)
    private KafkaShipperInfo kafkaShipperInfo;

    @JSONField(name = SHIPPER_START_TIME)
    private Long shipperStartTime;

    @JSONField(name = ROLE_TRN)
    private String roleTrn;
}