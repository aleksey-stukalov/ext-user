package com.company.extuser.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "EXTUSER_REQUEST")
@Entity(name = "extuser$Request")
public class Request extends StandardEntity {
    private static final long serialVersionUID = -5643113865449636647L;

    @Lob
    @Column(name = "TEXT", nullable = false)
    protected String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    protected ExtUser user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    protected Department department;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setUser(ExtUser user) {
        this.user = user;
    }

    public ExtUser getUser() {
        return user;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }


}