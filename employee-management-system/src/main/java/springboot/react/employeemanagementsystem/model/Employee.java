package springboot.react.employeemanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Model class for employee
 */
@Entity
@Table(name = "employee")
public class Employee {

	//Employee Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;
    //First name
    @Column(name = "first_name" , nullable = false)
    private String firstName;
    //Last name
    @Column(name = "last_name" , nullable = false)
    private String lastName;
    //Department
    @Column(name = "department" , nullable = false)
    private String department;
    //Job level
    @Column(name = "job_level" , nullable = false)
    private String jobLevel;
    //Email
    @Column(name = "email" , nullable = false)
    private String email;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String department, String jobLevel, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.jobLevel = jobLevel;
        this.email = email;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
