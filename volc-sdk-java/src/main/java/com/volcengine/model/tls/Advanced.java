package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class Advanced {
    @JSONField(name = CLOSE_INACTIVE)
    int closeInactive;
    @JSONField(name = CLOSE_REMOVED)
    boolean closeRemoved;
    @JSONField(name = CLOSE_RENAMED)
    boolean closeRenamed;
    @JSONField(name = CLOSE_EOF)
    boolean closeEOF;
    @JSONField(name = CLOSE_TIMEOUT)
    int closeTimeout;

    /**
     * @param closeInactive 释放日志文件句柄的等待时间
     * @param closeRemoved 日志文件被移除之后，是否释放该日志文件的句柄
     * @param closeRenamed 日志文件被重命名之后，是否释放该日志文件的句柄
     * @param closeEOF 读取至日志文件的末尾之后，是否释放该日志文件的句柄
     * @param closeTimeout LogCollector监控日志文件的最大时长
     */
    public Advanced(int closeInactive, boolean closeRemoved, boolean closeRenamed, boolean closeEOF, int closeTimeout) {
        this.closeInactive = closeInactive;
        this.closeRemoved = closeRemoved;
        this.closeRenamed = closeRenamed;
        this.closeEOF = closeEOF;
        this.closeTimeout = closeTimeout;
    }

    /**
     * @return 释放日志文件句柄的等待时间
     */
    public int getCloseInactive() {
        return closeInactive;
    }

    /**
     * @param closeInactive 释放日志文件句柄的等待时间
     */
    public void setCloseInactive(int closeInactive) {
        this.closeInactive = closeInactive;
    }

    /**
     * @return 日志文件被移除之后，是否释放该日志文件的句柄
     */
    public boolean isCloseRemoved() {
        return closeRemoved;
    }

    /**
     * @param closeRemoved 日志文件被移除之后，是否释放该日志文件的句柄
     */
    public void setCloseRemoved(boolean closeRemoved) {
        this.closeRemoved = closeRemoved;
    }

    /**
     * @return 日志文件被重命名之后，是否释放该日志文件的句柄
     */
    public boolean isCloseRenamed() {
        return closeRenamed;
    }

    /**
     * @param closeRenamed 日志文件被重命名之后，是否释放该日志文件的句柄
     */
    public void setCloseRenamed(boolean closeRenamed) {
        this.closeRenamed = closeRenamed;
    }

    /**
     * @return 读取至日志文件的末尾之后，是否释放该日志文件的句柄
     */
    public boolean isCloseEOF() {
        return closeEOF;
    }

    /**
     * @param closeEOF 读取至日志文件的末尾之后，是否释放该日志文件的句柄
     */
    public void setCloseEOF(boolean closeEOF) {
        this.closeEOF = closeEOF;
    }

    /**
     * @return LogCollector监控日志文件的最大时长
     */
    public int getCloseTimeout() {
        return closeTimeout;
    }

    /**
     * @param closeTimeout LogCollector监控日志文件的最大时长
     */
    public void setCloseTimeout(int closeTimeout) {
        this.closeTimeout = closeTimeout;
    }
}
