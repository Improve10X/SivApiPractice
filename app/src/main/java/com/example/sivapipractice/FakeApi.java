package com.example.sivapipractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeApi {
    @GET("renukaTemplates")
    Call<List<Product>> fetchProduct();
}
