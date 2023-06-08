package com.volcengine.model.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class ReUseFileInputStream extends InputStream {
    private File file;
    private FileInputStream fis;
    private FileChannel fileChannel;
    private long markPos;

    public ReUseFileInputStream(File file) throws IOException {
        this(new FileInputStream(file), file);
    }

    public ReUseFileInputStream(FileInputStream fis) throws IOException {
        this(fis, (File) null);
    }

    public ReUseFileInputStream(FileInputStream fis, File file) throws IOException {
        this.file = null;
        this.fis = null;
        this.fileChannel = null;
        this.markPos = 0L;
        this.file = file;
        this.fis = fis;
        this.fileChannel = fis.getChannel();
        this.markPos = this.fileChannel.position();
    }

    public void reset() throws IOException {
        this.fileChannel.position(this.markPos);
    }

    public boolean markSupported() {
        return true;
    }

    public void mark(int readlimit) {
        try {
            this.markPos = this.fileChannel.position();
        } catch (IOException var3) {
            throw new RuntimeException("Failed to mark file position", var3);
        }
    }

    public int available() throws IOException {
        return this.fis.available();
    }

    public void close() throws IOException {
        this.fis.close();
    }

    public int read() throws IOException {
        return this.fis.read();
    }

    public long skip(long n) throws IOException {
        return this.fis.skip(n);
    }

    public int read(byte[] b, int off, int len) throws IOException {
        return this.fis.read(b, off, len);
    }

    public InputStream getWrappedInputStream() {
        return this.fis;
    }

    public File getFile() {
        return this.file;
    }
}
