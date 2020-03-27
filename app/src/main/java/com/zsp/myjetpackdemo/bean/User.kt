package com.zsp.myjetpackdemo.bean

/**
 * description:
 * author:created by Andy on 2020/3/27 0027 10:42
 * email:zsp872126510@gmail.com
 */

//属性既可以用关键字 var 声明为可变的，也可以用关键字 val 声明为只读的。
data  class User(var firstName: String, val lastName: String)
