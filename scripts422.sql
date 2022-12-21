CREATE TABLE people (
    id INTEGER PRIMARY KEY,
    Name TEXT,
     Age INTEGER,
    Drivers_license BOOLEAN,
    car_id INTEGER
          );
INSERT INTO people(id, Name, Age, Drivers_license, car_id) VALUES (1,'Igor',26,true,3);
INSERT INTO people(id, Name, Age, Drivers_license, car_id) VALUES (2,'Valeria',24,true,3);
INSERT INTO people(id, Name, Age, Drivers_license, car_id) VALUES (3,'Ivan',22,true,1);
INSERT INTO people(id, Name, Age, Drivers_license, car_id) VALUES (4,'Ivan',22,true,2);


CREATE  TABLE car(
    id INTEGER PRIMARY KEY,
    Brand text,
    Model TEXT,
    Cost INTEGER
       );
INSERT INTO car(id, Brand, Model, Cost) VALUES (1,'BMW','x6',6000);
INSERT INTO car(id, Brand, Model, Cost) VALUES (2,'Volkswagen','Golf',5000);
INSERT INTO car(id, Brand, Model, Cost) VALUES (3,'Mercedes-Benz','s666',7000);

select people.Name, people.Age, people.Drivers_license, car.Brand, car.Model, car.Cost
from people
INNER JOIN car ON people.car_id=car.id ;

select student.name,student.age,faculty.name
from student
INNER JOIN faculty on student.faculty_id = faculty.id ;

select student.name,avatar.file_path
from student
RIGHT JOIN  avatar on student.avatar_id = avatar.student_id ;