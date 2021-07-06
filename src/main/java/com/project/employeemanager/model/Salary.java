package com.project.employeemanager.model;

public class Salary {

    private Long id;
    private Double netSalary;
    private Double grossSalary;
    private Double healthInsuranceCost;
    private Double pensionContributionCost;
    private Double sicknessContributionCost;
    private Employee employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getHealthInsuranceCost() {
        return healthInsuranceCost;
    }

    public void setHealthInsuranceCost(Double healthInsuranceCost) {
        this.healthInsuranceCost = healthInsuranceCost;
    }

    public Double getPensionContributionCost() {
        return pensionContributionCost;
    }

    public void setPensionContributionCost(Double pensionContributionCost) {
        this.pensionContributionCost = pensionContributionCost;
    }

    public Double getSicknessContributionCost() {
        return sicknessContributionCost;
    }

    public void setSicknessContributionCost(Double sicknessContributionCost) {
        this.sicknessContributionCost = sicknessContributionCost;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
