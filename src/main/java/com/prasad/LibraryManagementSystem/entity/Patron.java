package com.prasad.LibraryManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patron {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patron_id_seq")
    @SequenceGenerator(name = "patron_id_seq", sequenceName = "PATRON_ID_SEQ", allocationSize = 1)
    @Column(name = "patron_id")
    private Long patronId;

    @Column(name = "patron_name")
    private String name;

    @Column(name = "patron_email")
    private String email;

    @Column(name = "patron_phone")
    private Long phone;



}
