package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * EsSourceInfo 定义 Elasticsearch 导入源配置。
 */
@Data
@NoArgsConstructor
public class EsSourceInfo {

    @JSONField(name = "endpoint")
    private String endpoint;

    @JSONField(name = "import_mode")
    private String importMode;

    @JSONField(name = "index")
    private String index;

    @JSONField(name = "log_time_config")
    private LogTimeConfig logTimeConfig;

    @JSONField(name = "max_import_time_delay_second")
    private Integer maxImportTimeDelaySecond;

    @JSONField(name = "password")
    private String password;

    @JSONField(name = "query_string")
    private String queryString;

    @JSONField(name = "username")
    private String username;
}
