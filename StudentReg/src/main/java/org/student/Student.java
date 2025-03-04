package org.student;

public class Student {
private String name;
private String fieldOfStudy;
private String birthDay;
private String course;
private String gender;

    public Student(String name, String fieldOfStudy, String birthDay, String course, String gender) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.birthDay = birthDay;
        this.course = course;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

