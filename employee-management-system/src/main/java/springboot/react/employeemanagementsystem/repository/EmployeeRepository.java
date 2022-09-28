package springboot.react.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.react.employeemanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
