package leal.jean.contact.resource.impl;

import leal.jean.contact.model.Contact;
import leal.jean.contact.resource.ContactResource;
import leal.jean.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ContactResourceImpl implements ContactResource {
    @Autowired
    private ContactService contactService;

    @Override
    public ResponseEntity<Contact> save(Contact contact) {
        return contactService.save(contact);
    }

    @Override
    public ResponseEntity<Contact> update(Contact contact) {
        return contactService.update(contact);
    }

    @Override
    public ResponseEntity delete(Integer id) {
        return contactService.delete(id);
    }

    @Override
    public ResponseEntity<Contact> get(Integer id) {
        return contactService.get(id);
    }
}
