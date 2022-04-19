package com.volcengine.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Builder
@Setter
@Getter
public class RequestParam {

    public RequestParam() {

    }

    private Boolean isSignUrl;
    private byte[] body;
    private String method;
    private Date date;
    private String path;
    private String host;
    private List<NameValuePair> queryList;
    private List<Header> headers;
}
