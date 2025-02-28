package shyhub.vn.hub.repository;

import shyhub.vn.hub.domain.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user); // save new user to database

    List findAll();

    List<User> findByEmail(String email);

    User findById(long id);

    /*
     * 1 vai lenh query trong spring
     * Optional<User> findOneByActivationKey(String activationKey);
     * 
     * List<User> findAllByActivatedIsFalseAndCreatedDateBefore(Instant dateTime);
     * 
     * Optional<User> findOneByResetKey(String resetKey);
     * 
     * Page<User> findAllByIdNotNullAndActivatedIsTrue(Pageable pageable);
     * 
     */
}
