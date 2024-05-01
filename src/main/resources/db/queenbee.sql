DROP DATABASE IF EXISTS `queenbee`;
CREATE DATABASE iF NOT EXISTS `queenbee`;

USE `queenbee`;

CREATE TABLE `location` (
    `id` bigint PRIMARY KEY AUTO_INCREMENT,
    `place_id` varchar(255),
    `name` varchar(255),
    `formatted_address` varchar(255),
    `latitude` decimal(10,8),
    `longitude` decimal(11,8)
);

CREATE TABLE `event` (
    `id` bigint PRIMARY KEY AUTO_INCREMENT,
    `cover_photo` varchar(255),
    `date` datetime,
    `title` varchar(50),
    `summary` varchar(200),
    `location_id` bigint,
    `body` text,
    CONSTRAINT `fk_event_location_id`
        FOREIGN KEY (`location_id`)
            REFERENCES `location` (`id`)
            ON DELETE SET NULL
            ON UPDATE CASCADE
);

CREATE TABLE `organizers` (
    `id` bigint PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(100)
);

CREATE TABLE `labels` (
    `id` bigint PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(100)
);

#----------------------------Many to Many tables-----------------------------#

CREATE TABLE `event_organizers` (
    `event_id` bigint,
    `organizer_id` bigint,
    CONSTRAINT `fk_event_organizers_event_id`
        FOREIGN KEY (`event_id`)
            REFERENCES `event` (`id`)
            ON DELETE CASCADE
            ON UPDATE CASCADE,
    CONSTRAINT `fk_event_organizers_organizer_id`
        FOREIGN KEY (`organizer_id`)
            REFERENCES `organizers` (`id`)
            ON DELETE CASCADE
            ON UPDATE CASCADE,
    PRIMARY KEY (`event_id`, `organizer_id`)
);

CREATE TABLE `event_labels` (
    `event_id` bigint,
    `label_id` bigint,
    CONSTRAINT `fk_event_labels_event_id`
        FOREIGN KEY (`event_id`)
            REFERENCES `event` (`id`)
            ON DELETE CASCADE
            ON UPDATE CASCADE,
    CONSTRAINT `fk_event_labels_label_id`
        FOREIGN KEY (`label_id`)
            REFERENCES `labels` (`id`)
            ON DELETE CASCADE
            ON UPDATE CASCADE,
    PRIMARY KEY (`event_id`, `label_id`)
);
