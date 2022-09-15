package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.QueryRequest;
import com.volcengine.model.tls.Receiver;
import com.volcengine.model.tls.RequestCycle;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class AlarmDemo extends BaseDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test";
        String separator = "-";
        String date = sdf.format(new Date());
        try {
            // create alarm notify group
            CreateAlarmNotifyGroupRequest createAlarmNotifyGroupRequest = new CreateAlarmNotifyGroupRequest();
            createAlarmNotifyGroupRequest.setAlarmNotifyGroupName(prefix + separator + System.currentTimeMillis());
            createAlarmNotifyGroupRequest.setNotifyType(Arrays.asList("Recovery", "Trigger"));
            Receiver receiver = new Receiver();
            receiver.setReceiverType("User");
            receiver.setReceiverNames(Arrays.asList("test-user"));
            receiver.setReceiverChannels(Arrays.asList("Sms"));
            receiver.setStartTime("00:00:00");
            receiver.setEndTime("23:59:59");
            createAlarmNotifyGroupRequest.setReceivers(Arrays.asList(receiver));
            CreateAlarmNotifyGroupResponse createAlarmNotifyGroupResponse = client.createAlarmNotifyGroup(
                    createAlarmNotifyGroupRequest);
            System.out.println("create alarm notify group success,response:" + createAlarmNotifyGroupResponse);
            // modify alarm notify group
            ModifyAlarmNotifyGroupRequest modifyAlarmNotifyGroupRequest = new ModifyAlarmNotifyGroupRequest();
            modifyAlarmNotifyGroupRequest.setAlarmNotifyGroupId(createAlarmNotifyGroupResponse.getAlarmNotifyGroupId());
            modifyAlarmNotifyGroupRequest.setAlarmNotifyGroupName(
                    createAlarmNotifyGroupRequest.getAlarmNotifyGroupName() + separator + System.currentTimeMillis());
            modifyAlarmNotifyGroupRequest.setNotifyType(Arrays.asList("Recovery", "Trigger"));
            receiver = new Receiver();
            receiver.setReceiverType("User");
            receiver.setReceiverNames(Arrays.asList("test-user"));
            receiver.setReceiverChannels(Arrays.asList("Sms"));
            receiver.setStartTime("01:00:00");
            receiver.setEndTime("22:59:59");
            modifyAlarmNotifyGroupRequest.setReceivers(Arrays.asList(receiver));
            ModifyAlarmNotifyGroupResponse modifyAlarmNotifyGroupResponse =
                    client.modifyAlarmNotifyGroup(modifyAlarmNotifyGroupRequest);
            System.out.println("modify alarm notify group success,response:" + modifyAlarmNotifyGroupResponse);
            // describe alarm notify group
            DescribeAlarmNotifyGroupsRequest describeAlarmNotifyGroupsRequest = new DescribeAlarmNotifyGroupsRequest();
            describeAlarmNotifyGroupsRequest.
                    setAlarmNotifyGroupId(createAlarmNotifyGroupResponse.getAlarmNotifyGroupId());
            DescribeAlarmNotifyGroupsResponse describeAlarmNotifyGroupsResponse =
                    client.describeAlarmNotifyGroups(describeAlarmNotifyGroupsRequest);
            System.out.println("describe alarm notify group success,response:" + describeAlarmNotifyGroupsResponse);

            // create project for alarm
            String projectName = prefix + "project" + separator + date + separator + System.currentTimeMillis();
            String region = "your-region";
            String description = "test project";
            CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(project);
            System.out.println("create project success,response:" + createProjectResponse);
            String projectId = createProjectResponse.getProjectId();
            //create topic for alarm
            String topicName = prefix + "topic" + separator + date + separator + System.currentTimeMillis();
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setProjectId(projectId);
            createTopicRequest.setTtl(500);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            System.out.println("create topic success,response:" + createTopicResponse);
            // create alarm
            CreateAlarmRequest createAlarmRequest = new CreateAlarmRequest();
            createAlarmRequest.setAlarmNotifyGroup(
                    Arrays.asList(createAlarmNotifyGroupResponse.getAlarmNotifyGroupId()));
            createAlarmRequest.setCondition("$1.errNum>0");
            createAlarmRequest.setAlarmName(prefix + separator + System.currentTimeMillis());
            createAlarmRequest.setAlarmPeriod(60);
            createAlarmRequest.setProjectId(createProjectResponse.getProjectId());
            QueryRequest queryRequest = new QueryRequest();
            queryRequest.setNumber(1);
            queryRequest.setQuery("Failed | select count(*) as errNum");
            queryRequest.setStartTimeOffset(-1);
            queryRequest.setEndTimeOffset(0);
            queryRequest.setTopicId(createTopicResponse.getTopicId());
            createAlarmRequest.setQueryRequest(Arrays.asList(queryRequest));
            RequestCycle period = new RequestCycle();
            period.setType("Period");
            period.setTime(10);
            createAlarmRequest.setRequestCycle(period);
            createAlarmRequest.setTriggerPeriod(1);
            createAlarmRequest.setUserDefineMsg("test-zsq");
            CreateAlarmResponse createAlarmResponse = client.createAlarm(createAlarmRequest);
            System.out.println("create alarm success,response:" + createAlarmResponse);
            //modify alarm
            ModifyAlarmRequest modifyAlarmRequest = new ModifyAlarmRequest();
            modifyAlarmRequest.setAlarmId(createAlarmResponse.getAlarmId());
            modifyAlarmRequest.setAlarmName(createAlarmRequest.getAlarmName() + separator + System.currentTimeMillis());
            queryRequest = new QueryRequest();
            queryRequest.setNumber(1);
            queryRequest.setQuery("Failed | select count(1) as errNum");
            queryRequest.setStartTimeOffset(-2);
            queryRequest.setEndTimeOffset(0);
            queryRequest.setTopicId(createTopicResponse.getTopicId());
            modifyAlarmRequest.setQueryRequest(Arrays.asList(queryRequest));
            period = new RequestCycle();
            period.setType("Period");
            period.setTime(10);
            modifyAlarmRequest.setRequestCycle(period);
            modifyAlarmRequest.setTriggerPeriod(1);
            modifyAlarmRequest.setUserDefineMsg("test-zsq-modified");
            ModifyAlarmResponse modifyAlarmResponse = client.modifyAlarm(modifyAlarmRequest);
            System.out.println("modify alarm success,response:" + modifyAlarmResponse);
            // describe alarm
            DescribeAlarmsRequest describeAlarmsRequest = new DescribeAlarmsRequest();
            describeAlarmsRequest.setProjectId(createProjectResponse.getProjectId());
            describeAlarmsRequest.setPageNumber(1);
            describeAlarmsRequest.setPageSize(10);
            DescribeAlarmsResponse describeAlarmsResponse = client.describeAlarms(describeAlarmsRequest);
            System.out.println("describe alarm success,response:" + describeAlarmsResponse);
            // delete alarm
            DeleteAlarmRequest deleteAlarmRequest = new DeleteAlarmRequest(createAlarmResponse.getAlarmId());
            DeleteAlarmResponse deleteAlarmResponse = client.deleteAlarm(deleteAlarmRequest);
            System.out.println("delete alarm success,response:" + deleteAlarmResponse);
            // delete alarm notify group
            DeleteAlarmNotifyGroupRequest deleteAlarmNotifyGroupRequest =
                    new DeleteAlarmNotifyGroupRequest(createAlarmNotifyGroupResponse.getAlarmNotifyGroupId());
            DeleteAlarmNotifyGroupResponse deleteAlarmNotifyGroupResponse =
                    client.deleteAlarmNotifyGroup(deleteAlarmNotifyGroupRequest);
            System.out.println("delete alarm notify group success,response:" + deleteAlarmNotifyGroupResponse);
            //delete topic
            DeleteTopicResponse deleteTopicResponse =
                    client.deleteTopic(new DeleteTopicRequest(createTopicResponse.getTopicId()));
            System.out.println("delete topic success,response:" + deleteTopicResponse);
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
            System.out.println("delete project success,response:" + deleteProjectResponse);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }
}
