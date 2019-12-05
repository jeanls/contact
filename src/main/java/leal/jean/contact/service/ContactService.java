package leal.jean.contact.service;

import leal.jean.contact.model.Contact;
import org.springframework.http.ResponseEntity;

public interface ContactService {
    ResponseEntity<Contact> save(Contact contact);
    ResponseEntity<Contact> update(Contact contact);
    ResponseEntity delete(Integer id);
    ResponseEntity<Contact> get(Integer id);
}
