package io.korish.project.model;

import io.korish.project.domain.Employee;
import io.korish.project.domain.Manager;
import io.korish.project.service.Countable;
import io.korish.project.service.CountableImpl;

import java.util.List;

public class Department {

    private Countable countable;
    private String depName;
    private List<Manager> managers;

    public List<Manager> managerList(){
        return managers;
    }

    public Department(Countable countable, String depName) {
        this.countable = countable;
        this.depName = depName;
    }

    public double giveSallary(Employee employee){
       return this.countable.countSalary(employee);
    }

    public Countable getCountable() {
        return countable;
    }

    public void setCountable(Countable countable) {
        this.countable = countable;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
}
