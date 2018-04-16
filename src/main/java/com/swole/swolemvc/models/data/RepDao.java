package com.swole.swolemvc.models.data;

import com.swole.swolemvc.models.Rep;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RepDao extends CrudRepository<Rep, Integer>
}
