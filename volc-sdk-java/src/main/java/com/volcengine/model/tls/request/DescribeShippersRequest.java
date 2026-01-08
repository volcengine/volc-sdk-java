package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.Const;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeShippersRequest {
    @JSONField(name = Const.PROJECT_ID)
    private String projectId;

    @JSONField(name = Const.PROJECT_NAME)
    private String projectName;

    @JSONField(name = Const.IAM_PROJECT_NAME)
    private String iamProjectName;

    @JSONField(name = Const.PAGE_NUMBER)
    private Integer pageNumber;

    @JSONField(name = Const.PAGE_SIZE)
    private Integer pageSize;

    @JSONField(name = Const.SHIPPER_NAME)
    private String shipperName;

    @JSONField(name = Const.SHIPPER_ID)
    private String shipperId;

    @JSONField(name = Const.TOPIC_NAME)
    private String topicName;

    @JSONField(name = Const.TOPIC_ID)
    private String topicId;

    @JSONField(name = Const.SHIPPER_TYPE)
    private String shipperType;

    public boolean CheckValidation() {
        return true;
    }
}