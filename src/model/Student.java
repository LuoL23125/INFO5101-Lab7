/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



public class Student {
    
    private int id;
    private String name;
    private int age;
    private String college;
    private String phone;
    private String continent;
    private String experience;
    
    public Student(){}

    public Student(String name, int age, String college, String phone, String continent, String experience) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.phone = phone;
        this.continent = continent;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    



    @Override
    public String toString() {
        return "Student_INFO: \n"
                + "  Name = " + name + "\n"
                + "  Age = " + age + "\n"
                + "  College = " + college + "\n"
                + "  Phone Number = " + phone + "\n"
                + "  Continent = " + continent + "\n"
                + "  experience = " + experience + "\n";
    }
    
   

}
