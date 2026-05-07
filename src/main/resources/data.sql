INSERT INTO teacher (name) VALUES ('Alan'), ('Marie'), ('Ada');

INSERT INTO student (name, email) VALUES
    ('John', 'john@school.edu'),
    ('Jane', 'jane@school.edu'),
    ('Sam',  'sam@school.edu');

INSERT INTO student_teacher (student_id, teacher_id) VALUES
    (1, 1), (1, 3),
    (2, 2),
    (3, 1), (3, 2), (3, 3);
