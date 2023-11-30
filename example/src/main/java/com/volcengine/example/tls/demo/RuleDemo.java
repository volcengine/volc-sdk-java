package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.*;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class RuleDemo extends BaseDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-rule";
        String separator = "-";
        String date = sdf.format(new Date());

        try {
            // 请填写您的ProjectId、TopicId和HostGroupId
            String projectID = "your-project-id";
            String topicID = "your-topic-id";
            String hostGroupID = "your-host-group-id";

            // 创建采集配置
            // 请根据您的需要，填写topicId、ruleName和其它采集配置参数
            // CreateRule API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112199
            CreateRuleRequest createRuleRequest = new CreateRuleRequest();
            createRuleRequest.setTopicId(topicID);
            createRuleRequest.setRuleName(prefix + separator + date + separator + System.currentTimeMillis());
            createRuleRequest.setPaths(Arrays.asList("/data/nginx/log/*/*/*.log"));
            createRuleRequest.setLogType("delimiter_log");

            ExtractRule extractRule = new ExtractRule();
            extractRule.setDelimiter("#");
            extractRule.setKeys(Arrays.asList("time", "level"));
            extractRule.setTimeKey("time");
            extractRule.setTimeFormat("TimeFormat");
            extractRule.setFilterKeyRegex(Arrays.asList(new FilterKeyRegex("msg", ".*ERROR.*")));
            extractRule.setUnMatchUpLoadSwitch(true);
            extractRule.setUnMatchLogKey("LogParseFailed");
            createRuleRequest.setExtractRule(extractRule);

            createRuleRequest.setExcludePaths(Arrays.asList(new ExcludePath("File", "/data/nginx/log/*/*/exclude.log")));
            createRuleRequest.setLogSample("2018-05-22 15:35:53.850 INFO XXXX");
            createRuleRequest.setUserDefineRule(new UserDefineRule(
                    new ParsePathRule("/var/logs/instanceid_any_podname/test.log", "\\/test.log", Arrays.asList("instance-id")),
                    new ShardHashKey(), Boolean.FALSE, new HashMap<>()));
            createRuleRequest.setInputType(2);

            ContainerRule containerRule = new ContainerRule();
            containerRule.setContainerNameRegex(".*Name.*");
            containerRule.setIncludeContainerLabelRegex(new HashMap<String, String>() {{
                put("Key1", "Value1");
            }});
            containerRule.setExcludeContainerLabelRegex(new HashMap<String, String>() {{
                put("Key2", "Value2");
            }});
            containerRule.setEnvTag(new HashMap<String, String>() {{
                put("Key3", "Value3");
            }});

            KubernetesRule kubernetesRule = new KubernetesRule();
            kubernetesRule.setNamespaceNameRegex(".*Name.*");
            kubernetesRule.setIncludePodLabelRegex(new HashMap<String, String>() {{
                put("Key4", "Value4");
            }});
            containerRule.setKubernetesRule(kubernetesRule);

            createRuleRequest.setContainerRule(containerRule);
            CreateRuleResponse createRuleResponse = client.createRule(createRuleRequest);
            System.out.println("create rule success, response: " + createRuleResponse);

            String ruleID = createRuleResponse.getRuleId();

            // 修改采集配置
            // 请根据您的需要，填写待修改的ruleId、ruleName或其它参数
            // ModifyRule API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112201
            ModifyRuleRequest modifyRuleRequest = new ModifyRuleRequest();
            modifyRuleRequest.setRuleId(ruleID);
            modifyRuleRequest.setRuleName(prefix + separator + date + separator + System.currentTimeMillis());
            modifyRuleRequest.setPaths(Arrays.asList("/data/nginx/log/*/*/*.log"));
            modifyRuleRequest.setLogType("delimiter_log");

            extractRule = new ExtractRule();
            extractRule.setDelimiter("#");
            extractRule.setKeys(Arrays.asList("time", "level"));
            extractRule.setTimeKey("time");
            extractRule.setTimeFormat("TimeFormat");
            extractRule.setFilterKeyRegex(Arrays.asList(new FilterKeyRegex("msg", ".*ERROR.*")));
            extractRule.setUnMatchUpLoadSwitch(true);
            extractRule.setUnMatchLogKey("LogParseFailed");
            modifyRuleRequest.setExtractRule(extractRule);

            modifyRuleRequest.setExcludePaths(Arrays.asList(new ExcludePath("File", "/data/nginx/log/*/*/exclude.log")));
            modifyRuleRequest.setLogSample("2018-05-22 15:35:53.850 INFO XXXX");
            modifyRuleRequest.setUserDefineRule(new UserDefineRule(
                    new ParsePathRule("/var/logs/instanceid_any_podname/test.log", "\\/test.log", Arrays.asList("instance-id")),
                    new ShardHashKey(), Boolean.FALSE, new HashMap<>()));
            modifyRuleRequest.setInputType(2);

            containerRule = new ContainerRule();
            containerRule.setContainerNameRegex(".*Name.*");
            containerRule.setIncludeContainerLabelRegex(new HashMap<String, String>() {{
                put("Key1", "Value1");
            }});
            containerRule.setExcludeContainerLabelRegex(new HashMap<String, String>() {{
                put("Key2", "Value2");
            }});
            containerRule.setEnvTag(new HashMap<String, String>() {{
                put("Key3", "Value3");
            }});

            kubernetesRule = new KubernetesRule();
            kubernetesRule.setNamespaceNameRegex(".*Name.*");
            kubernetesRule.setIncludePodLabelRegex(new HashMap<String, String>() {{
                put("Key4", "Value4");
            }});
            containerRule.setKubernetesRule(kubernetesRule);

            modifyRuleRequest.setContainerRule(containerRule);
            ModifyRuleResponse modifyRuleResponse = client.modifyRule(modifyRuleRequest);
            System.out.println("modify rule success, response: " + modifyRuleResponse);

            // 查询指定采集配置
            // 请根据您的需要，填写待查询的ruleId
            // DescribeRule API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112202
            DescribeRuleRequest describeRuleRequest = new DescribeRuleRequest(ruleID);
            DescribeRuleResponse describeRuleResponse = client.describeRule(describeRuleRequest);
            System.out.println("describe rule success, response: " + describeRuleResponse);

            // 查询日志项目所有采集配置
            // 请根据您的需要，填写待查询的projectId
            // DescribeRules API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112203
            DescribeRulesRequest describeRulesRequest = new DescribeRulesRequest();
            describeRulesRequest.setProjectId(projectID);
            DescribeRulesResponse describeRulesResponse = client.describeRules(describeRulesRequest);
            System.out.println("describe rules success, response: " + describeRulesResponse);

            // 应用采集配置到机器组
            // 请根据您的需要，填写ruleId和hostGroupIds列表
            // ApplyRuleToHostGroups API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112204
            ApplyRuleToHostGroupsRequest applyRuleToHostGroupsRequest = new ApplyRuleToHostGroupsRequest(ruleID, Arrays.asList(hostGroupID));
            ApplyRuleToHostGroupsResponse applyRuleToHostGroupsResponse = client.applyRuleToHostGroups(applyRuleToHostGroupsRequest);
            System.out.println("apply rule to host group success, response: " + applyRuleToHostGroupsResponse);

            // 删除机器组的采集配置
            // 请根据您的需要，填写ruleId和hostGroupIds列表
            // DeleteRuleFromHostGroups API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112205
            DeleteRuleFromHostGroupsRequest deleteRuleFromHostGroupsRequest = new DeleteRuleFromHostGroupsRequest(ruleID, Arrays.asList(hostGroupID));
            DeleteRuleFromHostGroupsResponse deleteRuleFromHostGroupsResponse = client.deleteRuleFromHostGroups(deleteRuleFromHostGroupsRequest);
            System.out.println("delete rule to host group success, response: " + deleteRuleFromHostGroupsResponse);

            // 删除采集配置
            // 请根据您的需要，填写待删除的ruleId
            // DeleteRule API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112200
            DeleteRuleResponse deleteRuleResponse = client.deleteRule(new DeleteRuleRequest(ruleID));
            System.out.println("delete rule success, response: " + deleteRuleResponse);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }
}
