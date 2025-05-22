package com.volcengine.service.vikingDB;

import org.apache.http.HttpHost;

public class IndexClient extends Index {
  
  public IndexClient(String collectionName, String indexName, String host, String region, String ak, String sk, String scheme) throws Exception {
    VikingDBService vikingDBService = new VikingDBService(host, region, ak, sk, scheme);
    this.collectionName = collectionName;
    this.indexName = indexName;
    this.vikingDBService = vikingDBService;
    this.primaryKey = "__primary_key";
    this.isClient = true;
  }

  public IndexClient(String collectionName, String indexName, String host, String region, String ak, String sk, String scheme, HttpHost proxy) throws Exception {
    VikingDBService vikingDBService = new VikingDBService(host, region, ak, sk, scheme, proxy);
    this.collectionName = collectionName;
    this.indexName = indexName;
    this.vikingDBService = vikingDBService;
    this.primaryKey = "__primary_key";
    this.isClient = true;
  }
}
