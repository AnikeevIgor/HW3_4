package com.example.hw3_4.school.repositories;

import java.util.Optional;
import com.example.hw3_4.school.Model.Avatar;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AvatarRepo extends PagingAndSortingRepository<Avatar,Integer> {

     Optional<Avatar> findByStudentId (Long studentId);

}
