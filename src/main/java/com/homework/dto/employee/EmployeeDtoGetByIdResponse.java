package com.homework.dto.employee;

import com.homework.entity.Employee;
import jakarta.servlet.http.HttpServletResponse;

public record EmployeeDtoGetByIdResponse(
        int statusCode,
        boolean success,
        String message,
        Employee employee) {

    public static final String SUCCESS_MESSAGE = "Employee with id %s has been fetched successfully.";
    public static final String FAILURE_MESSAGE = "Employee with id %s has not been found!";

    public static EmployeeDtoGetByIdResponse of(Long id, boolean isEmployeeFound, Employee employee) {
        if (isEmployeeFound)
            return new EmployeeDtoGetByIdResponse(
                    HttpServletResponse.SC_OK,
                    true, SUCCESS_MESSAGE.formatted(id), employee);
        else
            return new EmployeeDtoGetByIdResponse(
                    HttpServletResponse.SC_NOT_FOUND,
                    false, FAILURE_MESSAGE.formatted(id), null);
    }
}
