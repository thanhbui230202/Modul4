package com.example.casestudyfuramaspring.entity.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    private int role_id;
    private String role_name;
    @OneToMany(mappedBy = "role")
    private List<UserRole> userRole;

    public Role() {
    }

    public Role(int role_id, String role_name, List<UserRole> userRole) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.userRole = userRole;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public List<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(List<UserRole> userRole) {
        this.userRole = userRole;
    }
}
