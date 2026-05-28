package com.volcengine.model.tls.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

/**
 * DescribeSessionAnswer 是一个 SSE 流式接口，Java SDK 当前不实现 SSE 解析。
 * 调用方可通过 {@link CommonResponse#getHeaders()} 拿到原始响应头，
 * 并自行从底层 RawResponse 处理流式 body。这里仅作为类型占位以保证接口签名可用。
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeSessionAnswerResponse extends CommonResponse {
    /**
     * 原始 body 字节，调用方自行按 SSE 协议解析。
     */
    private byte[] rawBody;

    public DescribeSessionAnswerResponse(Header[] headers) {
        super(headers);
    }

    public DescribeSessionAnswerResponse(Header[] headers, byte[] rawBody) {
        super(headers);
        this.rawBody = rawBody;
    }
}
