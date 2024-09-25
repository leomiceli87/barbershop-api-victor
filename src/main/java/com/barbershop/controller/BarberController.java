package main.java.com.barbershop.controller;

import com.barbershop.model.Barber;
import com.barbershop.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/barbers")
public class BarberController {

    private final BarberService barberService;

    @Autowired
    public BarberController(BarberService barberService) {
        this.barberService = barberService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Barber>> getAllBarbers() {
        return new ResponseEntity<>(barberService.getAllBarbers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barber> getBarberById(@PathVariable Long id) {
        return new ResponseEntity<>(barberService.getBarberById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Barber> createBarber(@RequestBody Barber barber) {
        return new ResponseEntity<>(barberService.createBarber(barber), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Barber> updateBarber(@PathVariable Long id, @RequestBody Barber barber) {
        return new ResponseEntity<>(barberService.updateBarber(id, barber), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBarber(@PathVariable Long id) {
        barberService.deleteBarber(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}