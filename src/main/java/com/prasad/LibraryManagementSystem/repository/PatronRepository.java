package com.prasad.LibraryManagementSystem.repository;

import com.prasad.LibraryManagementSystem.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatronRepository extends JpaRepository <Patron,Long> {

    public List<Patron> findByName(String patronName);
    public List<Patron> findByEmail(String patronEmail);
    public List<Patron> findByPhone(String patronPhone);

}
