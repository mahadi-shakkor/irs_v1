package com.oop.id2221486.irs_v1;

public class Student {
    int id,pass;

    public Student() {
        id=0;
        pass=12345;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", pass=" + pass +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public Student(int id, int pass) {
        this.id = id;
        this.pass = pass;
    }
}
