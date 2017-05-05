package com.company.extuser.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@Table(name = "EXTUSER_REQUEST")
@Entity(name = "extuser$Request")
public class Request extends StandardEntity {
    private static final long serialVersionUID = -5643113865449636647L;

    @Lob
    @Column(name = "TEXT", nullable = false)
    protected String text;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    protected ExtUser user;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    protected Department department;

    @JoinTable(name = "EXTUSER_REQUEST_REQUEST_TAG_LINK",
        joinColumns = @JoinColumn(name = "REQUEST_ID"),
        inverseJoinColumns = @JoinColumn(name = "REQUEST_TAG_ID"))
    @ManyToMany
    @OnDelete(DeletePolicy.CASCADE)
    protected List<RequestTag> tags;

    public void setTags(List<RequestTag> tags) {
        this.tags = tags;
    }

    public List<RequestTag> getTags() {
        return tags;
    }


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