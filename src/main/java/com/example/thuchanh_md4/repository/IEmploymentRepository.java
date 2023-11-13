package com.example.thuchanh_md4.repository;

import com.example.thuchanh_md4.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmploymentRepository extends JpaRepository<Employee, Long> {
    Iterable<Employee> findAllByDepartmentId(Long id);

    @Query(value = "select * from employee order by age DESC", nativeQuery = true)
    Iterable<Employee> sortIncreasing();

    @Query(value = "select * from employee order by age ASC", nativeQuery = true)
    Iterable<Employee> sortDecreasing();
}
