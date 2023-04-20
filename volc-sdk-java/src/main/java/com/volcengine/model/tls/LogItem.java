package com.volcengine.model.tls;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class LogItem {
    private long time;
    private List<LogContent> contents;

    public LogItem() {
        this.contents = new ArrayList<>();
    }

    public LogItem(long time) {
        this.time = time;
        this.contents = new ArrayList<>();
    }

    public LogItem(long time, List<LogContent> contents) {
        this.time = time;
        this.contents = contents;
    }

    public void addContent(String key, String value) {
        this.addContent(new LogContent(key, value));
    }

    public void addContent(LogContent content) {
        this.contents.add(content);
    }
}
