package io.korish.project.domain;

public class Developer extends Employee {

    public Developer(String firstName, String lastName, int experience, double basicSalary) {
        super(firstName, lastName, experience, basicSalary);
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString() +"}";
    }
}
