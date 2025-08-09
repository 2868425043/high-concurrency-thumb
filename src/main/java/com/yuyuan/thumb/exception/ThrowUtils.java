package com.yuyuan.thumb.exception;

import com.yuyuan.thumb.common.ErrorCode;

public class ThrowUtils {
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        if (condition) {
            throw new BusinessException(errorCode.getCode(), errorCode.getMessage());
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        if (condition) {
            throw new BusinessException(errorCode, message);
        }
    }
}
