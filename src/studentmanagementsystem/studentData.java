/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.sql.Date;

/**
 *
 * @author pc
 */
public class studentData {
    private Integer studentNum;
    private String year;
    private String course;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birth;
    private String status;
    private String image;
    private Double CC1;
    private Double CC2;
    private Double Moyenne;

    public studentData(Integer studentNum, String year, String course, String firstName, String lastName, String gender, Date birth, String status, String image) {
        this.studentNum = studentNum;
        this.year = year;
        this.course = course;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birth = birth;
        this.status = status;
        this.image = image;
    
    }
     public studentData(Integer studentNum, String year, String course, Double CC1, Double CC2, Double Moyenne) {
        this.studentNum = studentNum;
        this.year = year;
        this.course = course;
        this.CC1 = CC1;
        this.CC2 = CC2;
        this.Moyenne = Moyenne;
    }
      public Integer getStudentNum() {
        return studentNum;
    }
      public String getYear() {
        return year;
    }

     public String getCourse() {
        return course;
    }

     public String getFirstName() {
        return firstName;
    }

     public String getLastName() {
        return lastName;
    }

     public String getGender() {
        return gender;
    }

     public Date getBirth() {
        return birth;
    }

     public String getStatus() {
        return status;
    }

     public String getImage() {
        return image;
    }
     
    public Double getCC1() {
        return CC1;
    }

    public Double getCC2() {
        return CC2;
    }

    public Double getMoyenne() {
        return Moyenne;
    }

     }
