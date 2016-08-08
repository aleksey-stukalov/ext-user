package com.company.extuser.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "EXTUSER_DEPARTMENT")
@Entity(name = "extuser$Department")
public class Department extends StandardEntity {
    private static final long serialVersionUID = -5001620662844762157L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "TELEPHONE")
    protected String telephone;

    @Column(name = "ROOM_NUMBER")
    protected String roomNumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }


}