package com.volcengine.service.vikingDB.common;

import lombok.Data;

@Data
public class Field {
    private String fieldName;
    private String fieldType;
    private Object defaultVal = null;
    private Integer dim = null;
    private Boolean isPrimaryKey = false;
    private String pipelineName = null;
    public Field(){

    }
    public Field setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public Field setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public Field setDefaultVal(Object defaultVal) {
        this.defaultVal = defaultVal;
        return this;
    }
    public Field setDim(Integer dim) {
        this.dim = dim;
        return this;
    }
    public Field setPrimaryKey(Boolean primaryKey) {
        this.isPrimaryKey = primaryKey;
        return this;
    }
    public Field setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public void resetDefaultVal(){
        if (this.fieldType.equals("int64") && this.defaultVal != null){
            Double x = (Double)this.defaultVal;
            this.defaultVal = x.intValue();
        }
    }
    public Field build(){
        return this;
    }
}
