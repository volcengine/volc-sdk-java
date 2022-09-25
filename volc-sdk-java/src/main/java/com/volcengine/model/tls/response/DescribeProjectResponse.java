package com.volcengine.model.tls.response;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.ProjectInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeProjectResponse extends CommonResponse {

    ProjectInfo projectInfo;

    public DescribeProjectResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeProjectResponse deSerialize(byte[] data, Class clazz) throws LogException {
        ProjectInfo projectInfo = JSONObject.parseObject(data, ProjectInfo.class);
        this.setProjectInfo(projectInfo);
        return this;
    }
}
