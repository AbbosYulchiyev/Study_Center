package uz.pdp.appstudycenters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appstudycenters.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {



}
