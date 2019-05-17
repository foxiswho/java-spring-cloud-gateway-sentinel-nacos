package com.foxwho.demo.exception;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlBlockHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class CustomUrlBlockExceptionHandler implements UrlBlockHandler {
    @Override
    public void blocked(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws IOException {
        System.out.println(httpServletRequest);
        System.out.println(httpServletResponse);
        String data = "{\"code\":\"500\",\"message\":\"限流了\"}";
        //将字符转换成字节数组，指定以UTF-8编码进行转换
        byte[] dataByteArr = data.getBytes(StandardCharsets.UTF_8);
        httpServletResponse.setStatus(500);
        OutputStream outputStream = httpServletResponse.getOutputStream();
        httpServletResponse.setHeader("content-type", "text/html;charset=UTF-8");
        outputStream.write(dataByteArr);
    }
}