package com.lancq.spi;

/**
 * @Author lancq
 * @Description
 * @Date 2018/6/30
 **/
public class OracleDriver implements DataBaseDriver{
    public String connect(String s) {
        return "build oracle connection:" + s;
    }
}
