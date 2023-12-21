package com.volcengine.service.vikingDB.common;

import java.util.List;

import com.volcengine.service.vikingDB.VikingDBException;

import lombok.Data;

@Data
public class CreateIndexParam {
    private String collectionName = null;
    private String indexName = null;
    private VectorIndexParams vectorIndex = null;
    private Integer cpuQuoat = 2;
    private String description = "";
    private String partitionBy = "";
    private List<String> scalarIndex = null;
    private Integer shardCount = null;
    private Integer isBuild = 0;
    public CreateIndexParam setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public CreateIndexParam setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public CreateIndexParam setVectorIndex(VectorIndexParams vectorIndex) {
        this.vectorIndex = vectorIndex;
        return this;
    }
    public CreateIndexParam setCpuQuoat(Integer cpuQuoat) {
        this.cpuQuoat = cpuQuoat;
        return this;
    }
    public CreateIndexParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public CreateIndexParam setPartitionBy(String partitionBy) {
        this.partitionBy = partitionBy;
        return this;
    }
    public CreateIndexParam setScalarIndex(List<String> scalarIndex) {
        this.scalarIndex = scalarIndex;
        return this;
    }
    public CreateIndexParam setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public CreateIndexParam build() throws Exception{
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
