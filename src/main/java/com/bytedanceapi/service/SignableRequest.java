package com.bytedanceapi.service;

import lombok.Data;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.utils.URIBuilder;

@Data
public class SignableRequest extends HttpEntityEnclosingRequestBase {
    private String method;
    private URIBuilder uriBuilder = new URIBuilder();
}
