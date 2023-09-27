package com.volcengine.model.tls.consumer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckpointInfo {
    String checkpoint;
    ConsumeShard shardInfo;

    public CheckpointInfo(String checkpoint, ConsumeShard shardInfo) {
        this.checkpoint = checkpoint;
        this.shardInfo = shardInfo;
    }
}
