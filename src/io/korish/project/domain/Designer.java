package io.korish.project.domain;

public class Designer extends Employee {

    private double coeficient;

    public Designer(String firstName, String lastName, int experience, double basicSalary,double coeficient ) {
        super(firstName, lastName, experience, basicSalary);
        this.coeficient = coeficient;
    }

    public double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(double coeficient) {
        this.coeficient = coeficient;
    }

    @Override
    public String toString() {
        return "Designer{" + "coeficient=" + coeficient + super.toString()+ '}' ;
    }
}
