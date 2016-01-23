package org.josescalia.blog.simple.repository;

import org.josescalia.blog.simple.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by josescalia on 25/10/15.
 */
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
