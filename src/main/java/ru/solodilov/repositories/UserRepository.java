package ru.solodilov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.solodilov.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
