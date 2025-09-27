package org.example.webhooktest.repository;

import org.example.webhooktest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<User, Long> {


}
