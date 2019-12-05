package leal.jean.contact.service.impl;

import leal.jean.contact.model.Contact;
import leal.jean.contact.repository.ContactRepository;
import leal.jean.contact.service.ContactService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public ResponseEntity<Contact> save(Contact contact) {
        try {
            contact.setCreatedAt(new Date());
            contact.setUpdatedAt(contact.getCreatedAt());
            return ResponseEntity.ok(contactRepository.save(contact));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    public ResponseEntity<Contact> update(Contact contact) {
        try {
            contact.setUpdatedAt(new Date());
            return ResponseEntity.ok(contactRepository.save(contact));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    public ResponseEntity delete(Integer id) {
        try{
            var contact = contactRepository.findById(id);
            if(contact.isPresent()){
                contactRepository.delete(contact.get());
                return ResponseEntity.status(HttpStatus.OK).build();
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    public ResponseEntity<Contact> get(Integer id) {
        var contact = contactRepository.findById(id);
        return contact.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
