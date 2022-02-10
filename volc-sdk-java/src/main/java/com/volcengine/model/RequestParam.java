package com.volcengine.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.http.Header;
import org.apache.http.NameValuePair;

import java.util.Date;
import java.util.List;

@Builder
@Setter
@Getter
public class RequestParam {
    private Boolean isSignUrl;
    private byte[] body;
    private String method;
    private Date date;
    private String path;
    private String host;
    private List<NameValuePair> queryList;
    private Header[] headers;
}
