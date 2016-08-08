package com.company.extuser.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import com.haulmont.cuba.security.entity.User;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.annotation.Extends;

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