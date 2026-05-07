package com.example.school.service;

import com.example.school.entity.Student;
import com.example.school.entity.Teacher;
import com.example.school.repository.StudentRepository;
import com.example.school.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepo;
    private final TeacherRepository teacherRepo;

    public StudentService(StudentRepository studentRepo, TeacherRepository teacherRepo) {
        this.studentRepo = studentRepo;
        this.teacherRepo = teacherRepo;
    }

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student getById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    public Student create(Student s) {
        return studentRepo.save(s);
    }

    public Student update(Long id, Student s) {
        Student db = studentRepo.findById(id).orElse(null);
        if (db == null) return null;
        db.setName(s.getName());
        db.setEmail(s.getEmail());
        return studentRepo.save(db);
    }

    public void delete(Long id) {
        studentRepo.deleteById(id);
    }

    public List<Teacher> getTeachers(Long studentId) {
        return teacherRepo.findTeachersByStudentId(studentId);
    }
}
