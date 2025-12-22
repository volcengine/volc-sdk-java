package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class GetAccountStatusResponse extends CommonResponse {
    @JSONField(name = "ArchVersion")
    private String archVersion;
    
    @JSONField(name = "Status")
    private String status;

    public GetAccountStatusResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public GetAccountStatusResponse deSerialize(byte[] data, Class clazz) throws LogException {
        GetAccountStatusResponse response = (GetAccountStatusResponse) super.deSerialize(data, clazz);
        this.setArchVersion(response.getArchVersion());
        this.setStatus(response.getStatus());
        return this;
    }
}