package io.korish.project;


import io.korish.project.domain.Designer;
import io.korish.project.domain.Developer;
import io.korish.project.domain.Employee;
import io.korish.project.domain.Manager;
import io.korish.project.model.Department;
import io.korish.project.service.CountableImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ex about Countable

        Manager manager = new Manager("Dima", "Korish", 3, 3000);

        Developer developer = new Developer("Dima", "Korish", 1, 2000);
        Developer developer2 = new Developer("Dima", "Korish", 1, 2000);
        Developer developer3 = new Developer("Dima", "Korish", 1, 2000);
        Developer developer4 = new Developer("Dima", "Korish", 1, 2000);
        Developer developer5 = new Developer("Dima", "Korish", 1, 2000);
        Developer developer6 = new Developer("Dima", "Korish", 1, 2000);

        List devTeam = new ArrayList(Arrays.asList(developer,developer2,developer3,developer4,developer5,developer6));

        Designer designer = new Designer("Dima", "Korish", 3, 32323, 1.2);
        Designer designer2 = new Designer("Dima", "Korish", 3, 32323, 1.2);
        Designer designer3 = new Designer("Dima", "Korish", 5, 32323, 1.2);
        Designer designer4 = new Designer("Dima", "Korish", 3, 32323, 1.2);
        Designer designer5 = new Designer("Dima", "Korish", 3, 32323, 1.2);




        List desTeam = new ArrayList(Arrays.asList(designer,designer2,designer3,designer4,designer5));

        manager.setDesignersTeam(desTeam);
        manager.setDevelopersTeam(devTeam);

        System.out.println("basic salary of manager " + manager.getBasicSalary());

        Department department = new Department(new CountableImpl(), "Developers");

        System.out.println("manager salary after bonuses and other payments " + department.giveSallary(manager));


        System.out.println(designer);
        System.out.println(developer);
        System.out.println(manager);


    }
}
