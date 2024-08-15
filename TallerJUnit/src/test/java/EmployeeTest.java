/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ec.edu.espol.tallerjunit.Employee;
import ec.edu.espol.tallerjunit.EmployeeType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author angelozurita
 */
public class EmployeeTest {
    private Employee employeeEuroManager;
    private Employee employeeEuroSupervisor;
    private Employee employeeEuroWorker;
    private Employee employeeUSDManager;
    private Employee employeeUSDSupervisor;
    private Employee employeeUSDWorker;
    private int month;

    @BeforeEach
    public void setEmployees() {
        employeeEuroManager = new Employee(3000.0F, "EUR", 0.5F, EmployeeType.Manager);
        employeeEuroSupervisor = new Employee(2500.0F, "EUR", 0.25F, EmployeeType.Supervisor);
        employeeEuroWorker = new Employee(600.0F, "EUR", 0.1F, EmployeeType.Worker);
        employeeUSDManager = new Employee(4550.0F, "USD", 0.6F, EmployeeType.Manager);
        employeeUSDSupervisor = new Employee(2750.0F, "USD", 0.3F, EmployeeType.Supervisor);
        employeeUSDWorker = new Employee(500.0F, "USD", 0.15F, EmployeeType.Worker);
    }

    @BeforeEach
    public void setupMonth() {
        Date date = new Date();
        LocalDate localDate;
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        month = localDate.getMonthValue();
    }

    @Test
    public void CalculateYearBonusEuroManager() {
        float expectedBonus = 3236.0F;
        assertEquals(expectedBonus, employeeEuroManager.CalculateYearBonus());
    }

    @Test
    public void CalculateYearBonusEuroSupervisor() {
        float expectedBonus = 2568.0f;
        assertEquals(expectedBonus, employeeEuroSupervisor.CalculateYearBonus());
    }

    @Test
    public void CalculateYearBonusWorker() {
        assertEquals(386.0f, employeeEuroWorker.CalculateYearBonus());
        assertEquals(386.0f, employeeUSDWorker.CalculateYearBonus());
    }

    @Test
    public void CalculateSalaryEuroManager() {
        float actualCs = month % 2 == 0 ? 2850.35f : 2914.68333333333f;
        assertEquals(employeeEuroManager.cs(), actualCs);
    }

    @Test
    public void CalculateSalaryEuroSupervisor() {
        float actualCs = month % 2 == 0 ? 2375.0875f : 2439.420833f;
        assertEquals(employeeEuroSupervisor.cs(), actualCs);
    }

    @Test
    public void CalculateSalaryEuroWorker() {
        float actualCs = month % 2 == 0 ? 570.0f : 634.333333333333f;
        assertEquals(employeeEuroWorker.cs(), actualCs);
    }

    @Test
    public void CalculateSalaryUSDManager() {
        float actualCs = month % 2 == 0 ? 4550.42f : 4614.75333333333f;
        assertEquals(employeeUSDManager.cs(), actualCs);
    }

    @Test
    public void CalculateSalaryUSDSupervisor() {
        float actualCs = month % 2 == 0 ? 2750.105f : 2814.4383333333333f;
        assertEquals(employeeUSDSupervisor.cs(), actualCs);
    }

    @Test
    public void CalculateSalaryUSDWorker() {
        float actualCs = month % 2 == 0 ? 500.0f : 564.3333333333333f;
        assertEquals(employeeUSDWorker.cs(), actualCs);
    }


}

