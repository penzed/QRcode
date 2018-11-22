package com.pinux;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 依次为内容(不支持中文),宽,长,中间图标路径,储存路径
        QRCodeUtil.encode("http://blog.pinux.com.cn",
                512, 512,
                "/home/pinux/pinux.jpg",
                "/home/pinux/2018-11-22.jpg");
    }
}
