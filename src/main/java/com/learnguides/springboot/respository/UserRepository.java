package com.learnguides.springboot.respository;

import com.learnguides.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByFirstName(@Param("firstName") String firstName);

    List<User> findByLastName(@Param("refObj") String lastName);

     List<User> findByEmail(@Param("refObjEmail") String email);
    //http://localhost:8085/api/v1/members/search/findByEmail?refObjEmail=ahamedriaz@gmail.com
}
