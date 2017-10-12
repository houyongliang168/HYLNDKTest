package com.example.houyongliang.hylndktest;

import android.text.TextUtils;

/**
 * Created by houyongliang on 2017/10/10.
 */

public class Test1 {
    public void test() {
    }

    public static void main(String[] args) {
        if (TextUtils.isEmpty("adfasf")) {
            System.out.println("测试中");
            System.out.println("测试中2");
            System.out.println("测试中3");
            System.out.println("测试中4");
            new Test1().test2();
        }
    }

    public void test2() {
        System.out.println("测试2");
    }
}
