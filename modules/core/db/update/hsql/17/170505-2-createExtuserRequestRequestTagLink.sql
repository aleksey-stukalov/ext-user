alter table EXTUSER_REQUEST_REQUEST_TAG_LINK add constraint FK_ERRTL_REQUEST foreign key (REQUEST_ID) references EXTUSER_REQUEST(ID);
alter table EXTUSER_REQUEST_REQUEST_TAG_LINK add constraint FK_ERRTL_REQUEST_TAG foreign key (REQUEST_TAG_ID) references EXTUSER_REQUEST_TAG(ID);