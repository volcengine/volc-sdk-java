package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.response.CommonResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.DOWNLOAD_URL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeDownloadUrlResponse extends CommonResponse {

    @JSONField(name = DOWNLOAD_URL)
    String downloadUrl;

    public DescribeDownloadUrlResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeDownloadUrlResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeDownloadUrlResponse response = (DescribeDownloadUrlResponse) super.deSerialize(data, clazz);
        this.setDownloadUrl(response.getDownloadUrl());
        return this;
    }
}
