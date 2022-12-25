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
}