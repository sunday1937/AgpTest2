package com.netease.cloudmusic.agptest;

import java.util.ArrayList;
import java.util.List;

/**
 * created by yunyinyuebeiji5 on 2021/7/7 14:57
 */
public class Test {
    public static void t1() {
        List<String> list = new ArrayList<>(4);

        System.out.println("list.size:" + list.size());

        list.add("aaa");
        System.out.println("list.size:" + list.size());
    }
}
