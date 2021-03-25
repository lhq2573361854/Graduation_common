package com.tianling.common;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/1/22 22:32
 */
public interface ExceptionMessage {

    /**
     * 有错误
     */
    String EXCEPTION_MESSAGE = "有错误";

    /**
     * 空指针错误
     */
    String NULLPOINTEREXCEPTION = "参数不能为空";

    /**
     * 响应状态错误
     */
    String RESPONSESTATUSEXCEPTION = "响应状态错误";

    /**
     * 响应状态错误
     */
    String DATABINDINGEXCEPTION = "数据绑定错误";

    /**
     * 服务器错误
     */
    String SERVERERROREXCEPTION = "服务错误";

    /**
     * 未找到
     */
    String NOTFOUNDEXCEPTION = "未找到";

    /**
     * 传入的参数有误
     */
    String PARAMETERIZATION = "传入的参数有误";

    /**
     * 传入参数为空
     */
    String NULLPARAMETERIZATION = "传入参数为空";

    /**
     * 唯一标识为空
     */
    String IDNULLPARAMETERIZATION = "唯一标识为空";

    /**
     * 唯一标识不存在
     */
    String IDNOTEXSITPARAMETERIZATION = "唯一标识不存在";

    /**
     * 用户的id为空
     */
    String USERIDNOTNULLPARAMETERIZATION = "用户的id为空";

    /**
     * 用户的id不存在
     */
    String USERIDNOTEXISTPARAMETERIZATION = "用户的id不存在";

    /**
     * 文章的id为空
     */
    String ARTICLEIDNOTNULLPARAMETERIZATION = "文章的id为空";

    /**
     * 文章的id不存在
     */
    String ARTICLEIDNOTEXISTPARAMETERIZATION = "文章的id不存在";

    /**
     * 用户名为空
     */
    String USERNAMENULLPARAMETERIZATION = "用户名为空";


    /**
     * 用户名不存在
     */
    String USERNAMENOTEXISTPARAMETERIZATION = "用户名不存在";

    /**
     * 用户数据不存在
     */
    String USERDATANOTEXISTPARAMETERIZATION = "不存在该用户数据";

    /**
     *
     */
    String CATEGORYIDNOTNULLPARAMETERIZATION = "栏目的id为空";

    /**
     * 用户的id不存在
     */
    String CATEGORYIDNOTEXISTPARAMETERIZATION = "栏目的id不存在";

    /**
     * 用户名为空
     */
    String CATEGORYNAMENULLPARAMETERIZATION = "栏目名为空";

    /**
     * 用户名不存在
     */
    String CATEGORYNAMENOTEXISTPARAMETERIZATION = "栏目名不存在";

    /**
     * 用户权限不能为空
     */
    String USERROLENOTNULLPARAMETERIZATION = "用户权限不能为空";

    /**
     * 用户权限不能为空
     */
    String JWTDATAPARAMETERIZATION = "解码失败;数据错误";

    /**
     * spel 表达式  exception
     */
    String SPELEVALUATION = "spel表达式中有误";


    /**
     * 验证码
     */
    String VALIDATE_CODE_EXCEPTION_MESSAGE = "验证码错误";

    /**
     * 手机号错误
     */
    String USERPHONEPARAMETERIZATION = "手机号不存在/手机号码错误";

    /**
     * 手机号不存在
     */
    String USERPHONENOTEXSISTPARAMETERIZATION = "手机号不能为空";
    /**
     * json 格式化错误
     */
    String JSON_FORMAT_EXCEPTION="json格式化异常";
    /**
     * 删除成功 消息
     */
    String DELETESUCCESS = "删除成功";

    /**
     * 查询成功 消息
     */
    String QUERYSUCCESS = "查询成功";

    /**
     * 更新成功 消息
     */
    String UPDATESUCCESS = "更新成功";

    /**
     * 查询失败 消息
     */
    String QUERYFAILED = "查询失败";

    /**
     * 更新失败 消息
     */
    String UPDATEFAILED = "更新失败";

    /**
     * 插入成功 消息
     */
    String INSERTSUCCESS = "插入成功";

    /**
     * 插入失败  消息
     */
    String INSERTFAILED = "插入失败";

    /**
     * 缓存错误  消息
     */
    String CACHE = "缓存错误";

    /**
     * 缓存错误  消息
     */
    String other = "全局错误";

    /**
     * 删除失败 消息
     */
    String DELETEFAILED = "删除失败";

    /**
     * 创建失败  消息
     */
    String CREATFAILED = "创建失败";

    /**
     * unique
     */
    String UNIQUE_EXCEPTION = "用户名、邮箱、手机号重复";
}
