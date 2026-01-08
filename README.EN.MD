English | [中文](README.md)

<h1 align="center"><img src="https://iam.volccdn.com/obj/volcengine-public/pic/volcengine-icon.png"></h1>
<h1 align="center">Volcengine SDK for Java</h1>

Welcome to Volcengine SDK for Java. This document explains how to obtain and use the SDK.

## Prerequisites

### Enable the service

Make sure the service you want to access is enabled. Go to the [Volcengine Console](https://console.volcengine.com/), select the service from the left navigation (or search it from the top bar), and complete the activation process in the service console.

### Obtain security credentials

Access Key is the credential used to access Volcengine services. It consists of Access Key ID (AK) and Secret Access Key (SK).

Log in to the [Volcengine Console](https://console.volcengine.com/), then go to [IAM](https://console.volcengine.com/iam) -> [Access Keys](https://console.volcengine.com/iam/keymanage/) to create and manage your Access Keys. For more information, see the [Access Key documentation](https://www.volcengine.com/docs/6291/65568).

## Install

We recommend using Maven dependencies to integrate Volcengine SDK for Java.

[![maven](https://img.shields.io/maven-central/v/com.volcengine/volc-sdk-java)](https://search.maven.org/artifact/com.volcengine/volc-sdk-java)

```xml
<dependency>
    <groupId>com.volcengine</groupId>
    <artifactId>volc-sdk-java</artifactId>
    <version>latest</version>
</dependency>
```

If your Java version is **Java 9 or later**, add `javax.annotation-api` because it was removed from JDK 9+.

```xml
<dependency>
  <groupId>javax.annotation</groupId>
  <artifactId>javax.annotation-api</artifactId>
  <version>1.3.2</version>
</dependency>
```

### SNAPSHOT release notes

[Version: 2.0.1-SNAPSHOT](https://oss.sonatype.org/content/repositories/snapshots/com/volcengine/volc-sdk-java)

*Note: SNAPSHOT versions may have potential issues. The source branch is `2.0.0-SNAPSHOT`. If you need support, please submit a [ticket](https://console.volcengine.com/workorder/create) and select the corresponding product.*

#### Changes

1. Use OkHttp as the underlying HTTP component (Android compatible)
2. Fix potential thread leaks when using many credentials
3. Abstract some network-related models to avoid conflicts
4. Business packages are mostly unaffected, so migration should be smooth

How to use the SNAPSHOT version:

1. Add the SNAPSHOT Maven repository (SNAPSHOT policy settings are up to you)

```xml
<repository>
   <id>snapshots-repo</id>
   <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
</repository>
```

2. Add dependency

```xml
<dependency>
    <groupId>com.volcengine</groupId>
    <artifactId>volc-sdk-java</artifactId>
    <version>2.0.1-SNAPSHOT</version>
</dependency>
```

## Configuration

### Credential configuration

Volcengine SDK for Java supports the following credential loading methods.

*Note: Replace `Your AK` and `Your SK` in the code with your actual AK and SK.*

**Method 1**: Specify AK/SK explicitly on the client **(recommended)**

```java
iamService.setAccessKey("Your AK");
iamService.setSecretKey("Your SK");
```

**Method 2**: Load AK/SK from environment variables

```bash
VOLC_ACCESSKEY="Your AK"
VOLC_SECRETKEY="Your SK"
```

**Method 3**: Load AK/SK from a file under HOME

Add the following content to `~/.volc/config`:

```json
{
  "ak": "Your AK",
  "sk": "Your SK"
}
```

### Release resources

After calling APIs, explicitly call `destroy()` to release daemon threads.

```java
iamService.destroy()
```

## Other resources

Examples are available under [example](./example)
