package com.exercise.HibernateAddToSpring.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classes_id")
    private Class classes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "students_id")
    private Student students;

}
