package com.dio.live.controller;

import com.dio.live.model.calendario;
import com.dio.live.service.calendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendar")
public class calendarioController {

    @Autowired
    calendarioService calendarService;

    @PostMapping
    public calendario createCalendar(@RequestBody calendario calendar){
        return calendarService.save(calendar);
    }

    @GetMapping
    public List<calendario> getCalendarList(){
        return calendarService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<calendario>  getCalendarById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(calendarService.findById(id).orElseThrow(()->new Exception("Calendar not found")));
    }

    @PutMapping
    public calendario updateCalendar(@RequestBody calendario calendar){
        return calendarService.update(calendar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<calendario> deleteCalendar(@PathVariable("id") Long id) {
        calendarService.deleteCalendar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}