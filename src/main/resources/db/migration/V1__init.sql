CREATE TABLE `person`
(
    `id`          bigint unsigned                        NOT NULL AUTO_INCREMENT,
    `name`        varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
    `last_name`   varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

CREATE TABLE `book`
(
    `id`          bigint unsigned                        NOT NULL AUTO_INCREMENT,
    `fk_person`   bigint unsigned                        NOT NULL,
    `name`        varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
    PRIMARY KEY (`id`),
    KEY `fk_person_idx` (`fk_person`),
    CONSTRAINT `fk_book_person` FOREIGN KEY (`fk_person`) REFERENCES `person` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;