package com.itheima.Test;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("采购专员正在购买新的设备");
    }
}
