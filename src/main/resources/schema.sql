create schema if not exists netology;

drop table if exists CUSTOMERS;
drop table if exists ORDERS;

create table CUSTOMERS (
    id           int primary key auto_increment,
    name         varchar(255),
    surname      varchar(255),
    age          int check ( age > 0 ),
    phone_number varchar(12)
);

create table ORDERS (
    id           int primary key auto_increment,
    date         timestamp not null default now(),
    customer_id  int,
    product_name varchar(255),
    amount       int,
    foreign key (customer_id) references CUSTOMERS (id)
);