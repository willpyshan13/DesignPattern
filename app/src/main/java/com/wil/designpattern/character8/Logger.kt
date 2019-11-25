package com.wil.designpattern.character8

/**
 * desc
 * @author will
 * Created time 2019-11-26 00:24.
 */
abstract class Logger(var name:String ,var leven:Int,var enable:Boolean) {

    fun log(){
        doLog()
    }

    abstract fun doLog()
}