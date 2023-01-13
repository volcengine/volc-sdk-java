package com.volcengine.service.notify.model.response;

import lombok.*;

import java.util.List;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class QueryOpenGetResourceResult {
    private List<ResourceResult> records;
}
