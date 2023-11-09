package com.bb.baseproject.network

import me.ghui.fruit.Fruit
import okhttp3.ResponseBody

/**
 * @CopyRight: 广州仰望星空云科技有限公司
 * @Author: Boby
 * @Email: zhouyuechao@xinyu668.com
 * @CreateTime: 2023/10/16 14:13
 * @Description: 请写描述
 */
val globalFruit = Fruit()
fun <T> ResponseBody.toFruit(clazz: Class<T>): T {
    return globalFruit.fromHtml(string(), clazz)
}