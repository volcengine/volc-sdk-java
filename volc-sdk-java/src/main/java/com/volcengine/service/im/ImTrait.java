package com.volcengine.service.im;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.im.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.BaseServiceImpl;
import lombok.Data;

/**
 * Im Trait
 */
public class ImTrait extends BaseServiceImpl {
    protected ImTrait() {
        super(ImConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), ImConfig.apiInfoList);
    }

    protected ImTrait(ServiceInfo serviceInfo) {
        super(serviceInfo, ImConfig.apiInfoList);
    }

    @Data
    static public class ResponseModel {
        @JSONField(name = "ResponseMetadata")
        private ResponseMetadata responseMetadata;
    }

    private <T> T parseRawResponse(RawResponse rawResponse, Class<T> type) throws Exception {
        Exception ex = (rawResponse.getException());
        if (ex != null) {
            throw ex;
        }
        byte[] data = rawResponse.getData();
        if (data == null) {
            throw new Exception("null response body got, rawResponse:" + JSON.toJSONString(rawResponse));
        }

        return JSON.parseObject(data, type);
    }


    /**
     * <p>getConversationMarks</p>
     * <p>会话标记查询</p>
     *
     * <p>你可以调用GetConversationMarks接口，指定你所属的AppId、会话成员 ID 和标记类型进行会话标记。目前仅直播群支持</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetConversationMarksRes getConversationMarks(GetConversationMarksBody body) throws Exception {
        RawResponse rawResponse = json("GetConversationMarks", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetConversationMarksRes.class);
    }

    /**
     * <p>markConversation</p>
     * <p>标记会话</p>
     *
     * <p>你可以调用MarkConversation接口，指定你所属的AppId、会话成员 ID 和标记类型进行给会话标记。目前仅直播群支持</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public MarkConversationRes markConversation(MarkConversationBody body) throws Exception {
        RawResponse rawResponse = json("MarkConversation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, MarkConversationRes.class);
    }

    /**
     * <p>modifyParticipantReadIndex</p>
     * <p>修改会话成员已读位置</p>
     *
     * <p>你可以使用此接口修改会话成员的已读位置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ModifyParticipantReadIndexRes modifyParticipantReadIndex(ModifyParticipantReadIndexBody body) throws Exception {
        RawResponse rawResponse = json("ModifyParticipantReadIndex", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ModifyParticipantReadIndexRes.class);
    }

    /**
     * <p>scanConversationParticipantList</p>
     * <p>分批扫描群聊中的成员详细信</p>
     *
     * <p>你可以使用此接口分批扫描群中成员的详细信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ScanConversationParticipantListRes scanConversationParticipantList(ScanConversationParticipantListBody body) throws Exception {
        RawResponse rawResponse = json("ScanConversationParticipantList", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ScanConversationParticipantListRes.class);
    }

    /**
     * <p>batchGetBlockParticipants</p>
     * <p>分批获得禁言/拉黑成员列表</p>
     *
     * <p>你可以使用此接口分批在直播群中获得禁言或拉黑成员列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchGetBlockParticipantsRes batchGetBlockParticipants(BatchGetBlockParticipantsBody body) throws Exception {
        RawResponse rawResponse = json("BatchGetBlockParticipants", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchGetBlockParticipantsRes.class);
    }

    /**
     * <p>isUserInConversation</p>
     * <p>判断用户是否在会话中</p>
     *
     * <p>你可以调用IsUserInConversation接口，指定你所属的AppId、会话 ID 和会话成员 UserId，判断该用户是否在会话中。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public IsUserInConversationRes isUserInConversation(IsUserInConversationBody body) throws Exception {
        RawResponse rawResponse = json("IsUserInConversation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, IsUserInConversationRes.class);
    }

    /**
     * <p>batchModifyConversationParticipant</p>
     * <p>批量修改群聊成员详情</p>
     *
     * <p>你可以使用此接口批量对群成员的详细信息进行修改。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchModifyConversationParticipantRes batchModifyConversationParticipant(BatchModifyConversationParticipantBody body) throws Exception {
        RawResponse rawResponse = json("BatchModifyConversationParticipant", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchModifyConversationParticipantRes.class);
    }

    /**
     * <p>batchDeleteConversationParticipant</p>
     * <p>批量删除群聊成员</p>
     *
     * <p>你可以使用此接口批量删除群成员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchDeleteConversationParticipantRes batchDeleteConversationParticipant(BatchDeleteConversationParticipantBody body) throws Exception {
        RawResponse rawResponse = json("BatchDeleteConversationParticipant", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchDeleteConversationParticipantRes.class);
    }

    /**
     * <p>batchDeleteBlockParticipants</p>
     * <p>批量取消禁言/取消拉黑会话成员</p>
     *
     * <p>你可以使用此接口在直播群中批量取消禁言或取消拉黑会话成员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchDeleteBlockParticipantsRes batchDeleteBlockParticipants(BatchDeleteBlockParticipantsBody body) throws Exception {
        RawResponse rawResponse = json("BatchDeleteBlockParticipants", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchDeleteBlockParticipantsRes.class);
    }

    /**
     * <p>batchGetConversationParticipant</p>
     * <p>批量查询会话成员详细信息</p>
     *
     * <p>你可以调用BatchGetConversationParticipant接口，指定你所属的AppId、会话 ID 和查询会话成员 UserId 进行批量查询会话成员的详细信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchGetConversationParticipantRes batchGetConversationParticipant(BatchGetConversationParticipantBody body) throws Exception {
        RawResponse rawResponse = json("BatchGetConversationParticipant", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchGetConversationParticipantRes.class);
    }

    /**
     * <p>batchGetWhitelistParticipant</p>
     * <p>批量查询全员禁言下白名单成员</p>
     *
     * <p>你可以调用BatchGetWhitelistParticipant接口，指定你所属的AppId、会话 ID、 查询起始位置和查询条数批量查询全员禁言下白名单成员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchGetWhitelistParticipantRes batchGetWhitelistParticipant(BatchGetWhitelistParticipantBody body) throws Exception {
        RawResponse rawResponse = json("BatchGetWhitelistParticipant", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchGetWhitelistParticipantRes.class);
    }

    /**
     * <p>batchAddWhitelistParticipant</p>
     * <p>批量添加全员禁言下白名单成员</p>
     *
     * <p>你可以使用此接口批量添加全员禁言下可发言白名单成员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchAddWhitelistParticipantRes batchAddWhitelistParticipant(BatchAddWhitelistParticipantBody body) throws Exception {
        RawResponse rawResponse = json("BatchAddWhitelistParticipant", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchAddWhitelistParticipantRes.class);
    }

    /**
     * <p>batchAddManager</p>
     * <p>批量添加直播群管理员</p>
     *
     * <p>你可以使用此接口向直播群中批量添加管理员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchAddManagerRes batchAddManager(BatchAddManagerBody body) throws Exception {
        RawResponse rawResponse = json("BatchAddManager", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchAddManagerRes.class);
    }

    /**
     * <p>batchAddConversationParticipant</p>
     * <p>批量添加群聊成员</p>
     *
     * <p>你可以使用此接口向群聊中批量添加群成员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchAddConversationParticipantRes batchAddConversationParticipant(BatchAddConversationParticipantBody body) throws Exception {
        RawResponse rawResponse = json("BatchAddConversationParticipant", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchAddConversationParticipantRes.class);
    }

    /**
     * <p>batchAddBlockParticipants</p>
     * <p>批量禁言/拉黑会话成员</p>
     *
     * <p>你可以使用此接口在直播群中批量禁言或拉黑会话成员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchAddBlockParticipantsRes batchAddBlockParticipants(BatchAddBlockParticipantsBody body) throws Exception {
        RawResponse rawResponse = json("BatchAddBlockParticipants", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchAddBlockParticipantsRes.class);
    }

    /**
     * <p>batchRemoveWhitelistParticipant</p>
     * <p>批量移除全员禁言下白名单成员</p>
     *
     * <p>你可以使用此接口批量移除全员禁言下白名单成员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchRemoveWhitelistParticipantRes batchRemoveWhitelistParticipant(BatchRemoveWhitelistParticipantBody body) throws Exception {
        RawResponse rawResponse = json("BatchRemoveWhitelistParticipant", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchRemoveWhitelistParticipantRes.class);
    }

    /**
     * <p>batchRemoveManager</p>
     * <p>批量移除直播群管理员</p>
     *
     * <p>你可以使用此接口批量移除直播群中的管理员。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchRemoveManagerRes batchRemoveManager(BatchRemoveManagerBody body) throws Exception {
        RawResponse rawResponse = json("BatchRemoveManager", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchRemoveManagerRes.class);
    }

    /**
     * <p>batchUpdateLiveParticipants</p>
     * <p>更新直播群成员资料</p>
     *
     * <p>你可以调用 BatchUpdateLiveParticipants 接口，指定你所属的AppId、会话 Id、 直播群成员 ID 来更新群成员资料。</p>
     *
     *
     *
     * <p>目前仅直播群支持此接口</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchUpdateLiveParticipantsRes batchUpdateLiveParticipants(BatchUpdateLiveParticipantsBody body) throws Exception {
        RawResponse rawResponse = json("BatchUpdateLiveParticipants", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchUpdateLiveParticipantsRes.class);
    }

    /**
     * <p>getParticipantReadIndex</p>
     * <p>查询会话成员已读位置</p>
     *
     * <p>你可以调用GetParticipantReadIndex接口，指定你所属的AppId和会话 ID 查询会话中所有成员的已读位置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetParticipantReadIndexRes getParticipantReadIndex(GetParticipantReadIndexBody body) throws Exception {
        RawResponse rawResponse = json("GetParticipantReadIndex", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetParticipantReadIndexRes.class);
    }

    /**
     * <p>getConversationUserCount</p>
     * <p>查询会话成员数量</p>
     *
     * <p>你可以调用GetConversationUserCount接口，指定你所属的AppId和会话 ID，查询会话成员数量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetConversationUserCountRes getConversationUserCount(GetConversationUserCountBody body) throws Exception {
        RawResponse rawResponse = json("GetConversationUserCount", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetConversationUserCountRes.class);
    }

    /**
     * <p>queryLiveParticipantStatus</p>
     * <p>查询直播群成员状态</p>
     *
     * <p>你可以调用QueryLiveParticipantStatus接口，指定你所属的AppId、会话 ID 和查询群成员的 UserId，查询指定成员在直播群的状态。</p>
     *
     *
     *
     * <p>目前仅直播群支持此接口</p>
     *
     *
     *
     * <p>一次最多支持查询 200 个群成员状态。如查询群成员数超过 200，只返回前 200 个成员状态。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public QueryLiveParticipantStatusRes queryLiveParticipantStatus(QueryLiveParticipantStatusBody body) throws Exception {
        RawResponse rawResponse = json("QueryLiveParticipantStatus", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, QueryLiveParticipantStatusRes.class);
    }

    /**
     * <p>modifyConversation</p>
     * <p>修改会话信息</p>
     *
     * <p>你可以调用ModifyConversation接口，指定你所属的AppId和会话信息修改会话的详细信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ModifyConversationRes modifyConversation(ModifyConversationBody body) throws Exception {
        RawResponse rawResponse = json("ModifyConversation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ModifyConversationRes.class);
    }

    /**
     * <p>modifyConversationSetting</p>
     * <p>修改用户对会话的设置</p>
     *
     * <p>你可以调用ModifyConversationSetting接口，指定你所属的AppId、会话 ID 和会话成员 UserId 修改该成员对会话的设置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ModifyConversationSettingRes modifyConversationSetting(ModifyConversationSettingBody body) throws Exception {
        RawResponse rawResponse = json("ModifyConversationSetting", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ModifyConversationSettingRes.class);
    }

    /**
     * <p>createConversation</p>
     * <p>创建会话</p>
     *
     * <p>你可以调用CreateConversation接口，指定你所属的AppId、会话成员 ID 和会话详细信息进行创建会话。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateConversationRes createConversation(CreateConversationBody body) throws Exception {
        RawResponse rawResponse = json("CreateConversation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateConversationRes.class);
    }

    /**
     * <p>batchGetConversations</p>
     * <p>批量查询会话</p>
     *
     * <p>你可以调用BatchGetConversations接口，指定你所属的AppId和会话 ID 批量查询会话信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchGetConversationsRes batchGetConversations(BatchGetConversationsBody body) throws Exception {
        RawResponse rawResponse = json("BatchGetConversations", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchGetConversationsRes.class);
    }

    /**
     * <p>getConversationSetting</p>
     * <p>查询成员对会话的设置</p>
     *
     * <p>你可以调用GetConversationSetting接口，指定你所属的AppId、会话 ID和会话成员 UserId，查询会话成员对会话的设置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetConversationSettingRes getConversationSetting(GetConversationSettingBody body) throws Exception {
        RawResponse rawResponse = json("GetConversationSetting", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetConversationSettingRes.class);
    }

    /**
     * <p>getUserConversations</p>
     * <p>查询用户拥有会话</p>
     *
     * <p>你可以调用GetUserConversations接口，指定你所属的AppId、用户 ID、查询起始位置和查询数量来查询用户拥有的会话。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetUserConversationsRes getUserConversations(GetUserConversationsBody body) throws Exception {
        RawResponse rawResponse = json("GetUserConversations", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetUserConversationsRes.class);
    }

    /**
     * <p>destroyConversation</p>
     * <p>解散群聊</p>
     *
     * <p>你可以调用DestroyConversation接口，指定你所属的AppId、会话 ID 和群主 ID来解散指定群聊。</p>
     *
     *
     *
     * <p>单聊无法调用此接口。</p>
     *
     * <p>只有群主可以解散群聊。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DestroyConversationRes destroyConversation(DestroyConversationBody body) throws Exception {
        RawResponse rawResponse = json("DestroyConversation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DestroyConversationRes.class);
    }

    /**
     * <p>modifyMessage</p>
     * <p>修改消息扩展字段</p>
     *
     * <p>你可以调用ModifyMessage接口，指定你所属的AppId和，会话 ID 和消息 ID，修改消息的扩展字段。</p>
     *
     *
     *
     * <p>无法修改已过期消息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ModifyMessageRes modifyMessage(ModifyMessageBody body) throws Exception {
        RawResponse rawResponse = json("ModifyMessage", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ModifyMessageRes.class);
    }

    /**
     * <p>getConversationMessages</p>
     * <p>分批查询会话中的消息</p>
     *
     * <p>你可以调用GetConversationMessages接口，指定你所属的AppId、会话 ID、查询起始位置和查询条数批量查询会话中的消息。</p>
     *
     *
     *
     * <p>一次最多查询 20 条消息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetConversationMessagesRes getConversationMessages(GetConversationMessagesBody body) throws Exception {
        RawResponse rawResponse = json("GetConversationMessages", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetConversationMessagesRes.class);
    }

    /**
     * <p>deleteConversationMessage</p>
     * <p>删除会话消息</p>
     *
     * <p>你可以调用DeleteConversationMessage接口，指定你所属的AppId和，会话 ID、消息 ID 和删除方式，删除指定的会话消息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteConversationMessageRes deleteConversationMessage(DeleteConversationMessageBody body) throws Exception {
        RawResponse rawResponse = json("DeleteConversationMessage", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteConversationMessageRes.class);
    }

    /**
     * <p>deleteMessage</p>
     * <p>删除用户消息</p>
     *
     * <p>你可以调用DeleteMessage接口，指定你所属的AppId和，会话 ID、会话成员 ID 和消息 ID，删除指定的用户消息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteMessageRes deleteMessage(DeleteMessageBody body) throws Exception {
        RawResponse rawResponse = json("DeleteMessage", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteMessageRes.class);
    }

    /**
     * <p>sendMessage</p>
     * <p>发送消息</p>
     *
     * <p>你可以调用SendMessage接口，指定你所属的AppId和，发送者 UserId、会话 ID、消息类型和消息内容，进行消息发送。</p>
     *
     *
     *
     * <p>用户需要在会话中才允许消息发送，且不会触发第三方回调。</p>
     *
     *
     *
     * <p>发送消息前不会检查发送方是否禁言，也不会检查会话是否开启禁言。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public SendMessageRes sendMessage(SendMessageBody body) throws Exception {
        RawResponse rawResponse = json("SendMessage", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, SendMessageRes.class);
    }

    /**
     * <p>getMessages</p>
     * <p>批量查询消息</p>
     *
     * <p>你可以调用GetMessages接口，指定你所属的AppId和，会话 ID 和消息 ID，查询指定消息的详细信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetMessagesRes getMessages(GetMessagesBody body) throws Exception {
        RawResponse rawResponse = json("GetMessages", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetMessagesRes.class);
    }

    /**
     * <p>recallMessage</p>
     * <p>撤回用户消息</p>
     *
     * <p>你可以调用RecallMessage接口，指定你所属的AppId、会话 ID、消息 ID 和撤回消息的会话成员 ID，撤回指定消息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RecallMessageRes recallMessage(RecallMessageBody body) throws Exception {
        RawResponse rawResponse = json("RecallMessage", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RecallMessageRes.class);
    }

    /**
     * <p>deleteFriend</p>
     * <p>删除好友</p>
     *
     * <p>你可以调用 DeleteFriend 接口，指定你所属的 AppId、用户 ID 和 好友 ID 双向删除好友。一次最多支持删除 10 个好友。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteFriendRes deleteFriend(DeleteFriendBody body) throws Exception {
        RawResponse rawResponse = json("DeleteFriend", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteFriendRes.class);
    }

    /**
     * <p>updateFriend</p>
     * <p>更新好友</p>
     *
     * <p>你可以调用 UpdateFriend 接口，指定你所属的 AppId、用户 ID 和 好友 ID 更新好友信息。 一次最多支持更新 10 个好友。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateFriendRes updateFriend(UpdateFriendBody body) throws Exception {
        RawResponse rawResponse = json("UpdateFriend", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateFriendRes.class);
    }

    /**
     * <p>updateBlackList</p>
     * <p>更新黑名单</p>
     *
     * <p>你可以调用 UpdateBlackList 接口，指定你所属的 AppId、用户 ID 和黑名单中用户的 ID，更新黑名单用户的扩展信息。 一次最多支持更新 10 个好友。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateBlackListRes updateBlackList(UpdateBlackListBody body) throws Exception {
        RawResponse rawResponse = json("UpdateBlackList", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateBlackListRes.class);
    }

    /**
     * <p>listFriend</p>
     * <p>查询好友列表</p>
     *
     * <p>你可以调用ListFriend接口，指定你所属的AppId、用户 ID、查询起始位置和查询条数查询指定用户的好友列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListFriendRes listFriend(ListFriendBody body) throws Exception {
        RawResponse rawResponse = json("ListFriend", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListFriendRes.class);
    }

    /**
     * <p>queryOnlineStatus</p>
     * <p>查询用户在线状态</p>
     *
     * <p>你可以通过QueryOnlineStatus接口，指定 AppId 和 UserId，查询指定用户的在线状态。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public QueryOnlineStatusRes queryOnlineStatus(QueryOnlineStatusBody body) throws Exception {
        RawResponse rawResponse = json("QueryOnlineStatus", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, QueryOnlineStatusRes.class);
    }

    /**
     * <p>getBlackList</p>
     * <p>查询黑名单</p>
     *
     * <p>你可以调用 GetBlackList 接口，指定你所属的AppId、用户 ID，分页查询对应的黑名单列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetBlackListRes getBlackList(GetBlackListBody body) throws Exception {
        RawResponse rawResponse = json("GetBlackList", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetBlackListRes.class);
    }

    /**
     * <p>isFriend</p>
     * <p>校验好友关系</p>
     *
     * <p>你可以调用 IsFriend 接口，指定你所属的 AppId、用户 ID 和 检验用户 ID 判断双方是否为好友。一次最多支持校验 10 个好友。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public IsFriendRes isFriend(IsFriendBody body) throws Exception {
        RawResponse rawResponse = json("IsFriend", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, IsFriendRes.class);
    }

    /**
     * <p>isInBlackList</p>
     * <p>校验用户是否在黑名单</p>
     *
     * <p>你可以调用 IsInBlackList 接口，指定你所属的 AppId、用户 ID 和对方用户 ID，校验对方是否在自己的黑名单中。一次最多支持校验 10 个用户。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public IsInBlackListRes isInBlackList(IsInBlackListBody body) throws Exception {
        RawResponse rawResponse = json("IsInBlackList", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, IsInBlackListRes.class);
    }

    /**
     * <p>addFriend</p>
     * <p>添加好友</p>
     *
     * <p>你可以调用 AddFriend 接口，指定你所属的 AppId、用户 ID 和 好友 ID 双向添加好友。 一次最多支持添加 10 个好友。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public AddFriendRes addFriend(AddFriendBody body) throws Exception {
        RawResponse rawResponse = json("AddFriend", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, AddFriendRes.class);
    }

    /**
     * <p>addBlackList</p>
     * <p>添加黑名单</p>
     *
     * <p>你可以调用 AddBlackList 接口，指定你所属的 AppId、用户 ID 和对方的用户 ID，将对方加入黑名单。一次最多支持添加 10 个用户至黑名单。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public AddBlackListRes addBlackList(AddBlackListBody body) throws Exception {
        RawResponse rawResponse = json("AddBlackList", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, AddBlackListRes.class);
    }

    /**
     * <p>removeBlackList</p>
     * <p>移出黑名单</p>
     *
     * <p>你可以调用 RemoveBlackList 接口，指定你所属的 AppId、用户 ID 和黑名单中的用户 ID，将黑名单中的用户移出黑名单。一次最多支持将 10 个用户移出黑名单。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RemoveBlackListRes removeBlackList(RemoveBlackListBody body) throws Exception {
        RawResponse rawResponse = json("RemoveBlackList", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RemoveBlackListRes.class);
    }

    /**
     * <p>userBroadcast</p>
     * <p>全员广播</p>
     *
     * <p>你可以调用 UserBroadcast 接口，指定你所属的 AppId、发送方 UserId，标签，标签匹配关系对符合标签的用户进行全员广播。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UserBroadcastRes userBroadcast(UserBroadcastBody body) throws Exception {
        RawResponse rawResponse = json("UserBroadcast", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UserBroadcastRes.class);
    }

    /**
     * <p>batchUpdateUserTags</p>
     * <p>更新用户标签</p>
     *
     * <p>你可以调用 BatchUpdateUserTags 接口，指定你所属的 AppId、用户 ID、用户 Tag 对已注册的广播用户进行标签更新。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchUpdateUserTagsRes batchUpdateUserTags(BatchUpdateUserTagsBody body) throws Exception {
        RawResponse rawResponse = json("BatchUpdateUserTags", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchUpdateUserTagsRes.class);
    }

    /**
     * <p>registerUsers</p>
     * <p>注册用户</p>
     *
     * <p>你可以调用 RegisterUsers 接口，指定你所属的 AppId、用户 ID ， 用户 Tag 进行注册。</p>
     *
     * <p>进行注册后，IM会存储用户资料，同时注册的用户uid列表会在全院广播的时候使用。</p>
     *
     * <p>当前注册广播用户仅用来进行全员广播，其他操作如发消息无需注册用户。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RegisterUsersRes registerUsers(RegisterUsersBody body) throws Exception {
        RawResponse rawResponse = json("RegisterUsers", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RegisterUsersRes.class);
    }

    /**
     * <p>unRegisterUsers</p>
     * <p>注销用户</p>
     *
     * <p>你可以调用 UnRegisterUsers 接口，指定你所属的 AppId、用户 ID，对已注册的广播用户进行注销。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UnRegisterUsersRes unRegisterUsers(UnRegisterUsersBody body) throws Exception {
        RawResponse rawResponse = json("UnRegisterUsers", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UnRegisterUsersRes.class);
    }

    /**
     * <p>batchGetUser</p>
     * <p>查询用户资料</p>
     *
     * <p>你可以调用 BatchGetUser 接口，指定你所属的 AppId、用户 ID，对已注册的广播用户进行查询。</p>
     *
     *
     *
     *
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchGetUserRes batchGetUser(BatchGetUserBody body) throws Exception {
        RawResponse rawResponse = json("BatchGetUser", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchGetUserRes.class);
    }

    /**
     * <p>batchUpdateUser</p>
     * <p>更新用户资料</p>
     *
     * <p>你可以调用 BatchUpdateUser 接口，指定你所属的 AppId、用户 ID，对已注册的用户更新资料。</p>
     *
     *
     *
     *
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchUpdateUserRes batchUpdateUser(BatchUpdateUserBody body) throws Exception {
        RawResponse rawResponse = json("BatchUpdateUser", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchUpdateUserRes.class);
    }

}
