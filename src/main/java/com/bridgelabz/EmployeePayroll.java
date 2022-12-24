package com.bridgelabz;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class EmployeePayroll {

    /*
     * Method to get list of drivers installed for jdbc connections
     */
    public static void driversList() {

        /*
         * An object that implements the Enumeration interface generates a series of elements, one at a time
         * It is taking list of drivers one by one
         */
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        System.out.println("List of drivers installed are");

        /*
         * Using while loop to print list of drivers using statement has more elements which true if and only
         * If this enumeration object contains at least one more element to provide false otherwise.
         */
        while (driverList.hasMoreElements()) {
            Driver driver = (Driver) driverList.nextElement();
            System.out.println(driver.getClass().getName());
        }
    }

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service_new?characterEncoding=utf8";
        String username = "root";
        String password = "root123";
        try {
            System.out.println("Connecting to Database " + jdbcUrl);
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection is Successful " + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driversList();
    }
}