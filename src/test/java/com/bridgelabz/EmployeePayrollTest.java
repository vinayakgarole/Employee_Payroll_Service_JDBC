package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class EmployeePayrollTest {

    @Test
    /*
     * TestCase to check number of employees in the sql table by using readEmployeePayrollData method
     * and save number of employee in arrayList of employeePayrollData type
     */
    public void givenEmpPayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        EmployeePayroll employeePayroll = new EmployeePayroll();
        List<EmployeePayrollData> employeePayrollData = employeePayroll.readEmployeePayrollData();
        Assertions.assertEquals(4, employeePayrollData.size());
    }

    /*
     * TestCase to check salary of employee is updated in the sql table by using readEmployeePayrollData method
     * and save number of employee in arrayList of employeePayrollData type
     */
    @Test
    public void givenNewSalaryForEmployee_WhenUpdated_ShouldSyncWithDb() {

        EmployeePayroll employeePayroll = new EmployeePayroll();
        /*
         * Saving the updated salary into the result arrayList and the read data of the employeePayroll in
         * expectedEmployeePayrollData
         */
        List<EmployeePayrollData> ExpectedEmployeePayroll = employeePayroll.readEmployeePayrollData();
        List<EmployeePayrollData> result = employeePayroll.updateBasic_pay("Tersia", 3000000.00);
        Assertions.assertEquals(ExpectedEmployeePayroll, result);
    }
}