-- liquibase formatted sql

-- changeset anikeev:1

CREATE INDEX search_by_student_name  ON student (name);

-- changeset anikeev:2

CREATE INDEX search_by_faculty_name_and_color ON faculty (name,color);