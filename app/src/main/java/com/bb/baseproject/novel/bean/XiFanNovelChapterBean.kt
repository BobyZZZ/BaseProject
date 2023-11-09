package com.bb.baseproject.novel.bean

import me.ghui.fruit.Attrs
import me.ghui.fruit.annotations.Pick

/**
 * @CopyRight: 广州仰望星空云科技有限公司
 * @Author: Boby
 * @Email: zhouyuechao@xinyu668.com
 * @CreateTime: 2023/10/12 17:59
 * @Description: 稀饭
 */
class XiFanNovelChapterBean(
    @Pick("h2#title") var title: String? = null,
    @Pick("div#news > p") var content: List<String>? = null,
    @Pick(value = "a#pre2", attr = Attrs.HREF) var lastChapter: String? = null,
    @Pick(value = "a#next2", attr = Attrs.HREF) var nextChapter: String? = null,
) : BaseNovelBean() {
    override fun toString(): String {
        return novelFormat(title, content, "lastChapter: ${lastChapter}, nextChapter: $nextChapter")
    }
}