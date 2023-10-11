CREATE DATABASE human_friends;

USE human_friends;

CREATE TABLE `nursery` (
    `id` SERIAL PRIMARY KEY,
    `name` VARCHAR(60) NOT NULL
);

CREATE TABLE `animal_types` (
    `id` SERIAL PRIMARY KEY,
    `name` VARCHAR(60) NOT NULL,
    `nursery` BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY (`nursery`)
        REFERENCES `nursery` (`id`)
);

CREATE TABLE `dogs` (
    `id` SERIAL PRIMARY KEY,
    `type` BIGINT UNSIGNED NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `birthday` TIMESTAMP NOT NULL,
    `commands` TEXT NOT NULL,
    FOREIGN KEY (`type`)
        REFERENCES `animal_types` (`id`)
);

CREATE TABLE `cats` (
    `id` SERIAL PRIMARY KEY,
    `type` BIGINT UNSIGNED NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `birthday` TIMESTAMP NOT NULL,
    `commands` TEXT NOT NULL,
    FOREIGN KEY (`type`)
        REFERENCES `animal_types` (`id`)
);

CREATE TABLE `hamsters` (
    `id` SERIAL PRIMARY KEY,
    `type` BIGINT UNSIGNED NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `birthday` TIMESTAMP NOT NULL,
    `commands` TEXT NOT NULL,
    FOREIGN KEY (`type`)
        REFERENCES `animal_types` (`id`)
);

CREATE TABLE `horses` (
    `id` SERIAL PRIMARY KEY,
    `type` BIGINT UNSIGNED NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `birthday` TIMESTAMP NOT NULL,
    `commands` TEXT NOT NULL,
    FOREIGN KEY (`type`)
        REFERENCES `animal_types` (`id`)
);

CREATE TABLE `camels` (
    `id` SERIAL PRIMARY KEY,
    `type` BIGINT UNSIGNED NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `birthday` TIMESTAMP NOT NULL,
    `commands` TEXT NOT NULL,
    FOREIGN KEY (`type`)
        REFERENCES `animal_types` (`id`)
);

CREATE TABLE `donkeys` (
    `id` SERIAL PRIMARY KEY,
    `type` BIGINT UNSIGNED NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `birthday` TIMESTAMP NOT NULL,
    `commands` TEXT NOT NULL,
    FOREIGN KEY (`type`)
        REFERENCES `animal_types` (`id`)
);
