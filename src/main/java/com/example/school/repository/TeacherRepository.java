package com.example.school.repository;

import com.example.school.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query("select st.teacher from StudentTeacher st where st.student.id = ?1")
    List<Teacher> findTeachersByStudentId(Long studentId);
}
