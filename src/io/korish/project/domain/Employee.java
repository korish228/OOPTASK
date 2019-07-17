package io.korish.project.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public abstract class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private int experience;
    private double basicSalary;
    private List<Manager> higherManager;

    private Employee() {
        this.higherManager = new ArrayList<>();
        this.id = UUID.randomUUID().toString();
    }


    public Employee(String firstName, String lastName, int experience, double basicSalary) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.generateBasicSallary(basicSalary);
    }

//    generate basic sallary

    public void generateBasicSallary(double basicSalary){
//        System.out.println("callls");
        if (this.experience > 2){
            this.basicSalary = basicSalary + 200;
//            System.out.println("more than 2 years + 200$ "  + this.basicSalary);
            return;
        }

        if (this.experience > 5){
            this.basicSalary = 500 + (basicSalary *1.2);
//            System.out.println("more than 5 years  + 500$ and 1.2 of basic sallary "  + this.basicSalary);
            return;
        }
        else{
            this.basicSalary = basicSalary;
//            System.out.println("less than 2 years only salary without bonuses" + this.basicSalary);
            return;
        }
    }

//  Getters and Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setBasicSalary(double basicSalary) {
        this.generateBasicSallary(basicSalary);
    }

    public void setHigherManager(List<Manager> higherManager) {
        this.higherManager = higherManager;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getExperience() {
        return experience;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public List<Manager> getHigherManager() {
        return higherManager;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", experience=" + experience +
                ", basicSalary=" + basicSalary +
                ", higherManager=" + higherManager;
    }
}
