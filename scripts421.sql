ALTER TABLE student
    add CONSTRAINT age_constraint CHECK (age > 16);

ALTER TABLE student
ALTER COLUMN name SET NOT NULL;

ALTER TABLE student
    ADD CONSTRAINT name_unique UNIQUE (name);

ALTER TABLE faculty
    ADD CONSTRAINT color_name_unique UNIQUE (color, name);

ALTER TABLE student
    alter column age set default (20);
