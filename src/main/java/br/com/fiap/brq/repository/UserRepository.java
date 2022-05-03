package br.com.fiap.brq.repository;

import br.com.fiap.brq.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String name);
    List<User> findByEmail(String email);
    List<User> findByDocument(String document);
}