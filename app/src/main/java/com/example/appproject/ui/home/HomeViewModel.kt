package com.example.appproject.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson

object Test{
    private const val str:String = "{\"data\":{\"curPage\":1,\"datas\":[{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":true,\"host\":\"\",\"id\":23759,\"link\":\"https://juejin.cn/post/7125250156194168869\",\"niceDate\":\"1天前\",\"niceShareDate\":\"1天前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659317303000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659317303000,\"shareUser\":\"Zhu_Jiang\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"让你的应用完美适配平板\",\"type\":0,\"userId\":56200,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":true,\"host\":\"\",\"id\":23757,\"link\":\"https://juejin.cn/post/7126698891692474375\",\"niceDate\":\"1天前\",\"niceShareDate\":\"1天前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659314550000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659314550000,\"shareUser\":\"RicardoMJiang\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"Kotlin 1.7 新特性：支持跨模块增量编译\",\"type\":0,\"userId\":13971,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"郭霖\",\"canEdit\":false,\"chapterId\":409,\"chapterName\":\"郭霖\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23761,\"link\":\"https://mp.weixin.qq.com/s/tHZZp50uz19S7yW13uilsg\",\"niceDate\":\"1天前\",\"niceShareDate\":\"13小时前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659283200000,\"realSuperChapterId\":407,\"selfVisible\":0,\"shareDate\":1659370668000,\"shareUser\":\"\",\"superChapterId\":408,\"superChapterName\":\"公众号\",\"tags\":[{\"name\":\"公众号\",\"url\":\"/wxarticle/list/409/1\"}],\"title\":\"Kotlin快速编译背后的黑科技，了解一下~\",\"type\":0,\"userId\":-1,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23747,\"link\":\"https://juejin.cn/post/7123828026722222094\",\"niceDate\":\"1天前\",\"niceShareDate\":\"2天前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659278654000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659185229000,\"shareUser\":\"鸿洋\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"多线程、多进程同时操作MMAP，会怎么样？\",\"type\":0,\"userId\":2,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23748,\"link\":\"https://juejin.cn/post/7125593351264403464\",\"niceDate\":\"1天前\",\"niceShareDate\":\"2天前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659278649000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659185235000,\"shareUser\":\"鸿洋\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"从val跟var了解虚拟机世界\",\"type\":0,\"userId\":2,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23750,\"link\":\"https://juejin.cn/post/7119116752939646984\",\"niceDate\":\"1天前\",\"niceShareDate\":\"2天前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659278645000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659185539000,\"shareUser\":\"鸿洋\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"面试官：应用上线后Cpu使用率飙升如何排查？\",\"type\":0,\"userId\":2,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23751,\"link\":\"https://juejin.cn/post/7125675253707046926\",\"niceDate\":\"1天前\",\"niceShareDate\":\"2天前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659278643000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659185950000,\"shareUser\":\"鸿洋\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"Android VSYNC与图形系统中的撕裂、双缓冲、三缓冲浅析\",\"type\":0,\"userId\":2,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23745,\"link\":\"https://juejin.cn/post/7125738805159542814\",\"niceDate\":\"2022-07-30 10:59\",\"niceShareDate\":\"2022-07-30 10:59\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659149982000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659149982000,\"shareUser\":\"张风捷特烈\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"Android NDK 开发 | CMake 使用手册 - 初见篇\",\"type\":0,\"userId\":31634,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23743,\"link\":\"https://weilu.blog.csdn.net/article/details/125997035\",\"niceDate\":\"2022-07-29 23:22\",\"niceShareDate\":\"2022-07-29 23:22\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659108124000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659108124000,\"shareUser\":\"唯鹿\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"Jetpack Compose 从入门到入门（八）\",\"type\":0,\"userId\":2657,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23730,\"link\":\"https://juejin.cn/post/7125637692766830622\",\"niceDate\":\"2022-07-29 14:19\",\"niceShareDate\":\"2022-07-29 14:19\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659075558000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1659075558000,\"shareUser\":\"图你怀中安稳\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"Bitmap 重复使用已经回收的图片问题\",\"type\":0,\"userId\":41223,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"鸿洋\",\"canEdit\":false,\"chapterId\":408,\"chapterName\":\"鸿洋\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23755,\"link\":\"https://mp.weixin.qq.com/s/X-Je_KYZJHV2h0-YbiQaQg\",\"niceDate\":\"2022-07-29 00:00\",\"niceShareDate\":\"1天前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659024000000,\"realSuperChapterId\":407,\"selfVisible\":0,\"shareDate\":1659279555000,\"shareUser\":\"\",\"superChapterId\":408,\"superChapterName\":\"公众号\",\"tags\":[{\"name\":\"公众号\",\"url\":\"/wxarticle/list/408/1\"}],\"title\":\"这交互炸了系列，自定义 View 实现汉字笔顺动画\",\"type\":0,\"userId\":-1,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"郭霖\",\"canEdit\":false,\"chapterId\":409,\"chapterName\":\"郭霖\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23756,\"link\":\"https://mp.weixin.qq.com/s/43T-YgmBA8jUwNnErzzhxA\",\"niceDate\":\"2022-07-29 00:00\",\"niceShareDate\":\"1天前\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1659024000000,\"realSuperChapterId\":407,\"selfVisible\":0,\"shareDate\":1659279568000,\"shareUser\":\"\",\"superChapterId\":408,\"superChapterName\":\"公众号\",\"tags\":[{\"name\":\"公众号\",\"url\":\"/wxarticle/list/409/1\"}],\"title\":\"手把手带你实现西瓜视频的责任链埋点框架\",\"type\":0,\"userId\":-1,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23720,\"link\":\"https://juejin.cn/post/7125021894562349092\",\"niceDate\":\"2022-07-28 17:18\",\"niceShareDate\":\"2022-07-28 17:18\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1658999938000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1658999938000,\"shareUser\":\"彭旭锐\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"NDK 系列（6）：说一下注册 JNI 函数的方式和时机\",\"type\":0,\"userId\":30587,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"\",\"canEdit\":false,\"chapterId\":502,\"chapterName\":\"自助\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23719,\"link\":\"https://juejin.cn/post/7125338583959306248\",\"niceDate\":\"2022-07-28 17:18\",\"niceShareDate\":\"2022-07-28 17:18\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1658999911000,\"realSuperChapterId\":493,\"selfVisible\":0,\"shareDate\":1658999911000,\"shareUser\":\"彭旭锐\",\"superChapterId\":494,\"superChapterName\":\"广场Tab\",\"tags\":[],\"title\":\"NDK 系列（5）：JNI 从入门到实践，万字爆肝详解！\",\"type\":0,\"userId\":30587,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"鸿洋\",\"canEdit\":false,\"chapterId\":408,\"chapterName\":\"鸿洋\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23722,\"link\":\"https://mp.weixin.qq.com/s/13jPNG1pSxQnyyrEI26rFA\",\"niceDate\":\"2022-07-28 00:00\",\"niceShareDate\":\"2022-07-28 22:53\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1658937600000,\"realSuperChapterId\":407,\"selfVisible\":0,\"shareDate\":1659020036000,\"shareUser\":\"\",\"superChapterId\":408,\"superChapterName\":\"公众号\",\"tags\":[{\"name\":\"公众号\",\"url\":\"/wxarticle/list/408/1\"}],\"title\":\"那些年Android UI开发中所遇到的各种坑\",\"type\":0,\"userId\":-1,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"郭霖\",\"canEdit\":false,\"chapterId\":409,\"chapterName\":\"郭霖\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23723,\"link\":\"https://mp.weixin.qq.com/s/uiAOYOQu7ZM3jrPYuv6cPg\",\"niceDate\":\"2022-07-28 00:00\",\"niceShareDate\":\"2022-07-28 22:54\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1658937600000,\"realSuperChapterId\":407,\"selfVisible\":0,\"shareDate\":1659020051000,\"shareUser\":\"\",\"superChapterId\":408,\"superChapterName\":\"公众号\",\"tags\":[{\"name\":\"公众号\",\"url\":\"/wxarticle/list/409/1\"}],\"title\":\"Activity的五种启动模式\",\"type\":0,\"userId\":-1,\"visible\":1,\"zan\":0},{\"apkLink\":\"\",\"audit\":1,\"author\":\"美团技术团队\",\"canEdit\":false,\"chapterId\":417,\"chapterName\":\"美团技术团队\",\"collect\":false,\"courseId\":13,\"desc\":\"\",\"descMd\":\"\",\"envelopePic\":\"\",\"fresh\":false,\"host\":\"\",\"id\":23724,\"link\":\"https://mp.weixin.qq.com/s/nowNpIOHBFHD0pctcKr2UA\",\"niceDate\":\"2022-07-28 00:00\",\"niceShareDate\":\"2022-07-28 22:54\",\"origin\":\"\",\"prefix\":\"\",\"projectLink\":\"\",\"publishTime\":1658937600000,\"realSuperChapterId\":407,\"selfVisible\":0,\"shareDate\":1659020066000,\"shareUser\":\"\",\"superChapterId\":408,\"superChapterName\":\"公众号\",\"tags\":[{\"name\":\"公众号\",\"url\":\"/wxarticle/list/417/1\"}],\"title\":\"日志导致线程Block的这些坑，你不得不防\",\"type\":0,\"userId\":-1,\"visible\":1,\"zan\":0}],\"offset\":0,\"over\":false,\"pageCount\":639,\"size\":20,\"total\":12761},\"errorCode\":0,\"errorMsg\":\"\"}"
    val articleList: ArticleList = Gson().fromJson(str, ArticleList::class.java)
    fun title():String{
        return articleList.data.datas[0].title
    }
    fun link():String{
        return articleList.data.datas[0].link
    }
    fun collect():Boolean{
        return articleList.data.datas[0].collect
    }
    fun niceDate():String{
        return articleList.data.datas[0].niceDate
    }
}
data class ArticleList(var data: Data)

data class Data(var curPage: Int, var datas: MutableList<ArticleItem>)

data class ArticleItem(var title: String, var link: String,var collect: Boolean, var niceDate:String)
class ViewModel: ViewModel() {
    var news = MutableLiveData<ArticleItem>()
    fun getDatas():List<ArticleItem> = Test.articleList.data.datas
}
