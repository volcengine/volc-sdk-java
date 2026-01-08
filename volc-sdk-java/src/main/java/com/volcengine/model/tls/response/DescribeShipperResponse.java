package com.volcengine.model.tls.response;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.*;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeShipperResponse extends CommonResponse {

    @JSONField(name = "ContentInfo")
    private ContentInfo contentInfo;
    
    @JSONField(name = "CreateTime")
    private String createTime;
    
    @JSONField(name = "DashboardId")
    private String dashboardId;
    
    @JSONField(name = "KafkaShipperInfo")
    private KafkaShipperInfo kafkaShipperInfo;
    
    @JSONField(name = "ModifyTime")
    private String modifyTime;
    
    @JSONField(name = "ProjectId")
    private String projectId;
    
    @JSONField(name = "ProjectName")
    private String projectName;
    
    @JSONField(name = "RoleTrn")
    private String roleTrn;
    
    @JSONField(name = "ShipperEndTime")
    private long shipperEndTime;
    
    @JSONField(name = "ShipperId")
    private String shipperId;
    
    @JSONField(name = "ShipperName")
    private String shipperName;
    
    @JSONField(name = "ShipperStartTime")
    private long shipperStartTime;
    
    @JSONField(name = "ShipperType")
    private String shipperType;
    
    @JSONField(name = "Status")
    private boolean status;
    
    @JSONField(name = "TopicId")
    private String topicId;
    
    @JSONField(name = "TopicName")
    private String topicName;
    
    @JSONField(name = "TosShipperInfo")
    private TosShipperInfo tosShipperInfo;

    public DescribeShipperResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeShipperResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeShipperResponse response = JSONObject.parseObject(data, DescribeShipperResponse.class);
        this.setContentInfo(response.getContentInfo());
        this.setCreateTime(response.getCreateTime());
        this.setDashboardId(response.getDashboardId());
        this.setKafkaShipperInfo(response.getKafkaShipperInfo());
        this.setModifyTime(response.getModifyTime());
        this.setProjectId(response.getProjectId());
        this.setProjectName(response.getProjectName());
        this.setRoleTrn(response.getRoleTrn());
        this.setShipperEndTime(response.getShipperEndTime());
        this.setShipperId(response.getShipperId());
        this.setShipperName(response.getShipperName());
        this.setShipperStartTime(response.getShipperStartTime());
        this.setShipperType(response.getShipperType());
        this.setStatus(response.isStatus());
        this.setTopicId(response.getTopicId());
        this.setTopicName(response.getTopicName());
        this.setTosShipperInfo(response.getTosShipperInfo());
        return this;
    }
}