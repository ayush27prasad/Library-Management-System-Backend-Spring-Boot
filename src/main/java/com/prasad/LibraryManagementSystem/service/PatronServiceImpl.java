package com.prasad.LibraryManagementSystem.service;

import com.prasad.LibraryManagementSystem.entity.Patron;
import com.prasad.LibraryManagementSystem.repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatronServiceImpl implements PatronService{


    @Autowired
    private PatronRepository patronRepository;

    @Override
    public Patron addPatron(Patron patron) {
        return patronRepository.save(patron);
    }

    @Override
    public void deletePatron(Long patronId) {
        patronRepository.deleteById(patronId);
    }

    @Override
    public Patron updatePatron(Long patronId, Patron updatedPatron) {
        Patron existingPatron = patronRepository.findById(patronId).get();
        existingPatron.setName(updatedPatron.getName());
        existingPatron.setEmail(updatedPatron.getEmail());
        existingPatron.setPhone(updatedPatron.getPhone());
        return patronRepository.save(updatedPatron);
    }

    @Override
    public Patron searchPatronById(Long patronId) {
        return patronRepository.findById(patronId).get();
    }

    @Override
    public List<Patron> searchPatronsByName(String patronName) {
        return patronRepository.findByName(patronName);
    }

    @Override
    public List<Patron> searchPatronsByEmail(String patronEmail) {
        return patronRepository.findByEmail(patronEmail);
    }

    @Override
    public List<Patron> searchPatronsByPhone(String patronPhone) {
        return patronRepository.findByPhone(patronPhone);
    }
}
