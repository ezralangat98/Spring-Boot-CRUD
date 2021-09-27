package com.tracom.projectdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("FROM Employee e WHERE e.emp_id = ?1")
            Employee findByEmp_id(Long emp_id);
    @Query("FROM Employee e WHERE e.first_name = ?1")
    Employee findByFirst_name(String first_name);
}
