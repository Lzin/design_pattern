package com.liz.GOF23.composite;

//组合模式测试
public class Client {
    public static void main(String[] args) {
        //从大到小进行对象的创建
        OrganizationComponent university = new University("江西农业大学", "我的大学");
        //创建学校
        OrganizationComponent college = new College("软件学院", "我的学院");
        //创建学院1
        OrganizationComponent college2 = new College("经管学院", "隔壁学院");

        //学院加专业(添加下一层 并管理)
        college.add(new Department("物联网工程", "我的专业"));
        college.add(new Department("软件工程", "其他专业"));
        college2.add(new Department("农林经济管理", "其他专业1"));
        college2.add(new Department("市场营销", "其他专业2"));

        //学校加学院(添加下一层 并管理)
        university.add(college);
        university.add(college2);

        //打印
        university.print();
    }
}
