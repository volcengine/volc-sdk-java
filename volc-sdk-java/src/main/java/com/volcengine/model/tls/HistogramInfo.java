package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class HistogramInfo {
    @JSONField(name = TIME)
    Integer time;
    @JSONField(name = COUNT)
    Integer count;
}
