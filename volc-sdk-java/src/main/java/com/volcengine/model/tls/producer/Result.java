package com.volcengine.model.tls.producer;

import lombok.Data;

import java.util.List;

@Data
public class Result {
    boolean success;
    List<Attempt> attempts;
    int attemptCount;

    public Result(boolean success, List<Attempt> attempts, int attemptCount) {
        this.success = success;
        this.attempts = attempts;
        this.attemptCount = attemptCount;
    }

}
