package com.homework.service.employee;


import com.homework.dto.employee.EmployeeDtoRequest;
import com.homework.entity.Employee;
import com.homework.service.BaseService;

import java.util.List;

public interface EmployeeService extends BaseService<Employee, EmployeeDtoRequest> {
    Employee create(EmployeeDtoRequest request);

    List<Employee> getAll();

    Employee getById(Long id);

    Employee update(Long id, EmployeeDtoRequest request);

    boolean deleteById(Long id);
}
