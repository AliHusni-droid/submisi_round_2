package com.example.marketplace.network


import com.example.marketplace.model.ProductModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/barang")
    //ambil data dari api/barang
    fun getData(): Call<ArrayList<ProductModel>>
}