package com.common.test.string;

import java.util.*;

public class HandlerString {

    private static String str = "ddabceedbaseda";

    public static void handler(String str){
        Map map = charToMap(str.toCharArray());
        print(map);

        char[] swap = swap(str.toCharArray());
        Map map1 = charToMap(swap);
        StringBuffer distinct = distinct(str,map1);
        System.out.println(distinct.toString());

    }

    public static void main(String[] args) {
        handler(str);
    }

    /**
     * char数组冒泡排序
     */
    public static char[] swap(char[] chars){
        char[] chars1 = chars;
        for (int j = chars1.length ; j>0; j--){
            for (int a = 1; a <=j -1; a++){
                if (chars1[a] < chars1[a-1]){
                    char temp = chars1[a];
                    chars1[a] = chars1[a -1];
                    chars1[a-1] = temp;
                }
            }
        }
        return chars1;
    }

    /**
     * 打印hashp中的数据
     * @param map
     */
    public static void print(Map map){
        StringBuffer buffer = new StringBuffer();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            buffer.append(entry.getKey()+"("+entry.getValue()+")");
        }
        System.out.println(buffer.toString());
    }

    /**
     * 去重
     */
    public static StringBuffer distinct(String str,Map map){
        char[] chars = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer saa = new StringBuffer();
        Set<String> strings = new HashSet<String>();
        for (char car : chars){
            strings.add(String.valueOf(car));
        }
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
//            String next = iterator.next();
//            stringBuffer.append(next+"("+map.get(next)+")");
            stringBuffer.append(iterator.next());
        }
        char[] swap = swap(stringBuffer.toString().toCharArray());
        for (int i=0;i<swap.length;i++){
            saa.append(swap[i]+"("+map.get(String.valueOf(swap[i]))+")");
        }
        return saa;
    }

    public static Map charToMap(char[] chars ){
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (char car : chars){
            if (map.containsKey(String.valueOf(car))){
                Integer integer = map.get(String.valueOf(car));
                int a = ++integer;
                map.put(String.valueOf(car),a);
            }else {
                map.put(String.valueOf(car),1);
            }
        }
        return map;
    }

    public static  void _aaaa_11(){}
    public static  void $aaaa_(){}
    public static  void mai(){}
    public static  void mai1(){}
}
