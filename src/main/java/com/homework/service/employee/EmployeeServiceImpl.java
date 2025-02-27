package com.homework.service.employee;

import com.homework.dto.employee.EmployeeDtoRequest;
import com.homework.entity.Employee;
import com.homework.repository.employee.EmployeeRepository;
import com.homework.repository.employee.EmployeeRepositoryImpl;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Override
    public Employee create(EmployeeDtoRequest request) {
        Objects.requireNonNull(request,
                "Parameter [request] must not be null!");
        repository = new EmployeeRepositoryImpl();
        repository.save(request);
        return repository.getLastEntity()
                .orElse(null);
    }

    @Override
    public List<Employee> getAll() {
        repository = new EmployeeRepositoryImpl();
        return repository.getAll()
                .orElse(Collections.emptyList());
    }

    @Override
    public Employee getById(Long id) {
        Objects.requireNonNull(id,
                "Parameter [id] must not be null!");
        repository = new EmployeeRepositoryImpl();
        return repository.getById(id).orElse(null);
    }

    @Override
    public Employee update(Long id, EmployeeDtoRequest request) {
        Objects.requireNonNull(request,
                "Parameter [request] must not be null!");
        repository = new EmployeeRepositoryImpl();
        if (id == null) {
            throw new IllegalArgumentException("Id must be provided!");
        }
        if (repository.getById(id).isPresent()) {
            repository.update(id, request);
        }
        return repository.getById(id).orElse(null);
    }

    @Override
    public boolean deleteById(Long id) {
        Objects.requireNonNull(id,
                "Parameter [id] must not be null!");
        repository = new EmployeeRepositoryImpl();
        if (repository.getById(id).isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}