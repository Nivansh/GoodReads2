package com.example2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example2.model.Book;

public interface BookJpaRepository extends JpaRepository<Book,Integer>
{

}
