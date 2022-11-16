package com.volcengine.example.cloudtrail;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN.Condition;
import com.volcengine.model.request.cloudtrail.LookupEventsRequest;
import com.volcengine.model.response.cloudtrail.LookupEventsResponse;
import com.volcengine.service.cloudtrail.ICloudTrailService;
import com.volcengine.service.cloudtrail.impl.CloudTrailServiceImpl;

public class LookupEventsDemo {

    public static void main(String[] args) {
        ICloudTrailService cloudTrailService = CloudTrailServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        cloudTrailService.setAccessKey("testak");
        cloudTrailService.setSecretKey("testsk");
        // lookup events
        try {
            LookupEventsRequest lookupEventsRequest = new LookupEventsRequest();
            lookupEventsRequest.setMaxResults(10);
            
            LookupEventsRequest.LookupCondition condition1 = new LookupEventsRequest.LookupCondition();
            condition1.setLookupConditionKey("EventSource");
            condition1.setLookupConditionValue("iam");

            List<LookupEventsRequest.LookupCondition> conditions = new ArrayList() {
                {
                    add(condition1);
                }    
            };
            lookupEventsRequest.setLookupConditions(conditions);

            LookupEventsResponse lookupEventsResponse = cloudTrailService.lookupEvents(lookupEventsRequest);
            System.out.println(JSON.toJSONString(lookupEventsResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
