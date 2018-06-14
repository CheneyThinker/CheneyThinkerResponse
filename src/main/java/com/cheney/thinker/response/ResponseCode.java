package com.cheney.thinker.response;

/**
 * Status Code Definitions
 *  Informational 1xx
 *  Successful 2xx
 *  Redirection 3xx
 *  Client Error 4xx
 *  Server Error 5xx
 *  https://tools.ietf.org/html/rfc2616
 * @description 响应码枚举，参考HTTP状态码的语义
 * @author CheneyThinker
 * @date 2018-06-14
 */
public enum ResponseCode {

    CONTINUE(100),//Continue
    SWITCHING_PROTOCOLS(101),//Switching Protocols

    OK(200),//OK
    CREATED(201),//Created
    ACCEPTED(202),//Accepted
    NON_AUTHORITATIVE_INFORMATION(203),//Non-Authoritative Information
    NO_CONTENT(204),//No Content
    RESET_CONTENT(205),//Reset Content
    PARTIAL_CONTENT(206),//Partial Content

    MULTIPLE_CHOICES(300),//Multiple Choices
    MOVED_PERMANENTLY(301),//Moved Permanently
    FOUND(302),//Found
    SEE_OTHER(303),//See Other
    NOT_MODIFIED(304),//Not Modified
    USE_PROXY(305),//Use Proxy
    UNUSED(306),//Unused
    TEMPORARY_REDIRECT(307),//Temporary Redirect

    BAD_REQUEST(400),//Bad Request
    UNAUTHORIZED(401),//Unauthorized
    PAYMENT_REQUIRED(402),//Payment Required
    FORBIDDEN(403),//Forbidden
    NOT_FOUND(404),//Not Found
    METHOD_NOT_ALLOWED(405),//Method Not Allowed
    NOT_ACCEPTABLE(406),//Not Acceptable
    PROXY_AUTHENTICATION_REQUIRED(407),//Proxy Authentication Required
    REQUEST_TIMEOUT(408),//Request Timeout
    CONFLICT(409),//Conflict
    GONE(410),//Gone
    LENGTH_REQUIRED(411),//Length Required
    PRECONDITION_FAILED(412),//Precondition Failed
    REQUEST_ENTITY_TOO_LARGE(413),//Request Entity Too Large
    REQUEST_URI_TOO_LONG(414),//Request-URI Too Long
    UNSUPPORTED_MEDIA_TYPE(415),//Unsupported Media Type
    REQUESTED_RANGE_NOT_SATISFIABLE(416),//Requested Range Not Satisfiable
    EXPECTATION_FAILED(417),//Expectation Failed

    INTERNAL_SERVER_ERROR(500),//Internal Server Error
    NOT_IMPLEMENTED(501),//Not Implemented
    BAD_GATEWAY(502),//Bad Gateway
    SERVICE_UNAVAILABLE(503),//Service Unavailable
    GATEWAY_TIMEOUT(504),//Gateway Timeout
    HTTP_VERSION_NOT_SUPPORTED(505);//HTTP Version Not Supported

    private final Integer code;

    ResponseCode(final Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}
