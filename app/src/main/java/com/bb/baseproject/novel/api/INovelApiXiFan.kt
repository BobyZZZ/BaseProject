package com.bb.baseproject.novel.api

import com.bb.baseproject.novel.bean.XiFanNovelChapterBean
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.PartMap
import retrofit2.http.Tag
import retrofit2.http.Url

/**
 * @CopyRight: 广州仰望星空云科技有限公司
 * @Author: Boby
 * @Email: zhouyuechao@xinyu668.com
 * @CreateTime: 2023/10/9 18:13
 * @Description: 请写描述
 */
interface INovelApiXiFan {

    /**
     * 首页
     */
    @GET
    suspend fun home(@Url url: String = "https://zhaimen.xifan.org/"): XiFanNovelChapterBean

    /**
     * 搜索
     */
    @POST
    suspend fun search(
//        @Field("keyboard", encoded = true) keyWord: String = "哈哈",
        @Body body: SearchBody,
        @Url url: String = "https://xifan.org/e/search/index.php"
    ): ResponseBody

    /**
     * 窄门
     */
    @GET
    suspend fun zhaiMen(@Url url: String = "https://zhaimen.xifan.org/99614.html"): XiFanNovelChapterBean

    /**
     * 兄弟
     */
    @GET
    suspend fun brother(@Url url: String = "https://zhaimen.xifan.org/99614.html"): XiFanNovelChapterBean
}

class SearchBody {
    var keyboard: String? = null
}