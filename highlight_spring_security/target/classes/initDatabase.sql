-- 通过设置 spring.hibernate.ddl-auto=update 在启动的时候会自动生成用户表：sys_user 角色表：sys_role 关联表：sys_user_roles

-- 为这些表初始化一些数据，用于测试
insert into sys_user (id, username, password) values (1, 'admin', 'admin');
insert into sys_user (id, username, password) values (2, 'lifz', 'lifz');

insert into sys_role (id,name) values (1, 'ROLE_ADMIN');
insert into sys_role (id,name) values (2, 'ROLE_USER');

insert into sys_user_roles(sys_user_id, roles_id) values (1,1);
insert into sys_user_roles(sys_user_id, roles_id) values (2,2);