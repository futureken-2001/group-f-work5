package org.student;

public class Student {
    private String name;
    private String birthDay;
    private int age;
    private String fieldOfStudy;
    private String course;
    private String Gender;

    public Student(String name, String birthDay, int age, String fieldOfStudy, String course, String gender) {
        this.name = name;
        this.birthDay = birthDay;
        this.age = age;
        this.fieldOfStudy = fieldOfStudy;
        this.course = course;
        Gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}

