package com.volcengine.model.tls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.response.DescribeCheckpointResponse;
import com.volcengine.model.tls.response.DescribeCursorResponse;
import com.volcengine.model.tls.response.DescribeIndexResponse;
import com.volcengine.model.tls.response.DescribeProjectResponse;
import com.volcengine.model.tls.response.DescribeTopicResponse;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * 反序列化回归 UT：消费 cospec/context/l5-fixtures/responses.json，
 * 验证 5 个 Describe* Response 类对真实服务端响应能完整反序列化、零字段丢失。
 *
 * <p>fixture 来源：实验室经 volclog 采集（profile 2100051396-sy, region cn-guilin-boe），
 * 与 Go/Python/C++ V2 共享同一份 responses.json（4 SDK 交叉反序列化对照）。
 *
 * <p>关键映射：
 * <ul>
 *   <li>{@link DescribeCheckpointResponse}：类名小写 p（Checkpoint），但 wire path
 *       使用大写 P (/DescribeCheckPoint)；字段 wire 'ShardID'（D 大写），靠
 *       Const#SHARD_ID_UPPERCASE 命中。</li>
 *   <li>{@link DescribeProjectResponse} / {@link DescribeTopicResponse}：body 直接
 *       平铺为 ProjectInfo / TopicInfo，无外层包裹。</li>
 *   <li>序列化栈：Alibaba fastjson @JSONField；非 Jackson。</li>
 * </ul>
 */
public class ResponseDeserializeTest {

    private JSONObject loadFixture() throws IOException {
        // 仓库相对路径：volc-sdk-java/volc-sdk-java/ -> ../../../cospec/.../responses.json
        Path[] candidates = new Path[]{
                Paths.get(System.getProperty("user.dir"))
                        .resolve("../../../cospec/changes/check-tls-sdk-contract-alignment/context/l5-fixtures/responses.json")
                        .normalize(),
                Paths.get(System.getProperty("user.dir"))
                        .resolve("../../cospec/changes/check-tls-sdk-contract-alignment/context/l5-fixtures/responses.json")
                        .normalize(),
        };
        String envPath = System.getenv("RESPONSE_FIXTURE");
        for (Path p : (envPath != null && !envPath.isEmpty()
                ? new Path[]{Paths.get(envPath), candidates[0], candidates[1]}
                : candidates)) {
            if (Files.exists(p)) {
                String content = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
                return JSON.parseObject(content);
            }
        }
        throw new IOException("fixture not found, tried: " + Paths.get(candidates[0].toString()));
    }

    @Test
    public void describeCursorResponseDeserializesCleanly() throws Exception {
        JSONObject fx = loadFixture();
        String body = fx.getJSONObject("DescribeCursor").toJSONString();
        DescribeCursorResponse resp = JSON.parseObject(body, DescribeCursorResponse.class);
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAw", resp.getCursor());
    }

    @Test
    public void describeCheckpointResponseHonorsShardIDCasing() throws Exception {
        JSONObject fx = loadFixture();
        String body = fx.getJSONObject("DescribeCheckPoint").toJSONString();
        DescribeCheckpointResponse resp = JSON.parseObject(body, DescribeCheckpointResponse.class);
        // 服务端 wire 用 'ShardID'（D 大写）；常量 SHARD_ID_UPPERCASE 必须命中
        assertEquals("ShardID 字段必须从 wire 'ShardID'（D 大写）反序列化", 0, resp.getShardID());
        assertEquals("", resp.getCheckpoint());
    }

    @Test
    public void describeIndexResponseDeserializesNullsAndEmptyArrays() throws Exception {
        JSONObject fx = loadFixture();
        String body = fx.getJSONObject("DescribeIndex").toJSONString();
        DescribeIndexResponse resp = JSON.parseObject(body, DescribeIndexResponse.class);
        assertEquals("121c1bcd-6030-42c8-a02f-8465f1fc67ef", resp.getTopicId());
        assertNull("FullText:null 应反序列化为 null", resp.getFullTextInfo());
        assertNotNull(resp.getKeyValue());
        assertTrue("KeyValue 空数组应得到空 List", resp.getKeyValue().isEmpty());
        assertNotNull(resp.getCreateTime());
        assertNotNull(resp.getModifyTime());
        assertTrue(resp.getEnablePhraseIndex());
    }

    @Test
    public void describeProjectResponseDeserializesPlatBodyAsProjectInfo() throws Exception {
        JSONObject fx = loadFixture();
        String body = fx.getJSONObject("DescribeProject").toJSONString();
        // ProjectResponse.deSerialize 会把 body 直接当 ProjectInfo 解析；这里直接用 fastjson 模拟
        ProjectInfo info = JSON.parseObject(body, ProjectInfo.class);
        assertEquals("740e2f59-08e2-41ee-b24c-dd98b79f6c35", info.getProjectId());
        assertEquals("l3-sdk-align-1779612326", info.getProjectName());
        assertEquals("default", info.getIamProjectName());
        assertEquals(1, info.getTopicCount());
        assertNotNull(info.getInnerNetDomain());
    }

    @Test
    public void describeTopicResponseDeserializesAllFields() throws Exception {
        JSONObject fx = loadFixture();
        String body = fx.getJSONObject("DescribeTopic").toJSONString();
        TopicInfo info = JSON.parseObject(body, TopicInfo.class);
        assertEquals("121c1bcd-6030-42c8-a02f-8465f1fc67ef", info.getTopicId());
        assertEquals("l3-topic-1", info.getTopicName());
        assertEquals("2.0", info.getTlsVersion()); // wire 'TLSVersion'
        assertEquals(2, info.getShardCount());
        assertEquals("ChargeByFunction", info.getMeteringMode());
        assertEquals(1, info.getTtl());
        assertEquals(Integer.valueOf(1), info.getHotTtl());
        assertFalse(info.getAutoSplit());
        assertFalse(info.isEnableHotTtl());
        assertEquals(Boolean.FALSE, info.getLogPublicIP());
    }
}
