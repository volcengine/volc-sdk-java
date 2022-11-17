package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;
import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeLogContextResponse extends CommonResponse {

    @JSONField(name = PREV_OVER)
    Boolean prevOver;

    @JSONField(name = NEXT_OVER)
    Boolean nextOver;

    @JSONField(name = LOG_CONTEXT_INFOS)
    List<Map<String, String>> logContextInfos;

    public DescribeLogContextResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeLogContextResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeLogContextResponse response = (DescribeLogContextResponse) super.deSerialize(data, clazz);
        this.setPrevOver(response.getPrevOver());
        this.setNextOver(response.getNextOver());
        this.setLogContextInfos(response.getLogContextInfos());
        return this;
    }
}
