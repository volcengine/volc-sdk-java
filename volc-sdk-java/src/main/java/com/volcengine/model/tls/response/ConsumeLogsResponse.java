package com.volcengine.model.tls.response;

import com.google.protobuf.InvalidProtocolBufferException;
import com.volcengine.model.Header;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.util.EncodeUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.*;


@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ConsumeLogsResponse extends CommonResponse {
    PutLogRequest.LogGroupList logGroupList;
    String xTlsCursor;
    int xTlsCount;
    String decompress;

    public ConsumeLogsResponse(Header[] headers, String decompress) {
        super(headers);
        this.decompress = decompress;
    }

    @Override
    public ConsumeLogsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        byte[] decompressBytes = data;
        if (getDecompress() != null && getDecompress().equalsIgnoreCase(LZ4) && data != null) {
            decompressBytes = EncodeUtil.lz4Decompress(data);
        }
        if (decompressBytes != null) {
            try {
                this.setLogGroupList(PutLogRequest.LogGroupList.parseFrom(decompressBytes));
            } catch (InvalidProtocolBufferException e) {
                throw new LogException("Lz4 decompress error", "RequestId is:" + getRequestId(), getRequestId());
            }
        }
        this.setXTlsCursor(this.getFirstHeader(X_TLS_CURSOR));
        this.setXTlsCount(Integer.valueOf(this.getFirstHeader(X_TLS_COUNT)));
        return this;
    }
}
