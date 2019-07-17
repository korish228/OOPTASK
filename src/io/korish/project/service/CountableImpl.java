package io.korish.project.service;

import io.korish.project.domain.Designer;
import io.korish.project.domain.Developer;
import io.korish.project.domain.Employee;
import io.korish.project.domain.Manager;

public class CountableImpl implements Countable {

    @Override
    public double countSalary(Employee employee) {

        if (employee instanceof Designer){
            return employee.getBasicSalary() * ((Designer) employee).getCoeficient();
        }

        if (employee instanceof Developer){

            return employee.getBasicSalary();
        }

        if (employee instanceof Manager) {



            int sizeOfTeams = ((Manager) employee).getDesignersTeam().size() + ((Manager) employee).getDevelopersTeam().size();


            if (sizeOfTeams > 5) {

                    if (checkIsHalfOfDeveloperTeamWithinAllTeams(((Manager) employee).getDevelopersTeam().size(), sizeOfTeams)) {
                        return employee.getBasicSalary() * 1.1 + 200;
                    }

                    return employee.getBasicSalary() + 200;

            }

            if (sizeOfTeams > 10) {

                    if (checkIsHalfOfDeveloperTeamWithinAllTeams(((Manager) employee).getDevelopersTeam().size(), sizeOfTeams)) {
                        return employee.getBasicSalary() * 1.1 + 300;
                    }

                    return employee.getBasicSalary() + 300;

            }

            if (checkIsHalfOfDeveloperTeamWithinAllTeams(((Manager) employee).getDevelopersTeam().size(), sizeOfTeams)) {
                    return employee.getBasicSalary() * 1.1;
            }
        }

        return employee.getBasicSalary();
    }

    private boolean checkIsHalfOfDeveloperTeamWithinAllTeams(int sizeOfDevTeam, int sizeOfAllTeams){
        if (sizeOfDevTeam > sizeOfAllTeams/2){
            return true;
        }
        return false;
    }

}
