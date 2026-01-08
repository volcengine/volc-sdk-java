package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.*;
import com.volcengine.model.tls.ExtractRule;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class RuleTest extends BaseTest {
    @Test
    public void ruleTest() {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-rule";
        String separator = "-";
        String date = sdf.format(new Date());
        //  create project
        String projectName = prefix + separator + date + separator + System.currentTimeMillis();
        String region = "your-region";
        String description = "test project";

        try {
            CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(project);
            System.out.println("create project success,response:" + createProjectResponse);
            String projectId = createProjectResponse.getProjectId();
            //  create topic
            String topicName = prefix + separator + date + separator + System.currentTimeMillis();
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setProjectId(projectId);
            createTopicRequest.setTtl(500);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);

            System.out.println("create topic success,response:" + createTopicResponse);
            // create rule
            CreateRuleRequest createRuleRequest = new CreateRuleRequest();
            createRuleRequest.setTopicId(createTopicResponse.getTopicId());
            createRuleRequest.setRuleName(prefix + separator + date + separator + System.currentTimeMillis());
            createRuleRequest.setPaths(Arrays.asList("/data/nginx/log/*/*/*.log"));
            createRuleRequest.setLogType("delimiter_log");

            com.volcengine.model.tls.ExtractRule extractRule = new com.volcengine.model.tls.ExtractRule();
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
            UserDefineRule udr = new UserDefineRule(); {
                udr.setParsePathRule(new ParsePathRule("/var/logs/instanceid_any_podname/test.log", "\\/test.log", Arrays.asList("instance-id")));
            }
            createRuleRequest.setUserDefineRule(udr);
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
            System.out.println("create rule success,response:" + createRuleResponse);

            //  modify rule
            ModifyRuleRequest ruleInfo = new ModifyRuleRequest();
            ruleInfo.setRuleId(createRuleResponse.getRuleId());
            createRuleRequest.setRuleName(prefix + separator + date + separator + System.currentTimeMillis());
            ruleInfo.setPaths(Arrays.asList("/data/nginx/log/*/*/*.log"));
            ruleInfo.setLogType("delimiter_log");

            extractRule = new com.volcengine.model.tls.ExtractRule();
            extractRule.setDelimiter("#");
            extractRule.setKeys(Arrays.asList("time", "level"));
            extractRule.setTimeKey("time");
            extractRule.setTimeFormat("TimeFormat");
            extractRule.setFilterKeyRegex(Arrays.asList(new FilterKeyRegex("msg", ".*ERROR.*")));
            extractRule.setUnMatchUpLoadSwitch(true);
            extractRule.setUnMatchLogKey("LogParseFailed");
            ruleInfo.setExtractRule(extractRule);

            ruleInfo.setExcludePaths(Arrays.asList(new ExcludePath("File", "/data/nginx/log/*/*/exclude.log")));
            ruleInfo.setLogSample("2018-05-22 15:35:53.850 INFO XXXX");
            udr = new UserDefineRule(); {
                udr.setParsePathRule(new ParsePathRule("/var/logs/instanceid_any_podname/test.log", "\\/test.log", Arrays.asList("instance-id")));
            }
            ruleInfo.setUserDefineRule(udr);
            ruleInfo.setInputType(2);

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

            ruleInfo.setContainerRule(containerRule);
            ModifyRuleResponse modifyRuleResponse = client.modifyRule(ruleInfo);
            System.out.println("modify rule success,response:" + modifyRuleResponse);

            // describe rule

            DescribeRuleRequest describeRuleRequest = new DescribeRuleRequest(createRuleResponse.getRuleId());
            DescribeRuleResponse describeRuleResponse = client.describeRule(describeRuleRequest);
            System.out.println("describe rule success,response:" + describeRuleResponse);
            // describe rules
            DescribeRulesRequest describeRulesRequest = new DescribeRulesRequest();
            describeRulesRequest.setProjectId(createProjectResponse.getProjectId());
            DescribeRulesResponse describeRulesResponse = client.describeRules(describeRulesRequest);
            System.out.println("describe rules success,response:" + describeRulesResponse);

            //create host group and apply rule to host group
            CreateHostGroupRequest createHostGroupRequest = new CreateHostGroupRequest();
            createHostGroupRequest.setHostGroupName(prefix + separator + System.currentTimeMillis());
            createHostGroupRequest.setHostGroupType("IP");
            createHostGroupRequest.setHostIpList(Arrays.asList("192.168.0.1", "127.0.0.1"));
            CreateHostGroupResponse createHostGroupResponse = client.createHostGroup(createHostGroupRequest);
            System.out.println("create host group success,response:" + createHostGroupResponse);

            ApplyRuleToHostGroupsRequest applyRuleToHostGroupsRequest = new ApplyRuleToHostGroupsRequest(
                    createRuleResponse.getRuleId(), Arrays.asList(createHostGroupResponse.getHostGroupId()));
            ApplyRuleToHostGroupsResponse applyRuleToHostGroupsResponse = client.applyRuleToHostGroups(applyRuleToHostGroupsRequest);
            System.out.println("apply rule to host group success,response:" + applyRuleToHostGroupsResponse);

            //describe host's rules
            DescribeHostGroupRulesRequest describeHostGroupRulesRequest = new DescribeHostGroupRulesRequest(createHostGroupResponse.getHostGroupId(), 1, 10);
            DescribeHostGroupRulesResponse describeHostGroupRulesResponse = client.describeHostGroupRules(describeHostGroupRulesRequest);
            System.out.println("describe rules of host group success,response:" + describeHostGroupRulesResponse);
            //delete rule from host group
            DeleteRuleFromHostGroupsRequest deleteRuleFromHostGroupsRequest = new DeleteRuleFromHostGroupsRequest(
                    createRuleResponse.getRuleId(), Arrays.asList(createHostGroupResponse.getHostGroupId()));
            DeleteRuleFromHostGroupsResponse deleteRuleFromHostGroupsResponse = client.deleteRuleFromHostGroups(deleteRuleFromHostGroupsRequest);
            System.out.println("delete rule to host group success,response:" + deleteRuleFromHostGroupsResponse);

            //  delete rule
            DeleteRuleResponse deleteRuleResponse = client.deleteRule(new DeleteRuleRequest(createRuleResponse.getRuleId()));
            System.out.println("delete rule success,response:" + deleteRuleResponse);
            //delete host group
            DeleteHostGroupResponse deleteHostGroupResponse = client.deleteHostGroup(new DeleteHostGroupRequest(createHostGroupResponse.getHostGroupId()));
            System.out.println("delete host group success,response:" + deleteHostGroupResponse);
            // delete topic and project
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(createTopicResponse.getTopicId()));
            System.out.println("delete topic success,response:" + deleteTopicResponse);
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
            System.out.println("delete project success,response:" + deleteProjectResponse);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }

}
