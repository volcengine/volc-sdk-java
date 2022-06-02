package com.volcengine.example.cdn;

import java.util.Date;

public class Utils {
    public static long startTime = new Date().getTime()/1000 - 86400;
    public static long endTime = startTime + 86400;
    public static String ak = "AKLTOGY5ZGM1ZGJkMTYwNDM4YWJiZDJkNTkyYTVjMTllNjc";
    public static String sk = "WXpoaFpXWmhORFprWXpFeU5HUXdORGcyTUdObE9XWm1NR1ppTW1Gak5UUQ==";
    public static String exampleHost = "www.example.com";
    public static String exampleUrl1 = "http://www.example.com/1.txt";
    public static String exampleUrl2 = "http://www.example.com/2.txt";
}
