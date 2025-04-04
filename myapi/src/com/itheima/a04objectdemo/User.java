package com.itheima.a04objectdemo;

import java.util.StringJoiner;

//Cloneable
//如果一个接口里没有抽象方法
//表示当前的接口是一个标记性接口
//现在cloneable表示一旦实现，那么当前类的对象就可以被克隆
//否则不能克隆
public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User(){}

    public User(String username, String password, String path,int[] data) {
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return "角色编号" + id + ",用户名" + username + ",密码" + password + ",游戏图片" + path + ",进度：" + arrToString();
    }


    public String arrToString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于Java帮我们克隆一个对象，并把克隆之后的对象返回

        int[] newData = new int[data.length];
        for (int i = 0; i < newData.length; i++) {
            newData[i] = data[i];
        }

        User u = (User)super.clone();
        //因为父类中的克隆方法是浅克隆，替换克隆出来对象中的数组地址值
        u.data = newData;

        return u;
    }
}
