package com.swole.swolemvc.models.data;

import com.swole.swolemvc.models.ORM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional

public interface BentOverRowDao extends CrudRepository<ORM, Integer> {
}
