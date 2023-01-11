<h1 align="center"><img src="https://iam.volccdn.com/obj/volcengine-public/pic/volcengine-icon.png"></h1>
<h1 align="center">火山引擎SDK for Java</h1> 
欢迎使用火山引擎SDK for Java，本文档为您介绍如何获取及调用SDK。

## 前置准备
### 服务开通
请确保您已开通了您需要访问的服务。您可前往[火山引擎控制台](https://console.volcengine.com/ )，在左侧菜单中选择或在顶部搜索栏中搜索您需要使用的服务，进入服务控制台内完成开通流程。
### 获取安全凭证
Access Key（访问密钥）是访问火山引擎服务的安全凭证，包含Access Key ID（简称为AK）和Secret Access Key（简称为SK）两部分。您可登录[火山引擎控制台](https://console.volcengine.com/ )，前往“[访问控制](https://console.volcengine.com/iam )”的“[访问密钥](https://console.volcengine.com/iam/keymanage/ )”中创建及管理您的Access Key。更多信息可参考[访问密钥帮助文档](https://www.volcengine.com/docs/6291/65568 )。

## 获取与安装
推荐通过Maven依赖使用火山引擎SDK for Java

[![maven](https://img.shields.io/maven-central/v/com.volcengine/volc-sdk-java)](https://search.maven.org/artifact/com.volcengine/volc-sdk-java)
```xml
<dependency>
    <groupId>com.volcengine</groupId>
    <artifactId>volc-sdk-java</artifactId>
    <version>最新版本</version>
</dependency>
```

### SNAPSHOT发布说明
[版本号：2.0.1-SNAPSHOT](https://oss.sonatype.org/content/repositories/snapshots/com/volcengine/volc-sdk-java)

*注意：SNAPSHOT版本可能存在潜在问题，源码分支为2.0.0-SNAPSHOT，如您有沟通需求，请提交[工单](https://console.volcengine.com/workorder/create)选择对应产品获得沟通*

#### 变更说明
1. 使用OkHttp作为底层数据交互的http组件库，可以兼容安卓手机端
2. 解决大量凭证潜在的线程泄露问题
3. 抽象部分与网络库相关的model，避免冲突
4. 业务包基本不感知底层变更，理论上可以平滑迁移

如何使用SNAPSHOT版本
1. 添加SNAPSHOT的Maven仓库，SNAPSHOT策略配置请自行查阅文档
```xml
 <repository>
    <id>snapshots-repo</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
</repository>
```
2. 添加依赖
```xml
<dependency>
    <groupId>com.volcengine</groupId>
    <artifactId>volc-sdk-java</artifactId>
    <version>2.0.1-SNAPSHOT</version>
</dependency>

```


## 相关配置
### 安全凭证配置
火山引擎SDK for Java支持以下几种方式进行凭证管理：

*注意：代码中Your AK及Your SK需要分别替换为您的AK及SK。*

**方式一**：在Client中显式指定AK/SK **（推荐）**
```java
iamService.setAccessKey("Your AK");
iamService.setSecretKey("Your SK");
```

**方式二**：从环境变量加载AK/SK
  ```bash
  VOLC_ACCESSKEY="Your AK"  
  VOLC_SECRETKEY="Your SK"
  ```
**方式三**：从HOME文件加载AK/SK

在本地的~/.volc/config中添加如下内容：
  ```json
    {
      "ak": "Your AK",
      "sk": "Your SK"
    }
  ```

### 释放资源
当您调用完成后，通过显式的调用destroy来释放守护线程
```java
iamService.destroy()
```

##其它资源
示例参见[example](./example)