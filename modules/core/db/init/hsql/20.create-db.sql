-- begin SEC_USER
alter table SEC_USER add constraint FK_SEC_USER_DEPARTMENT_ID foreign key (DEPARTMENT_ID) references EXTUSER_DEPARTMENT(ID)^
create index IDX_SEC_USER_DEPARTMENT on SEC_USER (DEPARTMENT_ID)^
-- end SEC_USER
