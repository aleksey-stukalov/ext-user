create table EXTUSER_REQUEST_REQUEST_TAG_LINK (
    REQUEST_ID varchar(36) not null,
    REQUEST_TAG_ID varchar(36) not null,
    primary key (REQUEST_ID, REQUEST_TAG_ID)
);
