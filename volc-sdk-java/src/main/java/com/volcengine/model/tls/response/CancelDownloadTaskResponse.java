package com.volcengine.model.tls.response;

import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CancelDownloadTaskResponse extends CommonResponse {

    public CancelDownloadTaskResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CancelDownloadTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CancelDownloadTaskResponse response = (CancelDownloadTaskResponse) super.deSerialize(data, clazz);
        return this;
    }
}