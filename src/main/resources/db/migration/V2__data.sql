INSERT INTO `person` (`name`, `last_name`) VALUES ('Name 1', 'Last Name 1');
INSERT INTO `person` (`name`, `last_name`) VALUES ('Name 2', 'Last Name 2');

INSERT INTO `book` (`fk_person`, `name`) VALUES (1, 'Book 1');
INSERT INTO `book` (`fk_person`, `name`) VALUES (1, 'Book 2');
INSERT INTO `book` (`fk_person`, `name`) VALUES (2, 'Book 3');