package br.edu.infnet.jobhunter.model.repository;

import br.edu.infnet.jobhunter.model.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface UserRepository extends CrudRepository<User, String> {
    Collection<User> findAll();
}
