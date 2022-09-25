package com.volcengine.model.tls.response;

import com.volcengine.model.Header;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DeleteProjectResponse extends CommonResponse {
    public DeleteProjectResponse(Header[] headers) {
        super(headers);
    }
}
