package com.due.repos;

import com.due.models.ERole;
import com.due.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
