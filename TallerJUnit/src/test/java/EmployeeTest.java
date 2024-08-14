/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ec.edu.espol.tallerjunit.Employee;
import ec.edu.espol.tallerjunit.EmployeeType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author angelozurita
 */
public class EmployeeTest {
    private Employee employeeEuroManager;
    private Employee employeeEuroSupervisor;
    private Employee employeeUSDWorker1;
    private Employee employeeUSDWorker2;
    private Employee employeeUSDWorker3;
     
    @BeforeEach
    public void setUp() {
        employeeEuroManager = new Employee(3000.0F, "EUR", 0.5F, EmployeeType.Manager);
        employeeEuroSupervisor = new Employee(2500.0F, "EUR", 0.25F, EmployeeType.Supervisor);
        employeeUSDWorker1 = new Employee(600.0F, "USD", 0.1F, EmployeeType.Worker);
        employeeUSDWorker2 = new Employee(550.0F, "USD", 0.1F, EmployeeType.Worker);
        employeeUSDWorker3 = new Employee(500.0F, "USD", 0.1F, EmployeeType.Worker);
    }
    
    @Test
    public void CalculateYearBonusEuroManager() {
        float expectedBonus = 3236.0F;
        assertEquals(expectedBonus, employeeEuroManager.CalculateYearBonus());
    }
}

