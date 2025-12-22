package com.volcengine.model.tls.response;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.exception.LogException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.X_TLS_REQUESTID;


@Data
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {
    String requestId;
    Header[] headers;

    public CommonResponse(Header[] headers) {
        this.headers = headers;
        requestId = getFirstHeader(X_TLS_REQUESTID);
    }


    public String getFirstHeader(String key) {
        if (key != null && headers != null) {
            for (Header header : headers) {
                if (header.getName().equalsIgnoreCase(key)) {
                    return header.getValue();
                }
            }
        }
        return null;
    }

    public CommonResponse deSerialize(byte[] data, Class clazz) throws LogException {
        return JSONObject.parseObject(data, clazz);
    }
}