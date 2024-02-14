package com.wrtecnologia.ems.service.impl;

import com.wrtecnologia.ems.dto.EmployeeDto;
import com.wrtecnologia.ems.entity.Employee;
import com.wrtecnologia.ems.mapper.EmployeeMapper;
import com.wrtecnologia.ems.repository.EmployeeRepository;
import com.wrtecnologia.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
