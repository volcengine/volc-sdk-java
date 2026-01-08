package com.volcengine.model.tls.response;

import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DeleteETLTaskResponse extends CommonResponse {
    public DeleteETLTaskResponse(Header[] headers) throws LogException {
        super(headers);
    }

    @Override
    public DeleteETLTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        return (DeleteETLTaskResponse) super.deSerialize(data, clazz);
    }
}
