package ua.com.likeshop.fb28.repository;

import org.springframework.data.repository.CrudRepository;
import ua.com.likeshop.fb28.entity.Contact;


public interface ContactRepository extends CrudRepository<Contact, Long> {

}

