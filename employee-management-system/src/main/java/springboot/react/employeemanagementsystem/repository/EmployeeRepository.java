package springboot.react.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.react.employeemanagementsystem.model.Employee;

/*
 * Repository class for Employee repository extending JpaRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
