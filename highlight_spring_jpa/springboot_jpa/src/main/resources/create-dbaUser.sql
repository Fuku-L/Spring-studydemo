-- 本 sql 脚本用户创建 boot 用户，并给用户授权。
-- 创建 sys(系统管理员，最高权限) system(本地管理员，次高权限)，scott(普通用户)

-- 登录
-- sqlplus / as sysdba; // 登录到 sys
-- sqlplus sys as sysdba; //登录到sys
-- sqlplus scott/tiger; //登录到普通用户scott

-- 管理用户
create user boot identified by boot; -- 在管理员账户下，创建用户 boot
alter user boot identified by boot; -- 修改密码

-- 给新建用户授权
-- 查看当前用户权限
select * from USER_SYS_PRIVS;

--
grant resource,dba to boot;
-- 授权
grant connect to boot;
grant Resource to boot;
grant GLOBAL QUERY REWRITE to boot;
grant CREATE TABLE to boot;
grant UNLIMITED TABLESPACE to boot;
grant select any table to boot;

