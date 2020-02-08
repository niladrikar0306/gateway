package com.nkar.gateway.api.viewmodel;

import com.nkar.gateway.api.model.PageType;

public class PageRequest {

    private PageType pageType;

    public PageType getPageType() {
        return pageType;
    }

    public void setPageType(PageType pageType) {
        this.pageType = pageType;
    }
}
