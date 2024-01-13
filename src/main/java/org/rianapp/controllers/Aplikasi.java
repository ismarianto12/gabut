package org.rianapp.controllers;

import java.util.HashMap;
import java.util.Map;

public class Aplikasi {

    public String Parameter;
    public String NamaApp;
    public String KelasTrn;
    
    public Aplikasi(String Initialize){
        this.NamaApp = Initialize;
    }

    public Map<String,Object> aplikasi(String param){
        this.Parameter = "passing";
        Map app = new HashMap<>();
        app.put("response","Data");
        System.out.println(app);
        System.out.println(this.Parameter);
        return app;
    }

}
