package com.design.pattern.kyy.ktdesignpattern2nd.domain.service

interface FileDownService {
    fun getFiles()

    fun getFilesByCurl() {
        println("getFilesByCurl")
    }

    private fun getFilesByCurl2() {
        println("getFilesByCurl2")
    }

    companion object {
        fun getFilesByCurl() {
            println("static getFilesByCurl")
        }
    }
}