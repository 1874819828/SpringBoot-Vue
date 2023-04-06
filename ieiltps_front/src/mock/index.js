//引入mockjs
import Mock from 'mockjs'

//延时200-600毫秒请求到数据
Mock.setup({
    timeout: '200-600'
})

Mock.mock(RegExp("/Login" + ".*"), 'get', option => {
    // console.log(option.url) // 请求的url
    // console.log(option.body)// body为post请求参数
    return {
        status: 200,
        message: "获取数据成功", "ret": 0,
        "data":
        {
            "mtime": "@datetime",//随机生成日期时间
            "score|1-800": 1,//随机生成1-800的数字
            "rank|1-100": 1,//随机生成1-100的数字
            "stars|1-5": 1,//随机生成1-5的数字
            "nickname": "@cname",//随机生成中文名字
            //生成图片
            "img": "@image('200x100', '#ffcc33', '#FFF', 'png', 'Fast Mock')"
        }

    }
})