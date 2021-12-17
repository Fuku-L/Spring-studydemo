-- 本 sql 脚本是用户 boot 下的执行建表语句和数据插入语句
-- 建表语句
-- 存储过程：如果存在表，先删除表再创建，如果存在序列，先删除序列。
declare
    num   number;
    tname varchar2(50) :='person';
    seqname varchar2(50) :='hibernate_sequence';
begin
    select count(1) into num from user_tables where table_name = upper(tname) ;
    if num > 0 then
        execute immediate 'drop table '|| tname ;
    end if;
    num := 0;
    select  count(1) into num  from  user_sequences  where  sequence_name= upper(seqname) ;
    if num > 0 then
        execute immediate 'drop sequence '|| seqname ;
    end if;
end;

create table person
(
    id number(19) not null
        constraint PERSON_PK
            primary key,
    name varchar2(10),
    age int,
    address varchar2(50)
);
create sequence hibernate_sequence
    minvalue 0;

-- drop sequence seq_personid;

insert into person(id,name,age,address) values(hibernate_sequence.nextval, 'aa', 10, '合肥');
insert into person(id,name,age,address) values(hibernate_sequence.nextval, 'yy', 11, '北京');
insert into person(id,name,age,address) values(hibernate_sequence.nextval, 'bb', 12, '上海');
insert into person(id,name,age,address) values(hibernate_sequence.nextval, 'cc', 13, '南京');
insert into person(id,name,age,address) values(hibernate_sequence.nextval, 'dd', 14, '武汉');
insert into person(id,name,age,address) values(hibernate_sequence.nextval, 'ee', 15, '广州');
