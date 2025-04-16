package in.exponentit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.exponentit.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
