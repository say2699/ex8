package kz.iitu.ex8.repository;

import kz.iitu.ex8.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByNameContainsAndAge(String name, Integer age);
}
