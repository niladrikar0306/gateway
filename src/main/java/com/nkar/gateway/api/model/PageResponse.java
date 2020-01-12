package com.nkar.gateway.api.model;

public class PageResponse {

    private String pageName;

    public PageResponse(String pageName) {
        this.pageName = pageName;
    }

    public String getPageName() {
        return pageName;
    }
}
