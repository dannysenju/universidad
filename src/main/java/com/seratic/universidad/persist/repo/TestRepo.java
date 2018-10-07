package com.seratic.universidad.persist.repo;

import com.seratic.universidad.persist.entity.AspiringTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<AspiringTest, Long> {

}
