package com.bb.baseproject.network

import me.ghui.fruit.converter.retrofit.FruitConverterFactory
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * @CopyRight: 广州仰望星空云科技有限公司
 * @Author: Boby
 * @Email: zhouyuechao@xinyu668.com
 * @CreateTime: 2023/10/9 18:10
 * @Description: 请写描述
 */
object RetrofitManager {
    private val _client by lazy {
        OkHttpClient.Builder().also {

        }.build()
    }

    private val _retrofit by lazy {
        Retrofit.Builder().also {
            it.baseUrl("https://www.baidu.com")
            it.client(_client)
            it.addConverterFactory(FruitConverterFactory.create())
            it.addConverterFactory(GsonConverterFactory.create())
        }.build()
    }

    fun <T> getService(clazz: Class<T>) = _retrofit.create(clazz)
    fun getHttpService(): IHttpApi = _retrofit.create(IHttpApi::class.java)
}

interface IHttpApi {
    @GET
    suspend fun get(@Url url: String): ResponseBody
}