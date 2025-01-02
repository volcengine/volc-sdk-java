package com.volcengine.service.vikingDB.common;

import lombok.Data;

import java.util.List;

@Data
public class IndexSortResult<T> {
    private List<T> primaryKeyNotExist;
    private List<InnerSortResult<T>> sortResult;

    @Data
    public static class InnerSortResult<T> {
        private T primaryKey;
        private Double score;

        public InnerSortResult<T> setPrimaryKey(T primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public InnerSortResult<T> setScore(Double score) {
            this.score = score;
            return this;
        }
    }
}
