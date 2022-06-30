package com.volcengine.example.tls;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProjectDemo {
    private static final String PROJECT_NAME = "ProjectNamed";
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
                            add(new BasicHeader("Accept", "*/*"));
                            add(new BasicHeader("Content-Type", "application/json"));
                            add(new BasicHeader("Accept-Encoding", "gzip, deflate, br"));
                            add(new BasicHeader("Region", "your region"));
                            add(new BasicHeader("ServiceName", "TLS"));
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
            RawResponse rawResponse = new HttpCodeTestUtil(TEST_SERVICE, API_INFO_LIST).json(CREATE_PROJECT, new ArrayList<>(), requestBody);
            return String.valueOf(rawResponse.getHttpCode());
        }
    }
}
