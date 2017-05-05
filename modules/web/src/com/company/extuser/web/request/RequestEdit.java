package com.company.extuser.web.request;

import com.company.extuser.entity.ExtUser;
import com.company.extuser.entity.Request;
import com.company.extuser.entity.RequestTag;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.security.entity.User;

import javax.inject.Inject;
import java.util.List;

public class RequestEdit extends AbstractEditor<Request> {

    @Inject
    protected UserSessionSource userSessionSource;

    @Inject
    private DataManager dataManager;

    @Override
    protected void initNewItem(Request item) {
        User user = userSessionSource.getUserSession().getUser();

        LoadContext<ExtUser> loadContext = LoadContext.create(ExtUser.class)
                .setId(user.getId())
                .setView("user.edit");
        ExtUser extUser = dataManager.load(loadContext);

        if (extUser != null) {
            item.setUser(extUser);
            item.setDepartment(extUser.getDepartment());
        }

        super.initNewItem(item);

        LoadContext<RequestTag> tagLoadContext =  LoadContext.create(RequestTag.class)
                .setQuery(new LoadContext.Query("select e from extuser$RequestTag e"));
        List<RequestTag> tags = dataManager.loadList(tagLoadContext);
        item.setTags(tags);

    }
}