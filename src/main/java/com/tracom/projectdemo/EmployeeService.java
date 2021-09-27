package com.tracom.projectdemo;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService {
    private EmployeeRepository eRepo;
    //CREATE
    public void saveEmployee(Employee employee){
        eRepo.save(employee);
    }

    //RETRIEVE
    public List<Employee> listEmp(){
        return eRepo.findAll();
    }
    //DELETE
    public void deleteEmp(long emp_id){
        eRepo.deleteById(emp_id);
    }

    //UPDATE
    public Employee updateEmp(long emp_id){
        return eRepo.findById(emp_id).get();
    }

}
