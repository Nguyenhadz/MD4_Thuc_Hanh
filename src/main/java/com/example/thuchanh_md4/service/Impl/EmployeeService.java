package com.example.thuchanh_md4.service.Impl;

import com.example.thuchanh_md4.model.Employee;
import com.example.thuchanh_md4.repository.IEmploymentRepository;
import com.example.thuchanh_md4.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmploymentRepository iEmploymentRepository;

    @Override
    public Iterable<Employee> findAll() {
        return iEmploymentRepository.findAll();
    }
    public Iterable<Employee> findAllByDepartment(Long id) {
        return iEmploymentRepository.findAllByDepartmentId(id);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return iEmploymentRepository.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return iEmploymentRepository.save(employee);
    }

    @Override
    public void delete(Long id) {
        iEmploymentRepository.deleteById(id);
    }
    public Iterable<Employee> sortI() {
        return iEmploymentRepository.sortIncreasing();
    }
    public Iterable<Employee> sortD() {
        return iEmploymentRepository.sortDecreasing();
    }
}
