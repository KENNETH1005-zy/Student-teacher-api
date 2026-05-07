package com.example.school.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "student_teacher")
@IdClass(StudentTeacher.PK.class)
public class StudentTeacher {

    @Id
    @Column(name = "student_id")
    private Long studentId;

    @Id
    @Column(name = "teacher_id")
    private Long teacherId;

    public StudentTeacher() {}

    public StudentTeacher(Long studentId, Long teacherId) {
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public Long getTeacherId() { return teacherId; }
    public void setTeacherId(Long teacherId) { this.teacherId = teacherId; }

    public static class PK implements Serializable {
        private Long studentId;
        private Long teacherId;

        public PK() {}

        public PK(Long studentId, Long teacherId) {
            this.studentId = studentId;
            this.teacherId = teacherId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PK pk)) return false;
            return Objects.equals(studentId, pk.studentId)
                    && Objects.equals(teacherId, pk.teacherId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId, teacherId);
        }
    }
}
