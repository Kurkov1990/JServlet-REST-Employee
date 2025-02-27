package com.homework.repository.employee;


import com.homework.dto.employee.EmployeeDtoRequest;
import com.homework.entity.Employee;
import com.homework.repository.BaseRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends BaseRepository<Employee, EmployeeDtoRequest> {
    void save(EmployeeDtoRequest request);

    Optional<List<Employee>> getAll();

    Optional<Employee> getById(Long id);

    void update(Long id, Employee request);

    boolean deleteById(Long id);

    Optional<Employee> getLastEntity();

}
