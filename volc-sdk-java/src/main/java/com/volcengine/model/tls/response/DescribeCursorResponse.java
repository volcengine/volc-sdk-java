package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.CURSOR;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeCursorResponse extends CommonResponse {
    @JSONField(name = CURSOR)
    String cursor;

    public DescribeCursorResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeCursorResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeCursorResponse response = (DescribeCursorResponse) super.deSerialize(data, clazz);
        this.setCursor(response.getCursor());
        return this;
    }
}
