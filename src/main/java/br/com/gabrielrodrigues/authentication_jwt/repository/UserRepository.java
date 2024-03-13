package br.com.gabrielrodrigues.authentication_jwt.repository;

import br.com.gabrielrodrigues.authentication_jwt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}
