package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.Map;

@Data
public class SearchAggParam {
    private Map<String, Object> agg = null;
    private Map<String, Object> filter = null;
    private Object partition = "default";
    private Integer isBuild = 0;
    private Boolean retry = false;

    public SearchAggParam setAgg(Map<String, Object> agg) {
        this.agg = agg;
        return this;
    }

    public SearchAggParam setFilter(Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }

    public SearchAggParam setPartition(Object partition) {
        this.partition = partition;
        return this;
    }

    public SearchAggParam setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public SearchAggParam build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.agg == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Agg param does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
