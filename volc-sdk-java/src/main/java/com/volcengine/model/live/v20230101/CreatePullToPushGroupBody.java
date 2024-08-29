package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreatePullToPushGroupBody
 */
@lombok.Data
public final class CreatePullToPushGroupBody  {

    /**
     * <p>群组名称，支持有中文、大小写字母和数字组成，最大长度为 20 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>为任务群组设置所属项目，您可以在[访问控制-项目列表](https://console.volcengine.com/iam/resourcemanage/project)查看已有项目并对项目进行管理。</p>
     *
     * <p>项目是火山引擎提供的一种资源管理方式，您可以对不同业务或项目使用的云资源进行分组管理，以实现基于项目的账单查看、子账号授权等功能。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>为任务群组设置资源标签。您可以通过资源标签从不同维度对云资源进行分类和聚合管理，如资源分账等场景。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如需使用标签进行资源分账，可以在可以在[账单管理-费用标签](https://console.volcengine.com/finance/bill/tag/)处管理启用标签，将对应标签运用到账单明细等数据中。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<CreatePullToPushGroupBodyTagsItem> tags;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
