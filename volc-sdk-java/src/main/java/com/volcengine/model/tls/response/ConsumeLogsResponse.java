package com.volcengine.model.tls.response;

import com.google.protobuf.InvalidProtocolBufferException;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.pb.RawLog;
import com.volcengine.util.EncodeUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.*;


@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ConsumeLogsResponse extends CommonResponse {
    private static final Log LOG = LogFactory.getLog(ConsumeLogsResponse.class);

    PutLogRequest.LogGroupList logGroupList;
    String xTlsCursor;
    int xTlsCount;
    String decompress;
    boolean origin;

    public ConsumeLogsResponse(Header[] headers, String decompress, Boolean origin) {
        super(headers);
        this.decompress = decompress;
        if (origin) {
            this.origin = Boolean.parseBoolean(this.getFirstHeader(TLS_ORIGINAL_HEADER));
        }
    }

    @Override
    public ConsumeLogsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        if (origin) {
            RawLog.RawLogGroupListList rawLogGroupListList;
            try {
                rawLogGroupListList = RawLog.RawLogGroupListList.parseFrom(data);
            } catch (InvalidProtocolBufferException e) {
                throw new LogException("RawLogGroupListList parse error", "RequestId is:" + getRequestId(), getRequestId());
            }
            PutLogRequest.LogGroupList.Builder builder = PutLogRequest.LogGroupList.newBuilder();
            for (RawLog.RawLogGroupList rawLogGroupList : rawLogGroupListList.getRawLogGroupListsList()) {
                byte[] decompressBytes;
                try {
                    decompressBytes = EncodeUtil.decompress(rawLogGroupList.getData().toByteArray(),
                            rawLogGroupList.getOriginLen(), rawLogGroupList.getCompressType().toLowerCase());
                } catch (Exception e) {
                    throw new LogException("decompress error", "RequestId is:" + getRequestId(), getRequestId());
                }
                if (decompressBytes != null) {
                    try {
                        PutLogRequest.LogGroupList groupList = PutLogRequest.LogGroupList.parseFrom(decompressBytes);
                        for (PutLogRequest.LogGroup logGroup : groupList.getLogGroupsList()) {
                            builder = builder.addLogGroups(logGroup);
                        }
                    } catch (InvalidProtocolBufferException e) {
                       LOG.error("LogGroupList parse error, RequestId is: " + getRequestId() + ", skip count " + rawLogGroupList.getLogCount(), e);
                    }
                }
            }
            this.setLogGroupList(builder.build());
        } else {
            byte[] decompressBytes = data;
            if (getDecompress() != null &&  data != null) {
                int bodyRawSize = Integer.valueOf(this.getFirstHeader(X_TLS_BODY_RAW_SIZE));

                try {
                    decompressBytes = EncodeUtil.decompress(data, bodyRawSize, getDecompress());
                } catch (Exception e) {
                    throw new LogException("decompress error", "RequestId is:" + getRequestId(), getRequestId());
                }
            }
            if (decompressBytes != null) {
                try {
                    this.setLogGroupList(PutLogRequest.LogGroupList.parseFrom(decompressBytes));
                } catch (InvalidProtocolBufferException e) {
                    throw new LogException("LogGroupList parse error", "RequestId is:" + getRequestId(), getRequestId());
                }
            }
        }
        this.setXTlsCursor(this.getFirstHeader(X_TLS_CURSOR));
        this.setXTlsCount(Integer.valueOf(this.getFirstHeader(X_TLS_COUNT)));
        return this;
    }
}
