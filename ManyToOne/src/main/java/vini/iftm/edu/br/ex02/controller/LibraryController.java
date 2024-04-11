package vini.iftm.edu.br.ex02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vini.iftm.edu.br.ex02.entities.Library;
import vini.iftm.edu.br.ex02.service.LibraryService;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping
    public List<Library> getAllLibraries() {
        return libraryService.getAllLibraries();
    }

    @PostMapping
    public Library addLibrary(@RequestBody Library library) {
        return libraryService.addLibrary(library);
    }

    @PutMapping
    public Library updateLibrary(@RequestBody Library library) {
        return libraryService.updateLibrary(library);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable Integer id) {
        libraryService.deleteLibrary(id);
    }
}