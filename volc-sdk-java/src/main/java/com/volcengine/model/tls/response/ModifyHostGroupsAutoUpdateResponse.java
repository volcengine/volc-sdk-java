package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.ALARM_NOTIFY_GROUP_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ModifyHostGroupsAutoUpdateResponse extends CommonResponse {
    public ModifyHostGroupsAutoUpdateResponse(Header[] headers) { super(headers); }
}
