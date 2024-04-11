package vini.iftm.edu.br.ex02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vini.iftm.edu.br.ex02.entities.Library;
import vini.iftm.edu.br.ex02.repository.LibraryRepository;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    public Library addLibrary(Library library) {
        return libraryRepository.save(library);
    }

    public Library updateLibrary(Library library) {
        return libraryRepository.save(library);
    }

    public void deleteLibrary(Integer id) {
        libraryRepository.deleteById(id);
    }
}