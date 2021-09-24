package co.com.pragma.api.users.model.persistence.repo;

import co.com.pragma.api.users.model.persistence.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.querydsl.ReactiveQuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends ReactiveMongoRepository<User, String>, ReactiveQuerydslPredicateExecutor<User> {
}