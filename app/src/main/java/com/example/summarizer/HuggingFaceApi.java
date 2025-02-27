package com.example.summarizer;

import com.example.summarizer.HuggingFaceRequest;
import com.example.summarizer.HuggingFaceResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface HuggingFaceApi {
    @Headers({
            "Authorization: Bearer your_key", // Replace this with your actual token", // Replace with actual key
            "Content-Type: application/json"
    })
    @POST("https://api-inference.huggingface.co/models/facebook/bart-large-cnn")
    Call<List<HuggingFaceResponse>> getSummary(@Body HuggingFaceRequest request); // ✅ Return List
}


