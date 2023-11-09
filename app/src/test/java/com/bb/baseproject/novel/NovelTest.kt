package com.bb.baseproject.novel

import com.bb.baseproject.network.RetrofitManager
import com.bb.baseproject.novel.api.INovelApiXiFan
import com.bb.baseproject.novel.api.SearchBody
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class NovelTest {
    private val _xiFanNovelChapterBean by lazy {
        RetrofitManager.getService(INovelApiXiFan::class.java)
    }

    @Before
    fun prepare() {

    }

    @Test
    fun main() {
        runBlocking {
            _xiFanNovelChapterBean.zhaiMen().also {
                println("zm response: ${it}")
            }
            println("test finish")
        }
    }

    @Test
    fun search() {
        runBlocking {
            _xiFanNovelChapterBean.search(SearchBody().also {
                it.keyboard = "哈哈"
            }).string().also {
                println("search page response = ${it}")
            }
        }
    }
}
