package com.volcengine.service.vikingDB.common;

import java.util.List;

import lombok.Data;
@Data
public class ID {
    String stringID = null;
    Integer integerID = null;
    List<Integer> listIntegerID = null;
    List<String> listStringID = null;
    public ID(){}
    public ID setStringID(String stringID){
        this.stringID = stringID;
        return this;
    }
    public ID setIntegerID(Integer integerID){
        this.integerID = integerID;
        return this;
    }
    public ID setListIntegerID(List<Integer> listIntegerID){
        this.listIntegerID = listIntegerID;
        return this;
    }
    public ID setListStringID(List<String> listStringID){
        this.listStringID = listStringID;
        return this;
    }
}
