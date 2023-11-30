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
            // 请填写您的ProjectId和TopicId
            String projectID = "your-project-id";
            String topicID = "your-topic-id";

            // 创建告警组
            // 请根据您的需要，填写AlarmNotifyGroupName、NotifyType和Receivers等参数
            // CreateAlarmNotifyGroup API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112220
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
            CreateAlarmNotifyGroupResponse createAlarmNotifyGroupResponse = client.createAlarmNotifyGroup(createAlarmNotifyGroupRequest);
            System.out.println("create alarm notify group success, response: " + createAlarmNotifyGroupResponse);

            String alarmNotifyGroupID = createAlarmNotifyGroupResponse.getAlarmNotifyGroupId();

            // 修改告警组
            // 请根据您的需要，填写待修改的alarmNotifyGroupId和其它参数
            // ModifyAlarmNotifyGroup API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112222
            ModifyAlarmNotifyGroupRequest modifyAlarmNotifyGroupRequest = new ModifyAlarmNotifyGroupRequest();
            modifyAlarmNotifyGroupRequest.setAlarmNotifyGroupId(alarmNotifyGroupID);
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
            ModifyAlarmNotifyGroupResponse modifyAlarmNotifyGroupResponse = client.modifyAlarmNotifyGroup(modifyAlarmNotifyGroupRequest);
            System.out.println("modify alarm notify group success, response: " + modifyAlarmNotifyGroupResponse);

            // 获取告警组
            // 请根据您的需要，填写alarmNotifyGroupName等参数
            // DescribeAlarmNotifyGroups API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112223
            DescribeAlarmNotifyGroupsRequest describeAlarmNotifyGroupsRequest = new DescribeAlarmNotifyGroupsRequest();
            describeAlarmNotifyGroupsRequest.setAlarmNotifyGroupId(alarmNotifyGroupID);
            DescribeAlarmNotifyGroupsResponse describeAlarmNotifyGroupsResponse =
                    client.describeAlarmNotifyGroups(describeAlarmNotifyGroupsRequest);
            System.out.println("describe alarm notify group success, response: " + describeAlarmNotifyGroupsResponse);

            // 创建告警策略
            // 请根据您的需要，填写projectId、alarmName、queryRequest、requestCycle、condition、alarmPeriod、alarmNotifyGroup等参数
            // CreateAlarm API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112216
            CreateAlarmRequest createAlarmRequest = new CreateAlarmRequest();
            createAlarmRequest.setAlarmNotifyGroup(Arrays.asList(alarmNotifyGroupID));
            createAlarmRequest.setCondition("$1.errNum>0");
            createAlarmRequest.setAlarmName(prefix + separator + System.currentTimeMillis());
            createAlarmRequest.setAlarmPeriod(60);
            createAlarmRequest.setProjectId(projectID);
            QueryRequest queryRequest = new QueryRequest();
            queryRequest.setNumber(1);
            queryRequest.setQuery("Failed | select count(*) as errNum");
            queryRequest.setStartTimeOffset(-1);
            queryRequest.setEndTimeOffset(0);
            queryRequest.setTopicId(topicID);
            createAlarmRequest.setQueryRequest(Arrays.asList(queryRequest));
            RequestCycle period = new RequestCycle();
            period.setType("Period");
            period.setTime(10);
            createAlarmRequest.setRequestCycle(period);
            createAlarmRequest.setTriggerPeriod(1);
            createAlarmRequest.setUserDefineMsg("test-zsq");
            CreateAlarmResponse createAlarmResponse = client.createAlarm(createAlarmRequest);
            System.out.println("create alarm success, response: " + createAlarmResponse);

            String alarmID = createAlarmResponse.getAlarmId();

            // 修改告警策略
            // 请根据您的需要，填写待修改的alarmId和其它参数
            // ModifyAlarm API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112218
            ModifyAlarmRequest modifyAlarmRequest = new ModifyAlarmRequest();
            modifyAlarmRequest.setAlarmId(alarmID);
            modifyAlarmRequest.setAlarmName(createAlarmRequest.getAlarmName() + separator + System.currentTimeMillis());
            queryRequest = new QueryRequest();
            queryRequest.setNumber(1);
            queryRequest.setQuery("Failed | select count(1) as errNum");
            queryRequest.setStartTimeOffset(-2);
            queryRequest.setEndTimeOffset(0);
            queryRequest.setTopicId(topicID);
            modifyAlarmRequest.setQueryRequest(Arrays.asList(queryRequest));
            period = new RequestCycle();
            period.setType("Period");
            period.setTime(10);
            modifyAlarmRequest.setRequestCycle(period);
            modifyAlarmRequest.setTriggerPeriod(1);
            modifyAlarmRequest.setUserDefineMsg("test-zsq-modified");
            ModifyAlarmResponse modifyAlarmResponse = client.modifyAlarm(modifyAlarmRequest);
            System.out.println("modify alarm success, response: " + modifyAlarmResponse);

            // 查询告警策略
            // 请根据您的需要，填写待查询的projectId
            // DescribeAlarms API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112219
            DescribeAlarmsRequest describeAlarmsRequest = new DescribeAlarmsRequest();
            describeAlarmsRequest.setProjectId(projectID);
            describeAlarmsRequest.setPageNumber(1);
            describeAlarmsRequest.setPageSize(10);
            DescribeAlarmsResponse describeAlarmsResponse = client.describeAlarms(describeAlarmsRequest);
            System.out.println("describe alarm success, response: " + describeAlarmsResponse);

            // 删除告警策略
            // 请根据您的需要，填写待删除的alarmId
            // DeleteAlarm API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112217
            DeleteAlarmRequest deleteAlarmRequest = new DeleteAlarmRequest(alarmID);
            DeleteAlarmResponse deleteAlarmResponse = client.deleteAlarm(deleteAlarmRequest);
            System.out.println("delete alarm success, response: " + deleteAlarmResponse);

            // 删除告警组
            // 请根据您的需要，填写待删除的alarmNotifyGroupId
            // DeleteAlarmNotifyGroup API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112221
            DeleteAlarmNotifyGroupRequest deleteAlarmNotifyGroupRequest = new DeleteAlarmNotifyGroupRequest(alarmNotifyGroupID);
            DeleteAlarmNotifyGroupResponse deleteAlarmNotifyGroupResponse = client.deleteAlarmNotifyGroup(deleteAlarmNotifyGroupRequest);
            System.out.println("delete alarm notify group success, response: " + deleteAlarmNotifyGroupResponse);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }
}
