package com.volcengine.model;

import com.volcengine.helper.Const;
import lombok.Data;
import org.apache.http.Header;
import org.apache.http.NameValuePair;

import java.util.List;
import java.util.Map;

@Data
public class ApiInfo {

    private String method;
    private String path;
    private List<NameValuePair> query;
    private List<NameValuePair> form;
    private int connectionTimeout;
    private int socketTimeout;
    private List<Header> header;

    public ApiInfo(Map<String, Object> params) {
        this.method = (String) params.get(Const.Method);
        this.path = (String) params.get(Const.Path);
        this.query = (List<NameValuePair>) params.get(Const.Query);
        this.form = (List<NameValuePair>) params.get(Const.Form);
        this.connectionTimeout = params.get(Const.CONNECTION_TIMEOUT) == null ? 0 : (Integer) params.get(Const.CONNECTION_TIMEOUT);
        this.socketTimeout = params.get(Const.SOCKET_TIMEOUT) == null ? 0 : (Integer) params.get(Const.SOCKET_TIMEOUT);
        this.header = (List<Header>) params.get(Const.Header);
    }
}
