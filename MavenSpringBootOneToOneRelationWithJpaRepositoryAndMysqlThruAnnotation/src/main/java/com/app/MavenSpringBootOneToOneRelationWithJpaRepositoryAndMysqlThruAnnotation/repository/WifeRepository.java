package com.app.MavenSpringBootOneToOneRelationWithJpaRepositoryAndMysqlThruAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.MavenSpringBootOneToOneRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Wife;

public interface WifeRepository extends JpaRepository<Wife, Integer>{
}
