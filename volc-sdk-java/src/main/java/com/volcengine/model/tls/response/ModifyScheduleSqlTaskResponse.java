package com.volcengine.model.tls.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ModifyScheduleSqlTaskResponse extends CommonResponse {

    /**
     * 使用 HTTP 响应头构造响应对象.
     *
     * @param headers HTTP 响应头
     */
    public ModifyScheduleSqlTaskResponse(final Header[] headers) {
        super(headers);
    }
}
