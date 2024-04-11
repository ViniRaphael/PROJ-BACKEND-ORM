package vini.iftm.edu.br.ex02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vini.iftm.edu.br.ex02.entities.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
}
