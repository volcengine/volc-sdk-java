package com.volcengine.model.tls.stats;

public enum WorkerRole {
    DISPATCHER("dispatcher"), MOVER("mover"), SENDER("sender"),
    CALLBACK_DISPATCHER("callback_dispatcher"), MAIN_LOOP("main_loop"),
    HEARTBEAT("heartbeat"), CHECKPOINT("checkpoint"), SHARD_WORKER("shard_worker");

    private final String wireName;

    WorkerRole(String wireName) {
        this.wireName = wireName;
    }

    public String getWireName() {
        return wireName;
    }
}
