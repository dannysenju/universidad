package com.seratic.universidad.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seratic.universidad.persist.entity.Authority;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}