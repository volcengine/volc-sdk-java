package com.volcengine.service.kms;

import com.volcengine.model.request.kms.*;
import com.volcengine.model.response.kms.*;
import com.volcengine.service.IBaseService;

/**
 * The interface Iam service.
 */
public interface IKmsService extends IBaseService {
    /**
     * create keyring.
     *
     * @param req the create keyring request
     * @return the result of create keyring response
     * @throws Exception the exception
     */
    CreateKeyringResponse createKeyring(CreateKeyringRequest req) throws Exception;

    /**
     * describe keyring.
     *
     * @param req the describe keyrings request
     * @return the list of keyrings response
     * @throws Exception the exception
     */
    DescribeKeyringsResponse describeKeyrings(DescribeKeyringsRequest req) throws Exception;

    /**
     * update keyring.
     *
     * @param req the update keyring request
     * @return the update keyring response
     * @throws Exception the exception
     */
    UpdateKeyringResponse updateKeyring(UpdateKeyringRequest req) throws Exception;

    /**
     * query keyring.
     *
     * @param req the query keyring request
     * @return the keyring response
     * @throws Exception the exception
     */
    QueryKeyringResponse queryKeyring(QueryKeyringRequest req) throws Exception;

    /**
     * create key.
     *
     * @param req the create key request
     * @return the create key response
     * @throws Exception the exception
     */
    CreateKeyResponse createKey(CreateKeyRequest req) throws Exception;

    /**
     * decribe keys.
     *
     * @param req the describe keys request
     * @return the list of keys response
     * @throws Exception the exception
     */
    DescribeKeysResponse describeKeys(DescribeKeysRequest req) throws Exception;

    /**
     * update key.
     *
     * @param req the update key request
     * @return the update key response
     * @throws Exception the exception
     */
    UpdateKeyResponse updateKey(UpdateKeyRequest req) throws Exception;

    /**
     * generate data key.
     *
     * @param req the generate data key request
     * @return the data key response
     * @throws Exception the exception
     */
    GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest req) throws Exception;

    /**
     * encrypt.
     *
     * @param req the encrypt request
     * @return the ciphertext response
     * @throws Exception the exception
     */
    EncryptResponse encrypt(EncryptRequest req) throws Exception;

    /**
     * decrypt.
     *
     * @param req the decrypt request
     * @return the ciphertext response
     * @throws Exception the exception
     */
    DecryptResponse decrypt(DecryptRequest req) throws Exception;

    /**
     * enable key.
     *
     * @param req the enable key request
     * @return the enable key response
     * @throws Exception the exception
     */
    EnableKeyResponse enableKey(EnableKeyRequest req) throws Exception;

    /**
     * disable key.
     *
     * @param req the disable key request
     * @return the disable response
     * @throws Exception the exception
     */
    DisableKeyResponse disable(DisableKeyRequest req) throws Exception;

    /**
     * scheduleKeyDeletion key.
     *
     * @param req the scheduleKeyDeletion request
     * @return the ScheduleKeyDeletion response
     * @throws Exception the exception
     */
    ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest req) throws Exception;

    /**
     * cancelKeyDeletion key.
     *
     * @param req the cancelKeyDeletion request
     * @return the cancelKeyDeletion response
     * @throws Exception the exception
     */
    CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest req) throws Exception;
}
