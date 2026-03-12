package com.volcengine.model.tls.util;

import com.volcengine.model.tls.LogContent;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.pb.PutLogRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AdaptorUtilSplitTest {

    @Test
    public void testLogItems2PbGroupList_underLimit_noSplit() {
        List<LogItem> logs = buildLogItems(5000);
        
        PutLogRequest.LogGroupList result = AdaptorUtil.logItems2PbGroupList("path1", "source1", logs);
        
        assertEquals(1, result.getLogGroupsList().size());
        assertEquals(5000, result.getLogGroupsList().get(0).getLogsList().size());
        assertEquals("path1", result.getLogGroupsList().get(0).getFileName());
        assertEquals("source1", result.getLogGroupsList().get(0).getSource());
    }

    @Test
    public void testLogItems2PbGroupList_exactlyLimit_noSplit() {
        List<LogItem> logs = buildLogItems(10000);
        
        PutLogRequest.LogGroupList result = AdaptorUtil.logItems2PbGroupList("path1", "source1", logs);
        
        assertEquals(1, result.getLogGroupsList().size());
        assertEquals(10000, result.getLogGroupsList().get(0).getLogsList().size());
    }

    @Test
    public void testLogItems2PbGroupList_overLimit_splits() {
        List<LogItem> logs = buildLogItems(15000);
        
        PutLogRequest.LogGroupList result = AdaptorUtil.logItems2PbGroupList("path1", "source1", logs);
        
        assertEquals(2, result.getLogGroupsList().size());
        assertEquals(10000, result.getLogGroupsList().get(0).getLogsList().size());
        assertEquals(5000, result.getLogGroupsList().get(1).getLogsList().size());
        assertEquals("path1", result.getLogGroupsList().get(0).getFileName());
        assertEquals("path1", result.getLogGroupsList().get(1).getFileName());
    }

    @Test
    public void testLogItems2PbGroupList_multipleSplits() {
        List<LogItem> logs = buildLogItems(25000);
        
        PutLogRequest.LogGroupList result = AdaptorUtil.logItems2PbGroupList("path1", "source1", logs);
        
        assertEquals(3, result.getLogGroupsList().size());
        assertEquals(10000, result.getLogGroupsList().get(0).getLogsList().size());
        assertEquals(10000, result.getLogGroupsList().get(1).getLogsList().size());
        assertEquals(5000, result.getLogGroupsList().get(2).getLogsList().size());
    }

    @Test
    public void testLogItems2PbGroupList_emptyList() {
        List<LogItem> logs = new ArrayList<>();
        
        PutLogRequest.LogGroupList result = AdaptorUtil.logItems2PbGroupList("path1", "source1", logs);
        
        assertEquals(0, result.getLogGroupsList().size());
    }

    @Test
    public void testLogItems2PbGroupList_nullList() {
        PutLogRequest.LogGroupList result = AdaptorUtil.logItems2PbGroupList("path1", "source1", null);
        
        assertEquals(0, result.getLogGroupsList().size());
    }

    private List<LogItem> buildLogItems(int count) {
        List<LogItem> logs = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            List<LogContent> contents = new ArrayList<>();
            contents.add(new LogContent("key" + i, "value" + i));
            logs.add(new LogItem(System.currentTimeMillis(), contents));
        }
        return logs;
    }
}
