package com.example.casestudyfuramaspring.entity.user;

import javax.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    public UserRole() {
    }

    public UserRole(int id, Role role, User user) {
        this.id = id;
        this.role = role;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
