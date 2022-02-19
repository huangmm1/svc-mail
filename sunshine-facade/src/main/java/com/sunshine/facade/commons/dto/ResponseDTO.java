package com.sunshine.facade.commons.dto;

public class ResponseDTO<T> {

    /**
     * 响应头
     */
    public CommonHead head;

    /**
     * 响应体
     */
    public T body;

    public CommonHead getHead() {
        return head;
    }

    public void setHead(CommonHead head) {
        this.head = head;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
