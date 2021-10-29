package com.volcengine.auth.impl;

import com.volcengine.auth.ISignerV4;
import com.volcengine.auth.MetaData;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.Credentials;
import com.volcengine.service.SignableRequest;
import com.volcengine.util.NameValueComparator;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.CharSet;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.util.EntityUtils;

import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class SignerV4Impl implements ISignerV4 {
    private static final TimeZone tz = TimeZone.getTimeZone("UTC");
    private static final Set<String> H_INCLUDE = new HashSet<String>();
    private static final BitSet URLENCODER = new BitSet(256);
    private static final String CONST_ENCODE = "0123456789ABCDEF";

    static {
        H_INCLUDE.add("Content-Type");
        H_INCLUDE.add("Content-Md5");
        H_INCLUDE.add("Host");
        int i;
        for (i = 97; i <= 122; ++i) {
            URLENCODER.set(i);
        }

        for (i = 65; i <= 90; ++i) {
            URLENCODER.set(i);
        }

        for (i = 48; i <= 57; ++i) {
            URLENCODER.set(i);
        }
        URLENCODER.set('-');
        URLENCODER.set('_');
        URLENCODER.set('.');
        URLENCODER.set('~');
    }

    @Override
    public void sign(SignableRequest request, Credentials credentials) throws Exception {
        signV4(request, credentials);
        request.setURI(request.getUriBuilder().build());
    }

    @Override
    public String signUrl(SignableRequest request, Credentials credentials) throws Exception {
        String formatDate = getCurrentFormatDate();
        String date = formatDate.substring(0, 8);

        MetaData meta = new MetaData();
        meta.setDate(date);
        meta.setService(credentials.getService());
        meta.setRegion(credentials.getRegion());
        meta.setSignedHeaders("");
        meta.setAlgorithm("HMAC-SHA256");
        meta.setCredentialScope(StringUtils.join(new String[]{meta.getDate(), meta.getRegion(), meta.getService(), "request"}, "/"));

        URIBuilder builder = request.getUriBuilder();
        builder.setParameter("X-Date", formatDate);
        builder.setParameter("X-NotSignBody", "");
        builder.setParameter("X-Credential", credentials.getAccessKeyID() + "/" + meta.getCredentialScope());
        builder.setParameter("X-Algorithm", meta.getAlgorithm());
        builder.setParameter("X-SignedHeaders", meta.getSignedHeaders());
        builder.setParameter("X-SignedQueries", "");
        List<String> keys = new ArrayList<>();
        for (NameValuePair pair : builder.getQueryParams()) {
            keys.add(pair.getName());
        }
        Collections.sort(keys);

        builder.setParameter("X-SignedQueries", StringUtils.join(keys, ";"));

        // step 1
        String hashedCanonReq = hashedSimpleCanonicalRequestV4(request, meta);

        // step 2
        String stringToSign = StringUtils.join(new String[]{meta.getAlgorithm(), formatDate, meta.getCredentialScope(), hashedCanonReq}, "\n");

        // step 3
        byte[] signingKey = genSigningSecretKeyV4(credentials.getSecretAccessKey(), meta.getDate(), meta.getRegion(), meta.getService());
        String signature = signatureV4(signingKey, stringToSign);

        builder.setParameter("X-Signature", signature);
        return builder.build().toURL().getQuery();
    }

    private void signV4(SignableRequest request, Credentials credentials) throws Exception {
        URIBuilder builder = request.getUriBuilder();
        if (builder.getPath().equals("")) {
            builder.setPath(builder.getPath() + "/");
        }

        // common headers
        request.setHeader("Host", request.getUriBuilder().getHost());
        if (request.getHeaders("Content-Type") == null) {
            request.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        }
        String formatDate = getCurrentFormatDate();
        request.setHeader("X-Date", formatDate);

        MetaData meta = new MetaData();
        meta.setAlgorithm("HMAC-SHA256");
        meta.setService(credentials.getService());
        meta.setRegion(credentials.getRegion());
        meta.setDate(toDate(formatDate));

        // step 1
        String hashedCanonReq = hashedCanonicalRequestV4(request, meta);


        meta.setCredentialScope(StringUtils.join(new String[]{meta.getDate(), meta.getRegion(), meta.getService(), "request"}, "/"));
        // step 2
        String stringToSign = StringUtils.join(new String[]{meta.getAlgorithm(), formatDate, meta.getCredentialScope(), hashedCanonReq}, "\n");

        // step 3
        byte[] signingKey = genSigningSecretKeyV4(credentials.getSecretAccessKey(), meta.getDate(), meta.getRegion(), meta.getService());
        String signature = Hex.encodeHexString(Utils.hmacSHA256(signingKey, stringToSign));
        request.setHeader("Authorization", buildAuthHeaderV4(signature, meta, credentials));
    }

    private String hashedSimpleCanonicalRequestV4(SignableRequest request, MetaData meta) throws Exception {
        String payloadHash = Utils.hashSHA256(new byte[0]);

        URIBuilder builder = request.getUriBuilder();
        if (builder.getPath().equals("")) {
            builder.setPath("/");
        }

        String canonicalRequest = StringUtils.join(new String[]{request.getMethod(), normUri(builder.getPath()),
                normQuery(builder.getQueryParams()), "\n", meta.getSignedHeaders(), payloadHash}, "\n");

        return Utils.hashSHA256(canonicalRequest.getBytes());
    }

    private String hashedCanonicalRequestV4(SignableRequest request, MetaData meta) throws Exception {
        byte[] body;
        HttpEntity entity = request.getEntity();
        if (entity == null) {
            body = new byte[0];
        } else {
            body = EntityUtils.toByteArray(entity);
        }
        String bodyHash = Utils.hashSHA256(body);
        request.setHeader("X-Content-Sha256", bodyHash);

        List<String> signedHeaders = new ArrayList<>();
        for (Header header : request.getAllHeaders()) {
            String headerName = header.getName();
            if (H_INCLUDE.contains(headerName) || headerName.startsWith("X-")) {
                signedHeaders.add(headerName.toLowerCase());
            }
        }
        Collections.sort(signedHeaders);
        StringBuilder signedHeadersToSignStr = new StringBuilder();
        for (String h : signedHeaders) {
            String value = request.getFirstHeader(h).getValue().trim();
            if (h.equals("host")) {
                if (value.contains(":")) {
                    String[] split = value.split(":");
                    String port = split[1];
                    if (port.equals("80") || port.equals("443")) {
                        value = split[0];
                    }
                }
            }
            signedHeadersToSignStr.append(h).append(":").append(value).append("\n");
        }

        meta.setSignedHeaders(StringUtils.join(signedHeaders, ";"));

        String canonicalRequest = StringUtils.join(new String[]{request.getMethod(), normUri(request.getUriBuilder().getPath()),
                normQuery(request.getUriBuilder().getQueryParams()), signedHeadersToSignStr.toString(),
                meta.getSignedHeaders(), bodyHash}, "\n");

        return Utils.hashSHA256(canonicalRequest.getBytes());
    }

    private String signatureV4(byte[] signingKey, String stringToSign) throws Exception {
        return Hex.encodeHexString(Utils.hmacSHA256(signingKey, stringToSign));
    }

    private byte[] genSigningSecretKeyV4(String secretKey, String date, String region, String service) throws Exception {
        byte[] kDate = Utils.hmacSHA256((secretKey).getBytes(), date);
        byte[] kRegion = Utils.hmacSHA256(kDate, region);
        byte[] kService = Utils.hmacSHA256(kRegion, service);
        return Utils.hmacSHA256(kService, "request");
    }

    private String buildAuthHeaderV4(String signature, MetaData meta, Credentials credentials) {
        String credential = credentials.getAccessKeyID() + "/" + meta.getCredentialScope();

        return meta.getAlgorithm() +
                " Credential=" + credential +
                ", SignedHeaders=" + meta.getSignedHeaders() +
                ", Signature=" + signature;
    }

    private String getCurrentFormatDate() {
        DateFormat df = new SimpleDateFormat(Const.TIME_FORMAT_V4);
        df.setTimeZone(tz);
        return df.format(new Date());
    }

    private String toDate(String timestamp) {
        return timestamp.substring(0, 8);
    }

    private String normUri(String path) {
        String[] parts = path.split("/",-1);
        for (int i = 0; i < parts.length; i++) {
            parts[i] = signStringEncoder(parts[i]);
        }
        return StringUtils.join(parts, "/");
    }

    /**
     * 与golang的标准对齐
     * @param params query kv pair
     * @return query
     */
    private String normQuery(List<NameValuePair> params) {
        params.sort(NameValueComparator.INSTANCE);
        return signQueryEncoder(params);
    }

    /**
     * 与golang的标准对齐，
     * @param params kv pair
     * @return query string
     */
    private String signQueryEncoder(List<NameValuePair> params) {
        StringBuilder result = new StringBuilder();
        for (NameValuePair pair : params) {
            String encodedName = signStringEncoder(pair.getName());
            String encodedValue = signStringEncoder(pair.getValue());
            if (result.length() > 0) {
                result.append("&");
            }
            result.append(encodedName);
            if (encodedValue != null) {
                result.append("=");
                result.append(encodedValue);
            }
        }
        return result.toString();
    }

    /**
     * 与golang的标准对齐，URLENCODER中的字符不转换，空格转换为%20(仅签名使用)
     * @param source 原文
     * @return 转换后的编码字符串
     */
    private String signStringEncoder(String source) {
        if (source == null) {
            return null;
        }
        StringBuilder buf = new StringBuilder(source.length());
        ByteBuffer bb = Consts.UTF_8.encode(source);
        while (bb.hasRemaining()) {
            int b = bb.get() & 255;
            if (URLENCODER.get(b)) {
                buf.append((char) b);
            } else if (b == 32) {
                buf.append("%20");
            } else {
                buf.append("%");
                char hex1 = CONST_ENCODE.charAt(b >> 4);
                char hex2 = CONST_ENCODE.charAt(b & 15);
                buf.append(hex1);
                buf.append(hex2);
            }
        }

        return buf.toString();
    }
}
