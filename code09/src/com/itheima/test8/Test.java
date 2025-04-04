package com.itheima.test8;

public class Test {
    public static void main(String[] args) {
        //1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];

        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        //3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;



        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(4, "wangwu", 26);

        //唯一性判断
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //已存在 --- 不用添加
            System.out.println("当前id重复，请修改id后再进行添加");
        } else {
            //不存在 --- 就可以把学生对象添加进数组
            //把stu4添加到数组当中
            //1.数组已经存满 --- 只能创建一个新的数组，新数组的长度 = 老数组+1
            //2.数组没有存满 --- 直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                //已经存满
                //创建一个新的数组，长度 = 老数组的长度 + 1
                //然后把老数组的元素，拷贝到新数组当中
                Student[] newArr = creatNewArr(arr);
                //[stu1,stu2,stu3]
                //[stu1,stu2,stu3,null]
                //把stu4添加进去
                newArr[count] = stu4;
                //要求2：添加完毕之后，遍历所有学生信息
                printArr(newArr);

            } else {
                //没有存满
                arr[count] = stu4;
                printArr(arr);
            }

        }
        /*要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败
         */

/*        //要找到id在数组中的索引
        int index = getIndex(arr, 2);
        if(index >= 0){
            //如果存在，则删除
            arr[index] = null;

        }else{
            //如果不存在，则提示删除失败
            System.out.println("当前id不存在，删除失败");
        }
        printArr(arr);*/

        //4.先要找到id为2的学生对应索引
        int index = getIndex(arr, 2);

        //5.判断索引
        if(index >= 0){
            Student stu = arr[index];
            int newAge = stu.getAge();
            stu.setAge(newAge);
        }else{
            System.out.println("当前id不存在，修改失败");
        }




    }


    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }
            }
        }return -1;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                Student stu = arr[i];
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }


    //创建一个新的数组，长度 = 老数组的长度 + 1
    //然后把老数组的元素，拷贝到新数组当中
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }


    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;

    }


    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组里面的每一个学生对象
            Student stu = arr[i];
            if (stu != null) {
                //获取数组中学生对象的id
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                } else {

                }
            }
        }
        return false;
    }
}
