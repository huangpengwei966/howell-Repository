package org.javaboy.mybatis.mymapper;

import org.javaboy.mybatis.model.Author;
import org.javaboy.mybatis.model.Book;

public interface BookMapper {
    Book getBookById(Integer id);

    Book getBookById2(Integer id);
    Author getAuthorById(Integer id);
}
