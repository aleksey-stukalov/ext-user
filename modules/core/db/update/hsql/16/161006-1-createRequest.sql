create table EXTUSER_REQUEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TEXT longvarchar not null,
    USER_ID varchar(36) not null,
    DEPARTMENT_ID varchar(36),
    --
    primary key (ID)
);
