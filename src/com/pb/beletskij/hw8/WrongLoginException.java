package com.pb.beletskij.hw8;

public class WrongLoginException extends  Exception{

    public WrongLoginException(String s) {
        super(s);
    }

    public WrongLoginException() {
    }
}