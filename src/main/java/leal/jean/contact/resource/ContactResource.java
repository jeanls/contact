package leal.jean.contact.resource;

import leal.jean.contact.model.Contact;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("api")
public interface ContactResource {
    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Contact> save(@RequestBody Contact contact);

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Contact> update(@RequestBody Contact contact);

    @DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity delete(@RequestParam(value = "id") Integer id);

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Contact> get(@RequestParam(value = "id") Integer id);
}
