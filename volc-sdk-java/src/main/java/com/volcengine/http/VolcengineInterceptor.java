package com.volcengine.http;

import com.volcengine.auth.ISignerV4;
import com.volcengine.helper.Const;
import com.volcengine.helper.SDKVersion;
import com.volcengine.model.*;
import com.volcengine.model.Credentials;
import okhttp3.*;
import okio.Buffer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class VolcengineInterceptor implements Interceptor {

    public ISignerV4 signer;

    public Credentials credentials;

    public VolcengineInterceptor(ISignerV4 signer, Credentials credentials) {
        this.signer = signer;
        this.credentials = credentials;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request req = chain.request();
        RequestParam param = new RequestParam();
        param.setBody(getBytes(req));
        param.setHost(req.url().host());
        param.setPath(req.url().encodedPath());
        param.setMethod(req.method());
        param.setQueryList(convertQuery(req.url()));
        param.setHeaders(convertHeader(req.headers()));
        param.setIsSignUrl(false);
        param.setDate(new Date());

        SignRequest signRequest;
        try {
            signRequest = signer.getSignRequest(param, credentials);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        if (signRequest == null) {
            throw new IllegalArgumentException("Sign Error");
        }
        System.out.println(signRequest);
        Request.Builder newReq = req.newBuilder();
        newReq.addHeader(Const.XDate, signRequest.getXDate());
        if (signRequest.getXNotSignBody() != null) {
            newReq.addHeader(Const.XNotSignBody, signRequest.getXNotSignBody());
        }
        newReq.header(Const.ContentType, signRequest.getContentType());
        newReq.addHeader(Const.XContentSha256, signRequest.getXContentSha256());
        newReq.addHeader(Const.Authorization, signRequest.getAuthorization());
        newReq.addHeader(Const.USERAGENT, SDKVersion.getAGENT());
        return chain.proceed(newReq.build());
    }

    private List<Header> convertHeader(Headers headers) {
        List<Header> list = new ArrayList<>();
        for (String name : headers.names()) {
            for (String value : headers.values(name)) {
                list.add(new Header(name, value));
            }
        }
        return list;
    }

    private List<NameValuePair> convertQuery(HttpUrl url) {
        Set<String> names = url.queryParameterNames();
        ArrayList<NameValuePair> list = new ArrayList<NameValuePair>(names.size());
        for (String name : names) {
            for (String value : url.queryParameterValues(name)) {
                list.add(new NameValuePair(name, value));
            }
        }
        return list;
    }

    private byte[] getBytes(Request req) throws IOException {
        if (req.body() == null || req.body().contentLength() == 0) {
            return new byte[0];
        }
        RequestBody body = req.body();
        Buffer b = new Buffer();
        body.writeTo(b);
        return b.readByteArray();
    }
}
