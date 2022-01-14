package com.informatika19100091.databarang.network

import android.telecom.Call
import com.informatika19100091.databarang.model.ResponseActionBarang
import com.informatika19100091.databarang.model.ResponseBarang
import com.informatika19100091.databarang.model.ResponseUsers
import com.informatika19100091.databarang.model.ResponseUsersItem
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("read.php")
    fun getBarang() : Call<List<ResponseBarang>>

    @FormUrlEncoded
    @POST("create.php")
    fun insertBarang(
        @Field("Nama_barang") namaBarang: String?,
        @Field("Jumlah_barang") jmlBarang: String?
    ): retrofit2.Call<ResponseActionBarang>

    @FormUrlEncoded
    @POST("update.php")
    fun updateBarang(
        @Field("id") id:String?,
        @Field("Nama_Barang") namaBarang: String?,
        @Field("JumlahBarang") jmlBarang: String?
    ): retrofit2.Call<ResponseActionBarang>

    @FormUrlEncoded
    @POST("delete.php")
    fun deleteBarang(
        @Field("id") id: String?
    ): retrofit2.Call<ResponseActionBarang>

    @FormUrlEncoded
    @POST("login.php")
    fun login(
        @Field("Username") Username : String?,
        @Field("Password") Password : String?
    ): retrofit2.Call<ResponseAdmin>
    @FormUrlEncoded
    @POST
    fun register(
        @Field("Username") Username : String?,
        @Field("Password") Password : String?
    ): retrofit2.Call<ResponseAdmin>

}