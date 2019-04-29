package com.almundo.backendtest.factory;

import com.almundo.backendtest.domain.Employee;
import com.almundo.backendtest.domain.EmployeeType;
import org.springframework.stereotype.Component;

/**
 * @author fabio_mora
 */
@Component
public class EmployeeFactory {
    public Employee createEmployee(int id, EmployeeType type) {
        return new Employee(id, type);
    }
}
