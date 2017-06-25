# ext-user

This example shows how to extend system CUBA entities, taking _User_ entity as an example.


### Extending System Entity

[__ExtUser__](modules/global/src/com/company/extuser/entity/ExtUser.java) entity extends and replaces __User__ entity by adding two fields:

- __address__ of type String
- [__department__](modules/global/src/com/company/extuser/entity/Department.java), which is associated to the Department entity, declared in the project 

### Extending System View

In order to reflect changes in the __User Editor__ screen we need to create [a new view](modules/global/src/views.xml), which extends the system _user.edit_ view. In order to override the old system view, the extending view has the same name as its ancestor.

### Extending System Sreen

In order to show fields we extend the standard [_User Screen_](modules/web/src/com/company/extuser/web/useredit/ext-user-edit.xml), coming with the CUBA Platform, and register it in the [web-screens.xml](modules/web/src/web-screens.xml) file.

### Using Extended Attributes

The sample aslo shows how the extended User entity can be used. In the [Request Edit](https://github.com/aleksey-stukalov/ext-user/blob/master/modules/web/src/com/company/extuser/web/request/RequestEdit.java) screen there are two fields, that should be populated by default (```Request#user``` and ```Request#department```) from the currently logged-in user.

__All the steps can be completed fast and easy, using the power of the CUBA Studio, which will scaffold classes, views and screens for you.__

P.S. Find another way of extending the system user entity in [this sample](https://github.com/aleksey-stukalov/session-attributes).
