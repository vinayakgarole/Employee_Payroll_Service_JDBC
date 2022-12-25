package com.bridgelabz;

import java.time.LocalDate;

/*
 * Making a class of EmployeePayrollData So we can add id,name,basic_pay items in a arrayList using constructor of
 * EmployeePayrollData
 */
public class EmployeePayrollData {

    public int id;
    public String name;
    public double basic_pay;
    public LocalDate start;

    public EmployeePayrollData(int id, String name, double basic_pay, LocalDate start) {
        this.id = id;
        this.name = name;
        this.basic_pay = basic_pay;
        this.start = start;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basic_pay=" + basic_pay +
                ", start=" + start +
                '}';
    }
}