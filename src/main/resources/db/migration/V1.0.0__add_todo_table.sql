CREATE TABLE IF NOT EXISTS user
(
    id      int(10)     NOT NULL,
    name    varchar(16) NOT NULL,
    age     int(10)     NOT NULL,
    profile varchar(64) NOT NULL,
    primary key (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- show tables;