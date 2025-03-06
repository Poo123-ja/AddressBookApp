package com.bridgelabz.AddressBookApp.repository;


import com.bridgelabz.AddressBookApp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {}