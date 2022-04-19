package com.volcengine.http;

import com.volcengine.helper.Const;
import lombok.Builder;
import lombok.Getter;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DynamicTimeoutInterceptor implements Interceptor {
    private DynamicTimeoutConfig defaultTimeout;

    private Map<String, DynamicTimeoutConfig> apiTimeout;

    public DynamicTimeoutInterceptor(DynamicTimeoutConfig defaultTimeout, Map<String, DynamicTimeoutConfig> apiTimeout) {
        this.defaultTimeout = defaultTimeout;
        this.apiTimeout = apiTimeout;
    }

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Request request = chain.request();
        if (defaultTimeout != null) {
            if (defaultTimeout.connectTimeout > 0) {
                chain.withConnectTimeout(defaultTimeout.connectTimeout, TimeUnit.MILLISECONDS);
            }
            if (defaultTimeout.readTimeout > 0) {
                chain.withReadTimeout(defaultTimeout.connectTimeout, TimeUnit.MILLISECONDS);
            }
        }
        List<String> actions = request.url().queryParameterValues(Const.Action);
        if (actions.size() == 1) {
            String action = actions.get(0);
            if (apiTimeout.containsKey(action)) {
                DynamicTimeoutConfig newTimeout = apiTimeout.get(action);
                if (newTimeout.connectTimeout > 0) {
                    chain.withConnectTimeout(newTimeout.connectTimeout, TimeUnit.MILLISECONDS);
                }
                if (newTimeout.readTimeout > 0) {
                    chain.withReadTimeout(newTimeout.connectTimeout, TimeUnit.MILLISECONDS);
                }
            }
        }
        return chain.proceed(request);
    }

    public static class DynamicTimeoutConfig {
        private final int connectTimeout;
        private final int readTimeout;

        public DynamicTimeoutConfig(int connectMills, int socketMills) {
            this.connectTimeout = connectMills;
            this.readTimeout = socketMills;
        }
    }
}
