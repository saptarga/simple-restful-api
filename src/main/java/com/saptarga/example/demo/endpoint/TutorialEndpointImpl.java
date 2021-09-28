package com.saptarga.example.demo.endpoint;

import com.saptarga.example.demo.dto.request.RequestTutorialDTO;
import com.saptarga.example.demo.exception.ServiceException;
import com.saptarga.example.demo.model.Tutorial;
import com.saptarga.example.demo.service.ITutorialService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/api/tutorials")
@Slf4j
public class TutorialEndpointImpl {

    private final ITutorialService iTutorialService;

    @GetMapping
    public ResponseEntity<List<Tutorial>> getAllTutorials() {

        List<Tutorial> tutorials = new ArrayList<>();
        try {
            tutorials = iTutorialService.findAll();
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        if (tutorials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Tutorial> createTutorial(@RequestBody RequestTutorialDTO request) {
        Tutorial tutorial = null;
        try {
            tutorial = iTutorialService.createTutorial(request);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(tutorial, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutorial> findById(@PathVariable("id") long id) {
        Tutorial tutorial = null;
        try {
            tutorial = iTutorialService.findById(id);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        if (Objects.nonNull(tutorial)) {
            return ResponseEntity.ok(tutorial);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        try {
            iTutorialService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody RequestTutorialDTO request) {
        Tutorial tutorial = null;
        try {
            tutorial = iTutorialService.updateById(id, request);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        if (Objects.nonNull(tutorial)) {
            return ResponseEntity.ok(tutorial);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
