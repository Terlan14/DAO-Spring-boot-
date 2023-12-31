package com.atashgah.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atashgah.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findById(Integer id);

}
