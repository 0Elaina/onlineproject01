package com.itheima.com.a05myset;

public class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        double thisAllGrade = this.getChineseGrade() + this.getEnglishGrade() + this.getMathGrade();
        double oAllGrade = o.getChineseGrade() + o.getEnglishGrade() + o.getMathGrade();
        double result = thisAllGrade - oAllGrade;
        result = result == 0 ? this.getChineseGrade() - o.getChineseGrade() : result;
        result = result == 0 ? this.getMathGrade() - o.getMathGrade() : result;
        result = result == 0 ? this.getEnglishGrade() - o.getEnglishGrade() : result;
        result = result == 0 ? this.getAge() - o.getAge() : result;
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;

        if(result > 0){
            return 1;
        }else if(result < 0){
            return -1;
        }else{
            return 0;
        }
    }

    private String name;
    private int age;
    private double chineseGrade;
    private double mathGrade;
    private double englishGrade;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double chineseGrade, double mathGrade, double englishGrade) {
        this.name = name;
        this.age = age;
        this.chineseGrade = chineseGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public double getChineseGrade(){
        return chineseGrade;
    }

    public double getMathGrade(){
        return mathGrade;
    }

    public double getEnglishGrade(){
        return englishGrade;
    }

    public void setChineseGrade(double chineseGrade){
        this.chineseGrade = chineseGrade;
    }

    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chineseGrade = " + chineseGrade + ", mathGrade = " + mathGrade + ", englishGrade = " + englishGrade + "}";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        return 0;
    }
}
