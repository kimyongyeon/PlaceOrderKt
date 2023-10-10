package com.design.pattern.kyy.ktdesignpattern2nd.domain.service

import org.springframework.stereotype.Service

@Service
class CurlFileDownService : FileDownService {
    override fun getFiles() {
        println("CurlFileDownService getFiles")
    }

    protected fun getFilesByCurl2() {
        println("getFilesByCurl2")
    }

}