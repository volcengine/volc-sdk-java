package com.volcengine.service.tls;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.helper.Const;
import com.volcengine.model.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProjectDemo {
    private static final String PROJECT_NAME = "ProjectName";
    private static final String REGION = "Region";
    private static final String DESCRIPTION = "Description";
    private static final String CREATE_PROJECT = "/CreateProject";
    private static final String POST = "POST";
    public static Credentials TEST_CREDENTIALS = new Credentials("your region", "TLS");
    public static Map<String, ApiInfo> API_INFO_LIST = new HashMap<String, ApiInfo>() {
        {
            //config for project create modify describe search delete
            put(CREATE_PROJECT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, POST);
                            put(Const.Path, CREATE_PROJECT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
        }

    };
    public final static ServiceInfo TEST_SERVICE = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.Scheme, "your scheme http or https");
                    put(Const.Host, "your host");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new Header("Accept", "*/*"));
                            add(new Header("Content-Type", "application/json"));
                            add(new Header("Accept-Encoding", "gzip, deflate, br"));
                            add(new Header("Region", "your region"));
                            add(new Header("ServiceName", "TLS"));
                        }
                    });
                    put(Const.Credentials, TEST_CREDENTIALS);
                }
            }
    );

    static class HttpCodeTestUtil extends BaseServiceImpl {
        public HttpCodeTestUtil(ServiceInfo info, Map<String, ApiInfo> apiInfoList) {
            super(info, apiInfoList);
            setAccessKey("your accessKey");
            setSecretKey("you secret");
        }
    }

    @Data
    @AllArgsConstructor
    static class CreateProjectRequest {
        @JSONField(name = PROJECT_NAME)
        String projectName;
        @JSONField(name = REGION)
        String region;
        @JSONField(name = DESCRIPTION)
        String description;
    }

    public static void main(String[] args) {
        String project = new ProjectDemo().createProject("test-project-name", "your region", "Description-test");
    }

    public String createProject(String projectName, String region, String description) {
        if (StringUtils.isEmpty(projectName) || StringUtils.isEmpty(region)) {
            return null;
        } else {
            String requestBody = JSONObject.toJSONString(new CreateProjectRequest(projectName, region, description));
            RawResponse rawResponse = new HttpCodeTestUtil(TEST_SERVICE, API_INFO_LIST).json(CREATE_PROJECT, new ArrayList<NameValuePair>(), requestBody);
            return rawResponse.getFirstHeader("X-Tls-Requestid");
        }
    }
}
