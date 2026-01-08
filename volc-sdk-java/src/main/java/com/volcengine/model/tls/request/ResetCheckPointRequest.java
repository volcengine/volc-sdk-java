package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ResetCheckPointRequest {
    @JSONField(name = PROJECT_ID_UPPERCASE)
    private String projectID;
    
    @JSONField(name = CONSUMER_GROUP_NAME)
    private String consumerGroupName;
    
    @JSONField(name = POSITION)
    private String position;

    /**
     * @param projectID 消费组订阅的日志项目的 ID
     * @param consumerGroupName 待重置消费位点的消费组名称
     * @param position 新的消费位点，表示从指定位置开始消费数据。支持指定为：begin：从日志主题中最早的一条数据开始消费；end：跳过所有历史数据，直接从日志主题上最近写入的一条数据开始消费；Unixtime 10 位秒级时间戳。从过去某个指定时间点开始消费，该时间点以日志主题的数据保留时长为准。指定时间点重置消费点时，不支持指定为超出数据保留时长的历史时刻或未来时刻。
     */
    public ResetCheckPointRequest(String projectID, String consumerGroupName, String position) {
        this.projectID = projectID;
        this.consumerGroupName = consumerGroupName;
        this.position = position;
    }

    /**
     * @return 消费组订阅的日志项目的 ID
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * @param projectID 消费组订阅的日志项目的 ID
     */
    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    /**
     * @return 待重置消费位点的消费组名称
     */
    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    /**
     * @param consumerGroupName 待重置消费位点的消费组名称
     */
    public void setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
    }

    /**
     * @return 新的消费位点
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position 新的消费位点
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.projectID != null && this.consumerGroupName != null && this.position != null;
    }
}