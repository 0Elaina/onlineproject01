package com.itheima.Test;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("维护专员正在进行日常维护");
    }
}
