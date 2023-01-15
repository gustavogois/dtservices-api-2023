CREATE TABLE `PROCESS`
(
    `process_id`          BIGINT(20) NOT NULL AUTO_INCREMENT,
    `name`     VARCHAR(100)          NOT NULL,
    CONSTRAINT PROCESS_PK PRIMARY KEY (`process_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;