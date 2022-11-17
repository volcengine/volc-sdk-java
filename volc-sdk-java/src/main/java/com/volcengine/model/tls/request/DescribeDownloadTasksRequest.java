package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeDownloadTasksRequest {
	@JSONField(serialize = false)
    String topicId;

	@JSONField(serialize = false)
	Integer pageNumber;

	@JSONField(serialize = false)
	Integer pageSize;
}
