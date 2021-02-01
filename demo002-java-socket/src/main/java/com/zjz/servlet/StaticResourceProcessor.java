package com.zjz.servlet;

import com.zjz.utils.Request;
import com.zjz.utils.Response;

import java.io.IOException;

public class StaticResourceProcessor {

    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
