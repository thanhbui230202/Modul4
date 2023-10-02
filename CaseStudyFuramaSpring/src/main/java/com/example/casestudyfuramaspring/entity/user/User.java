package com.example.casestudyfuramaspring.entity.user;

import com.example.casestudyfuramaspring.entity.employee.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(columnDefinition = "varchar(255)")
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<UserRole> userRoles;

    @OneToMany(mappedBy = "user")
    private List<Employee> employees;

    public User() {
    }

    public User(String username, String password, List<UserRole> userRoles, List<Employee> employees) {
        this.username = username;
        this.password = password;
        this.userRoles = userRoles;
        this.employees = employees;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
