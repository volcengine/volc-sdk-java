package com.volcengine.model.video_aiot.request;

import lombok.Data;

@Data
public class ListSpaceRequest {
    int pageNumber;
    int pageSize;
    int order;
}
