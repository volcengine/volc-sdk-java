package com.volcengine.helper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.Properties;

public class SDKVersion {

    private static final Log LOG = LogFactory.getLog(SDKVersion.class);
    private static String VERSION = "Unknown";

    private static String AGENT = "volc-sdk-java/Unknown";

    static {
        final Properties properties = new Properties();
        try {
            properties.load(SDKVersion.class.getClassLoader().getResourceAsStream("com/volcengine/version"));
            VERSION = properties.getProperty("version");
            AGENT = "volc-sdk-java/v" + VERSION;
        } catch (IOException e) {
            LOG.error("Read file version file fail.");
        }
    }

    public static String getVERSION() {
        return VERSION;
    }

    public static String getAGENT() {
        return AGENT;
    }

}
