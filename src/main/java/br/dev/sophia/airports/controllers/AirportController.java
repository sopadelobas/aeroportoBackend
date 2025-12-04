package br.dev.sophia.airports.controllers;

import br.dev.sophia.airports.AirportService.AirportService;
import br.dev.sophia.airports.DTO.AirportMinDTO;
import br.dev.sophia.airports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/airport")
    public List<Airport> findAll() {
        List<Airport> result = airportService.findAll();
        return result;
    }

    @GetMapping("/city/{cityName}")
    public ResponseEntity<List<Airport>> findByCityIgnoreCase(@PathVariable String cityName) {
        List<Airport> result = airportService.findByCity(cityName);

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("/country/{countryName}")
    public ResponseEntity<List<AirportMinDTO>> findByCountryIgnoreCase(@PathVariable String countryName) {
        
        List<AirportMinDTO> result = airportService.findByCountry(countryName);
        
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(result);
        }
    }
    
}
