package com.example.demo.employee;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )

    private Long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dob;
    private Integer age;
    private Integer experience;

    public Employee() {
    }

    public Employee(Long id,
                    String name,
                    String surname,
                    String email,
                    LocalDate dob,
                    Integer age,
                    Integer experience) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.experience = experience;
    }

    public Employee(String name,
                    String surname,
                    String email,
                    LocalDate dob,
                    Integer age,
                    Integer experience) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
