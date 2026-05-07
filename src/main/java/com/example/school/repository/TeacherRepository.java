package com.example.school.repository;

import com.example.school.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query("select t from Teacher t, StudentTeacher st " +
           "where st.studentId = ?1 and t.id = st.teacherId")
    List<Teacher> findTeachersByStudentId(Long studentId);
}
