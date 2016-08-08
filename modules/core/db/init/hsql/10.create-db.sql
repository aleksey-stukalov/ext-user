-- begin EXTUSER_DEPARTMENT
create table EXTUSER_DEPARTMENT (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TELEPHONE varchar(255),
    ROOM_NUMBER varchar(255),
    --
    primary key (ID)
)^
-- end EXTUSER_DEPARTMENT
-- begin SEC_USER
alter table SEC_USER add column ADDRESS varchar(255) ^
alter table SEC_USER add column DEPARTMENT_ID varchar(36) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'extuser$ExtUser' where DTYPE is null ^
-- end SEC_USER
