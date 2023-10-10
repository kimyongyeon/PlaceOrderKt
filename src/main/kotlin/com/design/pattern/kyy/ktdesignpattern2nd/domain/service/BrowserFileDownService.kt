package com.design.pattern.kyy.ktdesignpattern2nd.domain.service

import org.springframework.stereotype.Service

@Service
class BrowserFileDownService : FileDownService {
    override fun getFiles() {
        println("BrowserFileDownService getFiles")
    }

}