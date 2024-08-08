package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ScreenShotBody
 */
@lombok.Data
public final class ScreenShotBody  {

    /**
     * <p>实例 ID，可通过调用 `ListPod` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>实例所属业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>截图请求的唯一标识，防止由于网络等原因造成重复请求，同一 `RoundId` 在 5 分钟内只可使用一次。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoundId")
    private String roundId;

    /**
     * <p>是否保存截图文件在云手机实例：</p>
     *
     *
     *
     * <p>- true：上传截图文件到火山引擎对象存储，并保存截图文件在云手机实例中。</p>
     *
     * <p>	</p>
     *
     * <p>- false：默认值，上传截图文件到火山引擎对象存储，上传完成后，删除保存在云手机实例中的文件。</p>
     *
     * <p>	</p>
     *
     *
     *
     * <p>截图文件保存和清理逻辑如下：</p>
     *
     *
     *
     * <p>- 当保存截图文件在云手机实例时，截图超过 1000 张时会清理之前保存的截图文件；</p>
     *
     * <p>	</p>
     *
     * <p>- 当上传截图文件到火山引擎对象存储时，截图上传到对象存储成功后再清理云手机实例中的截图文件；</p>
     *
     * <p>	</p>
     *
     * <p>- 当云手机存储空间小于 600MB 时：</p>
     *
     * <p>	- 若设置该参数为 `true`，则不可执行截图操作；</p>
     *
     * <p>	- 若设置该参数为 `false`，可执行截图操作。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsSavedOnPod")
    private Boolean isSavedOnPod;

    /**
     * <p>截图画面横竖屏旋转：</p>
     *
     *
     *
     * <p>- 0：默认值，截图方向不做处理；</p>
     *
     * <p>- 1：截图画面旋转为竖屏：</p>
     *
     * <p>	- 手机竖屏的截图，不做处理；</p>
     *
     * <p>	- 手机横屏的截图，截图顺时针旋转 90 度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rotation")
    private Integer rotation;

    /**
     * <p>截图事件是否广播：</p>
     *
     *
     *
     * <p>- true：默认值，广播；</p>
     *
     * <p>	</p>
     *
     * <p>- false：不广播。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsBroadcasted")
    private Boolean isBroadcasted;

    /**
     * <p>设置截图地址回调触发的频次：</p>
     *
     * <p>- 0/1/置空：当前行为/默认行为，表示每次调用本接口发起截图，都会刷新 URL，触发新的截图地址回调；</p>
     *
     * <p>- -1：URL 固定不刷新，直到 7 天刷新一次 URL（由于 TOS 的 URL 链接有效期为 7 天）；</p>
     *
     * <p>- 其他数值：截图累计 xx 次后，再刷新 URL，刷新 URL 再触发回调。URL 不变，则不触发新的回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
