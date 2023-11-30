package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

import java.util.Arrays;

public class HostGroupDemo extends BaseDemo {
    public static void main(String[] args) {
        String prefix = "test-group";
        String separator = "-";

        try {
            // 创建机器组
            // 请根据您的需要，填写hostGroupName、hostGroupType和hostIpList等参数
            // CreateHostGroup API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112206
            CreateHostGroupRequest createHostGroupRequest = new CreateHostGroupRequest();
            createHostGroupRequest.setHostGroupName(prefix + separator + System.currentTimeMillis());
            createHostGroupRequest.setHostGroupType("IP");
            createHostGroupRequest.setHostIpList(Arrays.asList("192.168.0.1", "127.0.0.1"));
            CreateHostGroupResponse createHostGroupResponse = client.createHostGroup(createHostGroupRequest);
            System.out.println("create host group success, response: " + createHostGroupResponse);

            String hostGroupID = createHostGroupResponse.getHostGroupId();

            // 修改机器组
            // 请根据您的需要，填写hostGroupId和待修改的机器组信息
            // ModifyHostGroup API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112209
            ModifyHostGroupRequest modifyHostGroupRequest = new ModifyHostGroupRequest();
            modifyHostGroupRequest.setHostGroupId(hostGroupID);
            modifyHostGroupRequest.setHostGroupName(createHostGroupRequest.getHostGroupName() + separator + System.currentTimeMillis());
            modifyHostGroupRequest.setHostGroupType("IP");
            modifyHostGroupRequest.setHostIpList(Arrays.asList("192.168.0.3", "127.0.0.3"));
            ModifyHostGroupResponse modifyHostGroupResponse = client.modifyHostGroup(modifyHostGroupRequest);
            System.out.println("modify host group success, response: " + modifyHostGroupResponse);

            // 获取指定机器组信息
            // 请根据您的需要，填写待查询的HostGroupId
            // DescribeHostGroup API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112210
            DescribeHostGroupResponse describeHostGroupResponse = client.describeHostGroup(new DescribeHostGroupRequest(hostGroupID));
            System.out.println("describe host group success, response: " + describeHostGroupResponse);

            // 获取全部机器组信息
            // 请根据您的需要，填写hostGroupName等可选参数
            // DescribeHostGroups API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112211
            DescribeHostGroupsRequest describeHostGroupsRequest = new DescribeHostGroupsRequest();
            describeHostGroupsRequest.setPageNumber(1);
            describeHostGroupsRequest.setPageSize(10);
            DescribeHostGroupsResponse describeHostGroupsResponse = client.describeHostGroups(describeHostGroupsRequest);
            System.out.println("describe host groups success, response: " + describeHostGroupsResponse);

            // 查询机器组所有机器
            // 请根据您的需要，填写待查询的hostGroupId和其它参数
            // DescribeHosts API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112212
            DescribeHostsRequest describeHostsRequest = new DescribeHostsRequest();
            describeHostsRequest.setHostGroupId(hostGroupID);
            describeHostsRequest.setHeartbeatStatus(1);
            DescribeHostsResponse describeHostsResponse = client.describeHosts(describeHostsRequest);
            System.out.println("describe hosts success, response: " + describeHostsResponse);

            // 删除机器组内指定机器
            // 请根据您的需要，填写待删除机器的hostGroupId和IP
            // DeleteHost API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112213
            DeleteHostRequest deleteHostRequest = new DeleteHostRequest(hostGroupID, "192.168.0.3");
            DeleteHostResponse deleteHostResponse = client.deleteHost(deleteHostRequest);
            System.out.println("delete host to group success, response: " + deleteHostResponse);

            // 删除机器组
            // 请根据您的需要，填写待删除的hostGroupId
            // DeleteHostGroup API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112208
            DeleteHostGroupResponse deleteHostGroupResponse = client.deleteHostGroup(new DeleteHostGroupRequest(hostGroupID));
            System.out.println("delete host group success, response: " + deleteHostGroupResponse);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }
}
