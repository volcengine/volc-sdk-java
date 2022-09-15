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
            //create host group
            CreateHostGroupRequest createHostGroupRequest = new CreateHostGroupRequest();
            createHostGroupRequest.setHostGroupName(prefix + separator + System.currentTimeMillis());
            createHostGroupRequest.setHostGroupType("IP");
            createHostGroupRequest.setHostIpList(Arrays.asList("192.168.0.1", "127.0.0.1"));
            CreateHostGroupResponse createHostGroupResponse = client.createHostGroup(createHostGroupRequest);
            System.out.println("create host group success,response:" + createHostGroupResponse);

            //modify host group
            ModifyHostGroupRequest modifyHostGroupRequest = new ModifyHostGroupRequest();
            modifyHostGroupRequest.setHostGroupId(createHostGroupResponse.getHostGroupId());
            modifyHostGroupRequest.setHostGroupName(createHostGroupRequest.getHostGroupName() + separator
                    + System.currentTimeMillis());
            modifyHostGroupRequest.setHostGroupType("IP");
            modifyHostGroupRequest.setHostIdentifier("auto-label");
            modifyHostGroupRequest.setHostIpList(Arrays.asList("192.168.0.3", "127.0.0.3"));
            ModifyHostGroupResponse modifyHostGroupResponse = client.modifyHostGroup(modifyHostGroupRequest);
            System.out.println("modify host group success,response:" + modifyHostGroupResponse);

            //describe host group
            DescribeHostGroupResponse describeHostGroupResponse = client.describeHostGroup(
                    new DescribeHostGroupRequest(createHostGroupResponse.getHostGroupId()));
            System.out.println("describe host group success,response:" + describeHostGroupResponse);
            //describe host groups
            DescribeHostGroupsRequest describeHostGroupsRequest = new DescribeHostGroupsRequest();
            describeHostGroupsRequest.setPageNumber(1);
            describeHostGroupsRequest.setPageSize(10);
            DescribeHostGroupsResponse describeHostGroupsResponse =
                    client.describeHostGroups(describeHostGroupsRequest);
            System.out.println("describe host groups success,response:" + describeHostGroupsResponse);

            //describe host
            DescribeHostsRequest describeHostsRequest = new DescribeHostsRequest();
            describeHostsRequest.setHostGroupId(createHostGroupResponse.getHostGroupId());
            describeHostsRequest.setHeartbeatStatus(1);
            DescribeHostsResponse describeHostsResponse = client.describeHosts(describeHostsRequest);
            System.out.println("describe hosts success,response:" + describeHostsResponse);

            //delete host to group
            DeleteHostRequest deleteHostRequest =
                    new DeleteHostRequest(createHostGroupResponse.getHostGroupId(), "192.168.0.3");
            DeleteHostResponse deleteHostResponse = client.deleteHost(deleteHostRequest);
            System.out.println("delete host to group success,response:" + deleteHostResponse);


            //delete host group
            DeleteHostGroupResponse deleteHostGroupResponse =
                    client.deleteHostGroup(new DeleteHostGroupRequest(createHostGroupResponse.getHostGroupId()));
            System.out.println("delete host group success,response:" + deleteHostGroupResponse);

        } catch (LogException e) {
            e.printStackTrace();
        }
    }

}
