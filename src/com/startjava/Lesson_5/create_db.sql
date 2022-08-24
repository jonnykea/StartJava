--create database

CREATE DATABASE jaegers;

CREATE TABLE jaegers (
        id        SERIAL PRIMARY KEY,
        modelName TEXT,
        mark      INTEGER,
        height    REAL,
        weight    REAL,
        status    TEXT,
        origin    TEXT,
        launch    INTEGER,
        kaijuKill INTEGER
);