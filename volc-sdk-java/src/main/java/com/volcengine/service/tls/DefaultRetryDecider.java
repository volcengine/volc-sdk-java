package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.RetryDecider;
import org.apache.http.NoHttpResponseException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.Set;

public class DefaultRetryDecider implements RetryDecider {
    @Override
    public boolean shouldRetry(RawResponse response) {
        if (response == null) {
            return false;
        }
        if (response.getCode() == SdkError.SUCCESS.getNumber()) {
            return false;
        }
        int httpCode = response.getHttpCode();
        if (httpCode == 429 || httpCode >= 500 || httpCode == 0) {
            return true;
        }
        return isRetryableException(response.getException());
    }

    private boolean isRetryableException(Throwable t) {
        if (t == null) {
            return false;
        }
        Set<Throwable> seen = new HashSet<>();
        int depth = 0;
        Throwable cur = t;
        while (cur != null && depth < 16 && !seen.contains(cur)) {
            seen.add(cur);
            if (cur instanceof SocketTimeoutException) {
                return true;
            }
            if (cur instanceof ConnectTimeoutException) {
                return true;
            }
            if (cur instanceof ConnectionPoolTimeoutException) {
                return true;
            }
            if (cur instanceof NoHttpResponseException) {
                return true;
            }
            if (cur instanceof EOFException) {
                return true;
            }
            if (cur instanceof InterruptedIOException) {
                return true;
            }
            if (cur instanceof NoRouteToHostException) {
                return true;
            }
            if (cur instanceof ConnectException) {
                return true;
            }
            if (cur instanceof SocketException) {
                String msg = cur.getMessage();
                if (msg != null) {
                    String m = msg.toLowerCase();
                    if (m.contains("connection reset") || m.contains("broken pipe") || m.contains("connection refused")) {
                        return true;
                    }
                }
            }
            cur = cur.getCause();
            depth++;
        }
        return false;
    }
}
