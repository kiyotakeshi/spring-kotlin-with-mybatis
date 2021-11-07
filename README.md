```sql
USE `kotlin-sample`;

CREATE TABLE user
(
id      int(10)     NOT NULL,
name    varchar(16) NOT NULL,
age     int(10)     NOT NULL,
profile varchar(64) NOT NULL,
primary key (id)
) ENGINE = InnoDB
DEFAULT CHARSET = utf8;

show tables;

INSERT INTO `kotlin-sample`.user (id, name, age, profile) VALUES (1, 'mike', 22, 'hello');

select * from user;
```
