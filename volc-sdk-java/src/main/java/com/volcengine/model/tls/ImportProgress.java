package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ImportProgress {
    /**
     * 已导入日志条数
     */
    @JSONField(name = IMPORTED_LOG_COUNT)
    private Long importedLogCount;

    /**
     * 总日志条数
     */
    @JSONField(name = TOTAL_LOG_COUNT)
    private Long totalLogCount;

    /**
     * 导入进度百分比
     */
    @JSONField(name = PERCENTAGE)
    private Double percentage;
}