package com.nkar.gateway.api.controller;

import com.nkar.gateway.api.model.PageRequest;
import com.nkar.gateway.api.model.PageResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @PostMapping("/page")
    public PageResponse getPage(PageRequest request) {
        return new PageResponse(
                request.getPageType().name()
        );
    }

}
