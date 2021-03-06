package com.example.sprint1assignment.repositories;

import com.example.sprint1assignment.models.Book;
import com.example.sprint1assignment.models.Wishlist;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface BookRepository extends CrudRepository<Book,Long> {
    List<Book> findAllByWishlist(Wishlist wishlist);
    Long deleteByName(String name);
    Optional<Book> findByName(String name);



}
