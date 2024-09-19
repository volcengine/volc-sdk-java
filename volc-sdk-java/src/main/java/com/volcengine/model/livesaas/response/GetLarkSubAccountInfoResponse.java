package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetLarkSubAccountInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetLarkSubAccountInfoBody result;

    @Data
    public static class GetLarkSubAccountInfoBody {
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "EmployeeNo")
        String EmployeeNo;
        @JSONField(name = "Departments")
        List<LarkDepartment> Departments;
    }

    @Data
    public static class LarkDepartment {
        @JSONField(name = "DepartmentId")
        String DepartmentId;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "SubDepartment")
        LarkDepartment SubDepartment;
    }
}