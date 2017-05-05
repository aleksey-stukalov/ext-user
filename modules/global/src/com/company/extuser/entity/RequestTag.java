package com.company.extuser.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "EXTUSER_REQUEST_TAG")
@Entity(name = "extuser$RequestTag")
public class RequestTag extends StandardEntity {
    private static final long serialVersionUID = -4542586409658337171L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}