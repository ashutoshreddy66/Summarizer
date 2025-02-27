package com.example.summarizer;

import java.util.HashMap;
import java.util.Map;


public class HuggingFaceRequest {
//    private Map<String, String> inputs;
    private String inputs;

    public HuggingFaceRequest(String text) {
//        this.inputs = new HashMap<>();
//        this.inputs.put("inputs", text);\
        this.inputs = text;
    }
}
