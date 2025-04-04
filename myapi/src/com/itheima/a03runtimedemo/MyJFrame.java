package com.itheima.a03runtimedemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame implements ActionListener {


    JButton yesBut = new JButton("帅爆了");
    JButton midBut = new JButton("一般般");
    JButton noBut = new JButton("太磕碜了");

    public MyJFrame(){
        initJFrame();

        initView();


        this.setVisible(true);

    }

    private void initView() {

        this.getContentPane().removeAll();


        JLabel text = new JLabel("你觉得自己帅吗？");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);

        yesBut.setBounds(200,250,100,30);
        midBut.setBounds(200,325,100,30);
        noBut.setBounds(160,400,100,30);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);

        this.getContentPane().repaint();

    }


    private void initJFrame() {
        //设置宽高
        this.setSize(500,600);
        //设置标题
        this.setTitle("你说得对");
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置置顶
        this.setAlwaysOnTop(true);
        //取消默认的居中放置
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void showJDialog(String content){
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200,150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //弹框不关闭无法操作下面的界面
        jDialog.setModal(true);

        //创建JLabel对象管理文字并添加到弹框中
        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }
}
