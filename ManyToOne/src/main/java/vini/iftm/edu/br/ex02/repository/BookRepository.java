package vini.iftm.edu.br.ex02.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import vini.iftm.edu.br.ex02.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}