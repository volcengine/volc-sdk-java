package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.ProjectInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.PROJECTS_LIST_KEY;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeProjectsResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    int total;
    @JSONField(name = PROJECTS_LIST_KEY)
    List<ProjectInfo> projects;

    public DescribeProjectsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeProjectsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeProjectsResponse response = (DescribeProjectsResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setProjects(response.getProjects());
        return this;
    }
}
