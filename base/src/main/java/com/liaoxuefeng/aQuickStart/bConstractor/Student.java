package com.liaoxuefeng.aQuickStart.bConstractor;

/**
 * @Auther: 李将
 * @Date: 2020/5/27 17:34
 * @Descprition:
 */
public class Student extends Person {

    protected int score;


    public Student() {

    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age='" + age + '\'' +
                ", score=" + score +
                '}';
    }
}