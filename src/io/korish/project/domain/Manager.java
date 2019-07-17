package io.korish.project.domain;

import io.korish.project.service.Countable;
import io.korish.project.service.CountableImpl;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private List<Developer> developersTeam;
    private List<Designer> designersTeam;


    public Manager(String firstName, String lastName, int experience, double basicSalary) {
        super(firstName, lastName, experience, basicSalary);
        designersTeam = new ArrayList<>();
        developersTeam = new ArrayList<>();
    }

    public void addDeveloper(Developer developer){
        this.developersTeam.add(developer);
    }

    public void addDesigner(Designer designer){
        this.designersTeam.add(designer);
    }

    public List<Developer> getDevelopersTeam() {
        return developersTeam;
    }

    public void setDevelopersTeam(List<Developer> developersTeam) {
        this.developersTeam = developersTeam;
    }

    public List<Designer> getDesignersTeam() {
        return designersTeam;
    }

    public void setDesignersTeam(List<Designer> designersTeam) {
        this.designersTeam = designersTeam;
    }

    @Override
    public String toString() {
        return "Manager{ sallary after bonuses" + new CountableImpl().countSalary(this)
                +
                super.toString() +
                "developersTeam=" + developersTeam +
                ", designersTeam=" + designersTeam +
                '}';
    }
}
