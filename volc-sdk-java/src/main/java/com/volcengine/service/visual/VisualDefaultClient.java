package com.volcengine.service.visual;

import com.volcengine.service.visual.impl.VisualServiceImpl;

public class VisualDefaultClient {
    public static IVisualService iVisualService;

     static {
         iVisualService=VisualServiceImpl.getInstance();
     }

}
