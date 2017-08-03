package com.company.extuser.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Extends(User.class)
@Entity(name = "extuser$ExtUser")
public class ExtUser extends User {
    private static final long serialVersionUID = 235925420153411489L;

    @Column(name = "ADDRESS")
    protected String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    protected Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}