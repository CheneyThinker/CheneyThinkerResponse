package com.cheney.thinker.response;

import org.slf4j.Logger;
import org.springframework.util.StringUtils;

/**
 * @description 响应结果生成器
 * @author CheneyThinker
 * @date 2018-06-14
 */
public final class ResponseGenerator {

    private static final String DEFAULT_OK = "OK";
    private static final String format = "\nclass:\t{}\nmethod:\t{}\nline:\t{}\n";

    public static Response genOk() {
        return new Response()
                .setCode(ResponseCode.OK)
                .setMsg(DEFAULT_OK);
    }

    public static Response genOk(Object data) {
        return genOk()
                .setData(data);
    }

    public static Response genBadRequest(Logger logger, Exception e, String defaultMsg) {
        StackTraceElement[] elements = e.getStackTrace();
        for (int i = elements.length - 1; i >= 0; i--) {
            StackTraceElement element = elements[i];
            logger.error(format, element.getClassName(), element.getMethodName(), element.getLineNumber());
        }
        return new Response()
                .setCode(ResponseCode.BAD_REQUEST)
                .setMsg(StringUtils.isEmpty(e.getMessage()) ? defaultMsg : e.getMessage());
    }

    public static Response genBadRequest(Logger logger, Object data, Exception e, String defaultMsg) {
        return genBadRequest(logger, e, defaultMsg)
                .setData(data);
    }


}
