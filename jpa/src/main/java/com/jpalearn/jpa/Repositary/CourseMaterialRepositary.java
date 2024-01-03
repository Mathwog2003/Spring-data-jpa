package com.jpalearn.jpa.Repositary;

import com.jpalearn.jpa.Entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepositary extends JpaRepository<CourseMaterial,Long> {
}
