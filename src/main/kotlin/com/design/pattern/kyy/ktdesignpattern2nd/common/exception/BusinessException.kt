package com.design.pattern.kyy.ktdesignpattern2nd.common.exception

import org.springframework.http.HttpStatus

class BusinessException(val errorCode: ErrorCode) : RuntimeException(errorCode.message) {
    enum class ErrorCode(val code: String, val message: String, val httpStatus: HttpStatus) {
        USER_NOT_FOUND("1001", "User not found", HttpStatus.NOT_FOUND),
        PRODUCT_OUT_OF_STOCK("1002", "Product out of stock", HttpStatus.BAD_REQUEST),
        INVALID_PAYMENT("1003", "Invalid payment method", HttpStatus.BAD_REQUEST),
        INVALID_STOCK("1004", "Invalid payment method", HttpStatus.BAD_REQUEST);
    }
}
