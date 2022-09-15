package com.volcengine.model.tls;

import lombok.Data;

import java.util.List;

@Data
public class ListBean<T> {
    private List<T> t;
    private int total;
}
