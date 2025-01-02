package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.List;

@Data
public class IndexSortParam<T> {
    private List<Double> queryVector = null;
    private List<T> primaryKeys = null;
    private Boolean retry = false;
    private Integer isBuild = 0;

    public IndexSortParam<T> setQueryVector(List<Double> queryVector) {
        this.queryVector = queryVector;
        return this;
    }

    public IndexSortParam<T> setPrimaryKeys(List<T> primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }

    public IndexSortParam<T> setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public IndexSortParam<T> build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.queryVector == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "queryVector does not set");
        } else if (this.primaryKeys == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "primaryKeys does not set");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
