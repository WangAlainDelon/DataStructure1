package com.wx.datastructure.test;

import com.wx.datastructure.baseimp.WxArrList;

public class TestWxList {
    public static void main(String[] agrs)
    {
        WxArrList wxArrList=new WxArrList(2);
        wxArrList.add(9);
        wxArrList.add(0,0);
        wxArrList.add(1,1);
        wxArrList.add(1,2);
        System.out.print("链表的长度："+wxArrList.size());
        System.out.print("  ");
        System.out.print(wxArrList.get(0));
        System.out.print(wxArrList.get(1));
        System.out.print(wxArrList.get(2));
        System.out.print(wxArrList.get(3));







       // System.out.print(wxArrList.get(3));



    }
}
