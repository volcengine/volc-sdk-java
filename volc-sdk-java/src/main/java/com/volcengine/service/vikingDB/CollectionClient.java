package com.volcengine.service.vikingDB;

import org.apache.http.HttpHost;

public class CollectionClient extends Collection {
  public CollectionClient(String collectionName, String host, String region, String ak, String sk, String scheme) throws Exception {
    VikingDBService vikingDBService = new VikingDBService(host, region, ak, sk, scheme);
    this.collectionName = collectionName;
    this.vikingDBService = vikingDBService;
    this.primaryKey = "__primary_key";
    this.isClient = true;
  }

  public CollectionClient(String collectionName, String host, String region, String ak, String sk, String scheme, HttpHost proxy) throws Exception {
    VikingDBService vikingDBService = new VikingDBService(host, region, ak, sk, scheme, proxy);
    this.collectionName = collectionName;
    this.vikingDBService = vikingDBService;
    this.primaryKey = "__primary_key";
    this.isClient = true;
  }
}
