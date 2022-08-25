--create database
create DATABASE jaegers;
\c jaegers
create TABLE jaegers (
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