package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
public class ProjectInfo {
    @JSONField(name=PROJECT_NAME)
    String projectName;
    @JSONField(name=PROJECT_ID)
    String projectId;
    @JSONField(name=DESCRIPTION)
    String description;
    @JSONField(name=CREATE_TIME)
    String createTime;
    //endpoint when project created
    @JSONField(name=INNER_NET_DOMIN)
    String innerNetDomain;
    //topic of project count
    @JSONField(name=TOPIC_CNT)
    int topicCount;
    @JSONField(name = IAM_PROJECT_NAME)
    String iamProjectName;
    @JSONField(name = PROJECT_TAGS)
    List<TagInfo> tags;
}
