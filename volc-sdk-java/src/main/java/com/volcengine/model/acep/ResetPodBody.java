package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ResetPodBody
 */
@lombok.Data
public final class ResetPodBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID 列表。对多个实例批量执行重置操作，支持的最大实例数量为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>实例重置操作方式。取值如下：</p>
     *
     *
     *
     * <p>- `0`：全部重置，清理应用和文件、包括实例属性</p>
     *
     * <p>	</p>
     *
     * <p>- `1`：清理应用和文件，但保留实例属性</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResetType")
    private Integer resetType;

    /**
     * <p>重置后 data 分区容量大小，可选的容量如下：</p>
     *
     *
     *
     * <p>- 4Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 8Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 12Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 16Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 22Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 32Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 45Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 64Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 128Gi</p>
     *
     * <p>	</p>
     *
     * <p>- 256Gi</p>
     *
     * <p>	</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 如不指定，则默认保持和重置前大小一致。</p>
     *
     * <p>- 当 `ResourceType` 参数取值为 `100` 云盘存储时，该参数才有效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataSize")
    private String dataSize;

    /**
     * <p>系统目录分区保留策略。</p>
     *
     * <p>执行 remount 操作将应用或文件存储至 /system、/vendor 或 /odm 系统目录后，可使用该参数指定重置实例时对系统目录的处理：</p>
     *
     *
     *
     * <p>- 0：（默认值）实例重置时，清除该实例中全部应用和数据；</p>
     *
     * <p>- 1：实例重置时，保留系统目录内的应用和数据，清除系统目录外的全部应用和数据；</p>
     *
     * <p>- 2：实例重置时，保留系统目录外的应用和数据，清除系统目录内的全部应用和数据。</p>
     *
     * <p>> 注意：</p>
     *
     * <p>> 1. remount 功能默认关闭，请联系技术支持开启。</p>
     *
     * <p>> 2. 该参数需配合 2024 年 5 月 16 日及之后发布的公共镜像版本使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SystemDirPersistedType")
    private Integer systemDirPersistedType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
