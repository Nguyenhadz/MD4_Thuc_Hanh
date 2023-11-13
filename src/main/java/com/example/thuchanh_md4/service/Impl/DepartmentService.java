package com.example.thuchanh_md4.service.Impl;

import com.example.thuchanh_md4.model.Department;
import com.example.thuchanh_md4.repository.IDepartmentRepository;
import com.example.thuchanh_md4.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    IDepartmentRepository iDepartmentRepository;
    @Override
    public Iterable<Department> findAll() {
        return iDepartmentRepository.findAll();
    }

    @Override
    public Optional<Department> findById(Long id) {
        return iDepartmentRepository.findById(id);
    }

    @Override
    public Department save(Department department) {
        return iDepartmentRepository.save(department);
    }

    @Override
    public void delete(Long id) {
        iDepartmentRepository.deleteById(id);
    }
}
