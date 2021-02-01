package com.zjz.client;

import java.io.*;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.Arrays;

public class ClientSocket {
    public static void main(String[] args){
        try {

                Socket client = new Socket("192.168.0.192", 9700);
                byte[] a = {1, 2, 3};
            while (true) {
                byte[] bytes = new byte[2048];
                System.out.println("new b: " + new String(bytes));
                OutputStream o = client.getOutputStream();
                o.write("测试".getBytes());

                InputStream inputStream = client.getInputStream();
                inputStream.read(bytes);
                System.out.println(new String(bytes));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
