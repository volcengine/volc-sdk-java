package com.volcengine.model.tls.stats;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/** Reads the version stamped into the SDK artifact metadata. */
final class SdkVersion {
    private static final String RESOURCE = "com/volcengine/sdkversion";
    private static volatile String VALUE;

    private SdkVersion() {
    }

    /** Resolves artifact metadata at most once, when the owning stats state is initialized. */
    static String initialize() {
        String cached = VALUE;
        if (cached != null) return cached;
        synchronized (SdkVersion.class) {
            cached = VALUE;
            if (cached == null) {
                VALUE = cached = resolve();
            }
        }
        return cached;
    }

    /** Returns the cached identity without performing I/O. */
    static String value() {
        String cached = VALUE;
        return cached == null ? "UNKNOWN" : cached;
    }

    private static String resolve() {
        Package pkg = SdkVersion.class.getPackage();
        if (pkg != null && pkg.getImplementationVersion() != null
                && !pkg.getImplementationVersion().isEmpty()) {
            return pkg.getImplementationVersion();
        }
        InputStream input = SdkVersion.class.getClassLoader().getResourceAsStream(RESOURCE);
        if (input != null) {
            try {
                Properties properties = new Properties();
                properties.load(input);
                String version = properties.getProperty("version");
                if (version != null && !version.isEmpty() && !version.startsWith("${")) {
                    return version;
                }
            } catch (IOException ignored) {
                // Fall through to an explicit unknown marker rather than inventing a version.
            } finally {
                try {
                    input.close();
                } catch (IOException ignored) {
                    // Nothing useful can be done for a metadata stream close failure.
                }
            }
        }
        return "UNKNOWN";
    }
}
