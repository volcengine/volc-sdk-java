package com.volcengine.model.beans;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class ReUsePartFileInputStream extends InputStream {
    private PartInputStream bis = null;
    private FileChannel fileChannel = null;
    private long markPos = 0L;

    public ReUsePartFileInputStream(PartInputStream bis) throws IOException {
        FileInputStream fin = (FileInputStream) bis.getWrappedInputStream();
        this.bis = bis;
        this.fileChannel = fin.getChannel();
        this.markPos = this.fileChannel.position();
    }

    public void reset() throws IOException {
        this.bis.backoff(this.fileChannel.position() - this.markPos);
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
        return this.bis.available();
    }

    public void close() throws IOException {
        this.bis.close();
    }

    public int read() throws IOException {
        return this.bis.read();
    }

    public long skip(long n) throws IOException {
        return this.bis.skip(n);
    }

    public int read(byte[] b, int off, int len) throws IOException {
        return this.bis.read(b, off, len);
    }

    public InputStream getWrappedInputStream() {
        return this.bis;
    }
}
