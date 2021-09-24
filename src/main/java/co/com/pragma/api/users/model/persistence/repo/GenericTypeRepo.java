package co.com.pragma.api.users.model.persistence.repo;

import co.com.pragma.api.users.model.persistence.entity.GenericType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.querydsl.ReactiveQuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericTypeRepo extends ReactiveMongoRepository<GenericType, String>, ReactiveQuerydslPredicateExecutor<GenericType> {
}