package com.prasad.LibraryManagementSystem.service;

import com.prasad.LibraryManagementSystem.entity.Patron;
import java.util.List;

public interface PatronService {
    public Patron addPatron(Patron patron);
    public Patron updatePatron(Long patronId, Patron updatedPatron);
    public void deletePatron(Long patronId);
    public Patron searchPatronById(Long patronId);
    public List<Patron> searchPatronsByName(String patronName);
    public List<Patron> searchPatronsByEmail(String patronEmail);
    public List<Patron> searchPatronsByPhone(String patronPhone);
}
