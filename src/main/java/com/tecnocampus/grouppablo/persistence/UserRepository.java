package com.tecnocampus.grouppablo.persistence;

import com.tecnocampus.grouppablo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, String>{

}