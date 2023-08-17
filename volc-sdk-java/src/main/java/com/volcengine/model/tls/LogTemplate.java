package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.FORMAT;
import static com.volcengine.model.tls.Const.TYPE;

@Data
@NoArgsConstructor
public class LogTemplate {
    @JSONField(name = TYPE)
    String type;
    @JSONField(name = FORMAT)
    String format;

    /**
     * @param type   日志模板的类型：Nginx
     * @param format 日志模板内容
     */
    public LogTemplate(String type, String format) {
        this.type = type;
        this.format = format;
    }

    /**
     * @return 日志模板的类型：Nginx
     */
    public String getType() {
        return type;
    }

    /**
     * @param type 日志模板的类型：Nginx
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return 日志模板内容
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format 日志模板内容
     */
    public void setFormat(String format) {
        this.format = format;
    }
}
