package com.common.test.pg;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Time {

    private static String string = "debatefertaserasdferww";
    private static String[] sl = {"a","b","e","e","a","b","e"};

    public static void convertTime(){
        long time = System.currentTimeMillis();
        System.out.println(time);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = format.format(new Date(time));
        System.out.println(format1);
    }

    public static void convertData(){
        char[] chars = string.toCharArray();
        for (int i = 0;i<chars.length;i++){
            char aChar = chars[i];
            System.out.print(aChar);
            System.out.print(" ");
        }
    }

    public static void conertSl(){
        List<String> strings = Arrays.asList(sl);
        System.out.println(strings);
    }

    public static void main(String[] args) {
//        convertTime();
//        convertData();
        conertSl();
        Map<String, Object> map = Collections.synchronizedMap(new HashMap<String, Object>());
        ConcurrentHashMap<String, Object> hashMap = new ConcurrentHashMap<String, Object>();
    }

}
