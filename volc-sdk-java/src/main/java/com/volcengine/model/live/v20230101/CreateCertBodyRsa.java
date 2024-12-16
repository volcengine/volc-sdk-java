package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCertBodyRsa
 */
@lombok.Data
public final class CreateCertBodyRsa  {

    /**
     * <p>证书私钥的内容，你需要在计算机上使用文本编辑器打开证书私钥，并将所有内容复制粘贴作为参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>请确保证书私钥没有密码保护。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prikey")
    private String prikey;

    /**
     * <p>证书内容，你需要在计算机上使用文本编辑器打开证书，并将所有内容复制粘贴作为参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 视频直播支持证书链校验。你只需要上传为你的域名颁发的证书，系统将自动检索完整的证书链。</p>
     *
     * <p>- 如果你选择上传证书链，请务必包含服务器证书、中间证书和根证书，并按正确的顺序排列：首先是服务器证书，其次是中间证书，然后是根证书。错误的顺序将使证书链无效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pubkey")
    private String pubkey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
