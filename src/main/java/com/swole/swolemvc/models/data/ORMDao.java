package com.swole.swolemvc.models.data;

import com.swole.swolemvc.models.ORM;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface ORMDao extends CrudRepository<ORM, Integer> {

    @Query (value = "SELECT * FROM orm ORDER BY id DESC LIMIT 1",nativeQuery = true)
    public ORM findMostRecent();
}