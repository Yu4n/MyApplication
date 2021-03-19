package com.example.task7;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private int id=0;
    private String name="";
    private String surname="";
    public Student(Parcel in){
        this.id=in.readInt();
        this.name=in.readString();
        this.surname=in.readString();
    }
    public Student(int id,String name,String surname){
        this.id=id;
        this.name=name;
        this.surname=surname;
    }

    public Student() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(surname);
    }
    public static final Creator<Student> CREATOR=new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            Student student=new Student();
            student.id=source.readInt();
            student.name=source.readString();
            student.surname=source.readString();
            return student;
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[0];
        }
    };

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
