DROP TABLE IF EXISTS student_teacher;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS teacher;

CREATE TABLE student (
    id    BIGINT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(100) NOT NULL,
    email VARCHAR(100)
);

CREATE TABLE teacher (
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE student_teacher (
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_id BIGINT NOT NULL,
    teacher_id BIGINT NOT NULL,
    UNIQUE (student_id, teacher_id),
    FOREIGN KEY (student_id) REFERENCES student(id),
    FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);
