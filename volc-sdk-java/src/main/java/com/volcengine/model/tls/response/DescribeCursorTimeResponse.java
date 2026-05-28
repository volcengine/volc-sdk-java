package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.CURSOR_TIME;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeCursorTimeResponse extends CommonResponse {
    @JSONField(name = CURSOR_TIME)
    private Long cursorTime;

    public DescribeCursorTimeResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeCursorTimeResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeCursorTimeResponse response = (DescribeCursorTimeResponse) super.deSerialize(data, clazz);
        this.cursorTime = response.cursorTime;
        return this;
    }
}
