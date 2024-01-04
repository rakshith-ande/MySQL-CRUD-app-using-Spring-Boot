package com.mysql.SpringbootappwithmysqlDB.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.SpringbootappwithmysqlDB.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
