package com.volcengine.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetSignatureIdentListRequest {
    @JSONField(name = "id")
    long id;

    @JSONField(name = "materialName")
    String materialName;

    @JSONField(name = "operatorPersonName")
    String operatorPersonName;

    @JSONField(name = "responsiblePersonName")
    String responsiblePersonName;

    @JSONField(name = "businessCertificateName")
    String businessCertificateName;

    @JSONField(name = "effectSignatures")
    String effectSignatures;

    @JSONField(name = "status")
    List<Integer> status;

    @JSONField(name = "pageIndex")
    int pageIndex;

    @JSONField(name = "pageSize")
    int pageSize;

    @JSONField(name = "from")
    String from;

    @JSONField(name = "ids")
    List<Long> ids;
}
