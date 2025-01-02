package com.volcengine.service.vikingDB.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class VectorIndexParams {
    private String indexType = DistanceType.IP;
    private String distance = IndexType.HNSW;
    private String quant = QuantType.Int8;
    private Integer hnswM = 20;
    private Integer hnswCef = 400;
    private Integer hnswSef = 800;

    public Map<String, Object> dict() {
        Map<String, Object> map = new HashMap<>();
        map.put("distance", distance);
        map.put("index_type", indexType);
        map.put("quant", quant);
        map.put("hnsw_m", hnswM);
        map.put("hnsw_cef", hnswCef);
        map.put("hnsw_sef", hnswSef);
        return map;
    }

    public VectorIndexParams setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }

    public VectorIndexParams setDistance(String distance) {
        this.distance = distance;
        return this;
    }

    public VectorIndexParams setQuant(String quant) {
        this.quant = quant;
        return this;
    }

    public VectorIndexParams setHnswM(Integer hnswM) {
        this.hnswM = hnswM;
        return this;
    }

    public VectorIndexParams setHnswM(Long hnswM) {
        this.hnswM = hnswM.intValue();
        return this;
    }

    public VectorIndexParams setHnswCef(Integer hnswCef) {
        this.hnswCef = hnswCef;
        return this;
    }

    public VectorIndexParams setHnswCef(Long hnswCef) {
        this.hnswCef = hnswCef.intValue();
        return this;
    }

    public VectorIndexParams setHnswSef(Integer hnswSef) {
        this.hnswSef = hnswSef;
        return this;
    }

    public VectorIndexParams setHnswSef(Long hnswSef) {
        this.hnswSef = hnswSef.intValue();
        return this;
    }

    public VectorIndexParams build() {
        return this;
    }
}
