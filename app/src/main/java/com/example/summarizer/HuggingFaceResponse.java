package com.example.summarizer;

import java.util.List;

public class HuggingFaceResponse {
    private String summary_text;

    public String getSummary() {
        return summary_text != null ? summary_text : "No summary available";
    }
}
