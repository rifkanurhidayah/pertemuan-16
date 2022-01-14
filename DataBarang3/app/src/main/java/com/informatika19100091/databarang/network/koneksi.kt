package com.informatika19100091.databarang.network
import  retrofit2.Retrofit
import retrofit2.Converter.
import retrofit2.converter.gson.GsonConverterFactory

class koneksi {
    companion object{
        val BaseUrl = "https://10.234.133.69/dabar/api/"
        val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service: ApiService = retrofit.create(ApiService::class.java)
    }
}