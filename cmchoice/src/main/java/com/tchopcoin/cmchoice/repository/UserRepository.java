package com.tchopcoin.cmchoice.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tchopcoin.cmchoice.model.User;

@Repository
public interface UserRepository extends  CrudRepository<User, Long>{
    
}