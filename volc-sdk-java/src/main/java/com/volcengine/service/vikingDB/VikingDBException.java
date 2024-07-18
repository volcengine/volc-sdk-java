package com.volcengine.service.vikingDB;

import java.util.HashMap;

import lombok.Data;
@Data
public class VikingDBException extends Exception{
    private Integer code = 1000028;
    private String requestId = "1000028";
    private String message = "";
    public VikingDBException(Integer code, String requestId, String message){
        this.code = code;
        this.requestId = requestId;
        this.message = String.format("%s, code:%s, request_id:%s", message, this.code, this.requestId);

    }
    public VikingDBException(Long code, String requestId, String message){
        this.code = code.intValue();
        this.requestId = requestId;
        this.message = String.format("%s, code:%s, request_id:%s", message, this.code, this.requestId);
    }
    public VikingDBException(){}
    public Exception getErrorCodeException(Integer code, String requestId, String message) {
        if(code == 1000001) return new UnauthorizedException(code, requestId, message);
        else if(code == 1000002) return new NoPermissionException(code, requestId, message);
        else if(code == 1000003) return new InvalidRequestException(code, requestId, message);
        else if(code == 1000004) return new CollectionExistException(code, requestId, message);
        else if(code == 1000005) return new CollectionNotExistException(code, requestId, message);
        else if(code == 1000006) return new OperationNotAllowedException(code, requestId, message);
        else if(code == 1000007) return new IndexExistException(code, requestId, message);
        else if(code == 1000008) return new IndexNotExistException(code, requestId, message);
        else if(code == 1000010) return new QueryOpFailedException(code, requestId, message);
        else if(code == 1000011) return new DataNotFoundException(code, requestId, message);
        else if(code == 1000013) return new DelOpFailedException(code, requestId, message);
        else if(code == 1000014) return new UpsertOpFailedException(code, requestId, message);
        else if(code == 1000015) return new TokenMismatchException(code, requestId, message);
        else if(code == 1000016) return new InvalidQueryVecException(code, requestId, message);
        else if(code == 1000017) return new InvalidPrimaryKeyException(code, requestId, message);
        else if(code == 1000018) return new InvalidPartitionException(code, requestId, message);
        else if(code == 1000019) return new InvalidScalarCondException(code, requestId, message);
        else if(code == 1000020) return new InvalidProxyServiceException(code, requestId, message);
        else if(code == 1000021) return new IndexRecallException(code, requestId, message);
        else if(code == 1000022) return new IndexFetchDataException(code, requestId, message);
        else if(code == 1000023) return new IndexNotReadyException(code, requestId, message);
        else if(code == 1000024) return new APINotImplementedException(code, requestId, message);
        else if(code == 1000025) return new CalcEmbeddingFailedException(code, requestId, message);
        else if(code == 1000026) return new ListEmbeddingModelsException(code, requestId, message);
        else if(code == 1000030) return new ParamsNotExistException(message);
        else if(code == 1000031) return new ParamsNotBuildException(message);
        else if(code == 1000032) return new PrimaryKeyErrorException(message);
        else return new VikingDBServerException(code, requestId, message);

    }
    
    public Exception getErrorCodeException(Long code, String requestId, String message){
        return getErrorCodeException(code.intValue(), requestId, message);
    }
    
    @Override
    public String toString() {
        String s = getClass().getName();
        String message = this.message;
        return (message != null) ? (s + ": " + message) : s;
    }
}
class PrimaryKeyErrorException extends VikingDBException{
    public PrimaryKeyErrorException(String message){
        super(1000032, null, message);
    }
    public PrimaryKeyErrorException(){}
}
class ParamsNotBuildException extends VikingDBException{
    public ParamsNotBuildException(String message){
        super(1000031, null, message);
    }
    public ParamsNotBuildException(){}
}
class ParamsNotExistException extends VikingDBException{
    public ParamsNotExistException(String message){
        super(1000030, null, message);
    }
    public ParamsNotExistException(){}
}
class UnauthorizedException extends VikingDBException{
    public UnauthorizedException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public UnauthorizedException(){}
}
class NoPermissionException extends VikingDBException{
    public NoPermissionException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public NoPermissionException(){}
}
class InvalidRequestException extends VikingDBException{
    public InvalidRequestException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public InvalidRequestException(){}
}
class CollectionExistException extends VikingDBException{
    public CollectionExistException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public CollectionExistException(){}
}
class CollectionNotExistException extends VikingDBException{
    public CollectionNotExistException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public CollectionNotExistException(){}
}
class OperationNotAllowedException extends VikingDBException{
    public OperationNotAllowedException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public OperationNotAllowedException(){}
}
class IndexExistException extends VikingDBException{
    public IndexExistException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public IndexExistException(){}
}
class IndexNotExistException extends VikingDBException{
    public IndexNotExistException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public IndexNotExistException(){}
}
class QueryOpFailedException extends VikingDBException{
    public QueryOpFailedException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public QueryOpFailedException(){}
}
class DataNotFoundException extends VikingDBException{
    public DataNotFoundException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public DataNotFoundException(){}
}
class DelOpFailedException extends VikingDBException{
    public DelOpFailedException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public DelOpFailedException(){}
}
class UpsertOpFailedException extends VikingDBException{
    public UpsertOpFailedException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public UpsertOpFailedException(){}
}
class TokenMismatchException extends VikingDBException{
    public TokenMismatchException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public TokenMismatchException(){}
}
class InvalidQueryVecException extends VikingDBException{
    public InvalidQueryVecException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public InvalidQueryVecException(){}
}
class InvalidPrimaryKeyException extends VikingDBException{
    public InvalidPrimaryKeyException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public InvalidPrimaryKeyException(){}
}
class InvalidPartitionException extends VikingDBException{
    public InvalidPartitionException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public InvalidPartitionException(){}
}
class InvalidScalarCondException extends VikingDBException{
    public InvalidScalarCondException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public InvalidScalarCondException(){}
}
class InvalidProxyServiceException extends VikingDBException{
    public InvalidProxyServiceException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public InvalidProxyServiceException(){}
}
class IndexRecallException extends VikingDBException{
    public IndexRecallException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public IndexRecallException(){}
}
class IndexFetchDataException extends VikingDBException{
    public IndexFetchDataException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public IndexFetchDataException(){}
}
class IndexNotReadyException extends VikingDBException{
    public IndexNotReadyException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public IndexNotReadyException(){}
}
class APINotImplementedException extends VikingDBException{
    public APINotImplementedException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public APINotImplementedException(){}
}
class CalcEmbeddingFailedException extends VikingDBException{
    public CalcEmbeddingFailedException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public CalcEmbeddingFailedException(){}
}
class ListEmbeddingModelsException extends VikingDBException{
    public ListEmbeddingModelsException(Integer code, String requestId, String message){
        super(code, requestId, message);
    }
    public ListEmbeddingModelsException(){}
}
class VikingDBServerException extends VikingDBException{
    private String message = "";
    public VikingDBServerException(Integer code, String requestId, String message){
        super(code, requestId, message);
        if(message != null) this.message = message;
        else this.message = String.format("unknown error, please contact customer service, request_id:{}", requestId);
    }
    @Override
    public String toString() {
        String s = getClass().getName();
        String message = this.message;
        return (message != null) ? (s + ": " + message) : s;
    }
}

