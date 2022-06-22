package com.zh.error;

public class TextError {

    public void ab() {
        int i = 1 / 0;
        String s = null;
        if (s.equals("a"))
            System.out.println(i);
    }

}
