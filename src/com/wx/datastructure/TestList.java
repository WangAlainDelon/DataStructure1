package com.wx.datastructure;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] agrs)
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("9");
       list.add(0,"0");
       list.add(1,"1");
       list.add(1,"2");
       for(String str:list)
       {
           System.out.print(str);
       }
        System.out.print(list.size());
    }
}
