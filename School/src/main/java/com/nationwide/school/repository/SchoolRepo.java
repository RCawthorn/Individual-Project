package com.nationwide.school.repository;

import com.nationwide.school.entity.MainPage;
import com.nationwide.school.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface SchoolRepo extends JpaRepository <Users, Integer> {

   public ArrayList<Users> findAll();
   public Users findByFirstname(String firstname);
   public Users findByLastname(String lastname);

}

