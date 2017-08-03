package com.company.extuser.web.useredit;

import com.company.extuser.entity.ExtUser;
import com.haulmont.cuba.gui.app.security.user.edit.UserEditor;

public class ExtUserEditor extends UserEditor {
    public void onBtnCheckClick() {
        ExtUser extUser = (ExtUser) getItem();
        showNotification("Check Extended Fields",
                "Department: " + extUser.getDepartment().getName() + "\n"
                + "Address: " + extUser.getAddress(),
                NotificationType.HUMANIZED);
    }
}
