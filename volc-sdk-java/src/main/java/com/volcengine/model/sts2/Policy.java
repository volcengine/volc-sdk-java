package com.volcengine.model.sts2;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Policy {
    @JSONField(name = "Statement")
    private List<Statement> statements = new ArrayList<>();

    public void addStatement(Statement statement){
        statements.add(statement);
    }
}
