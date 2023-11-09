package com.bb.baseproject.novel.bean

/**
 * @CopyRight: 广州仰望星空云科技有限公司
 * @Author: Boby
 * @Email: zhouyuechao@xinyu668.com
 * @CreateTime: 2023/10/13 18:11
 * @Description: 请写描述
 */
open class BaseNovelBean {
    protected fun novelFormat(
        title: String? = null,
        lineContent: List<String>? = null,
        postfix: String? = null
    ): String {
        return novelFormat(title, lineContent?.joinToString("\n  ", "\t"), postfix)
    }

    protected fun novelFormat(
        title: String? = null,
        content: String? = null,
        postfix: String? = null
    ): String {
        return """
$title

$content

$postfix"""
    }
}