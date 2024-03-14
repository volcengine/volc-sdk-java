package com.volcengine.service.vikingDB.common;

import java.util.List;

import com.volcengine.service.vikingDB.VikingDBException;

import lombok.Data;

@Data
public class UpdateIndexParam {
    private String collectionName = null;
    private String indexName = null;
    private Integer cpuQuoat = null;
    private String description = null;
    private List<String> scalarIndex = null;
    private Integer shardCount = null;
    private Integer isBuild = 0;
    public UpdateIndexParam setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public UpdateIndexParam setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public UpdateIndexParam setCpuQuoat(Integer cpuQuoat) {
        this.cpuQuoat = cpuQuoat;
        return this;
    }
    public UpdateIndexParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public UpdateIndexParam setScalarIndex(List<String> scalarIndex) {
        this.scalarIndex = scalarIndex;
        return this;
    }
    public UpdateIndexParam setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public UpdateIndexParam build() throws Exception{
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if(this.collectionName == null){
            throw vikingDBException.getErrorCodeException(1000030, null, "CollectionName does not exist");
        } else if(this.indexName == null){
            throw vikingDBException.getErrorCodeException(1000030, null, "IndexName does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}

