package com.example.hw3_4.school.repositories;

import java.util.Optional;
import com.example.hw3_4.school.Model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AvatarRepo extends JpaRepository<Avatar,Long> {

     Optional<Avatar> findByStudentId (Long studentId);

}
