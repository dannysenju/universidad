package com.seratic.universidad.persist.repo;

import com.seratic.universidad.persist.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepo extends JpaRepository<Token, String> {
}
