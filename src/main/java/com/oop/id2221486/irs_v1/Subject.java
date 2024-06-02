package com.oop.id2221486.irs_v1;

public class Subject {
    String code,name, roomNumver,time;
    int sec;

    @Override
    public String toString() {
        return "Sub " +
                "code=" + code + '\'' +
                ", name='" + name + '\'' +
                ", roomNu='" + roomNumver + '\'' +
                ", time=" + time + '\'' +
                ", sec=" + sec
                ;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumver() {
        return roomNumver;
    }

    public void setRoomNumver(String roomNumver) {
        this.roomNumver = roomNumver;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public Subject(String code, String name, String roomNumver, String time, int sec) {
        this.code = code;
        this.name = name;
        this.roomNumver = roomNumver;
        this.time = time;
        this.sec = sec;
    }
}
