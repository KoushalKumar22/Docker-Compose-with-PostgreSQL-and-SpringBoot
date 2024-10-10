package com.demo.DockerComposeWithPostGr.Repository;

import com.demo.DockerComposeWithPostGr.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Integer> {
    Optional<Profile> findByName(String name);
}
