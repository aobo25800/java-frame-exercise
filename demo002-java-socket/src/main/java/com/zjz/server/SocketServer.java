package com.zjz.server;


import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketServer {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(25800);
            Socket s = serverSocket.accept();
            System.out.println("*******" + s.getInetAddress());
            while (true) {
                byte[] bytes = new byte[2048];
                OutputStream outputStream = s.getOutputStream();
                outputStream.write("hello".getBytes());
                s.getInputStream().read(bytes);
                System.out.println("data: " + new String(bytes, 0, s.getInputStream().read(bytes), "utf-8"));
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
