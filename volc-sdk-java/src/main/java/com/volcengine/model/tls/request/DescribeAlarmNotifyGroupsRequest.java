package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeAlarmNotifyGroupsRequest {
    @JSONField(name = ALARM_NOTIFY_GROUP_NAME)
    String alarmNotifyGroupName;
    @JSONField(name = ALARM_NOTIFY_GROUP_ID)
    String alarmNotifyGroupId;
    @JSONField(name = RECEIVER_NAME)
    String receiverName;
    @JSONField(name = PAGE_NUMBER)
    Integer pageNumber;
    @JSONField(name = PAGE_SIZE)
    Integer pageSize;
    @JSONField(name = IAM_PROJECT_NAME)
    String iamProjectName;

    public DescribeAlarmNotifyGroupsRequest(String alarmNotifyGroupId) {
        this.alarmNotifyGroupId = alarmNotifyGroupId;
    }

    /**
     * @return 告警通知组名称
     */
    public String getAlarmNotifyGroupName() {
        return alarmNotifyGroupName;
    }

    /**
     * @param alarmNotifyGroupName 告警通知组名称
     */
    public void setAlarmNotifyGroupName(String alarmNotifyGroupName) {
        this.alarmNotifyGroupName = alarmNotifyGroupName;
    }

    /**
     * @return 告警通知组 ID
     */
    public String getAlarmNotifyGroupId() {
        return alarmNotifyGroupId;
    }

    /**
     * @param alarmNotifyGroupId 告警通知组 ID
     */
    public void setAlarmNotifyGroupId(String alarmNotifyGroupId) {
        this.alarmNotifyGroupId = alarmNotifyGroupId;
    }

    /**
     * @return 接收告警的 IAM 用户名称
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * @param receiverName 接收告警的 IAM 用户名称
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * @return 分页查询时的页码。默认为 1
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber 分页查询时的页码。默认为 1
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return 分页大小。默认为 20，最大为 100
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize 分页大小。默认为 20，最大为 100
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return 告警组所属的IAM项目名称
     */
    public String getIamProjectName() {
        return iamProjectName;
    }

    /**
     * @param iamProjectName 告警组所属的IAM项目名称
     */
    public void setIamProjectName(String iamProjectName) {
        this.iamProjectName = iamProjectName;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return true;
    }
}
