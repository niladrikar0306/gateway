package com.nkar.gateway.api.viewmodel;

public class Responses {

    public static SimpleResponse SUCCESSFUL;
    public static SimpleResponse FAILED;

    {
        SUCCESSFUL = new SimpleResponse();
        SUCCESSFUL.setStatus("successful");

        FAILED = new SimpleResponse();
        FAILED.setStatus("failed");
    }

}
