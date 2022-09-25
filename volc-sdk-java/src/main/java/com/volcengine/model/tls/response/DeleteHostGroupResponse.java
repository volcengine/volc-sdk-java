package com.volcengine.model.tls.response;

import com.volcengine.model.Header;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DeleteHostGroupResponse extends CommonResponse {
    public DeleteHostGroupResponse(Header[] headers) {
        super(headers);
    }
}
