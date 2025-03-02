package com.library.library_manager.service.impl;

import com.library.library_manager.mapper.BookMapper;
import com.library.library_manager.model.response.GetBookDetailRes;
import com.library.library_manager.repository.BookRepository;
import com.library.library_manager.repository.entity.Book;
import com.library.library_manager.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public GetBookDetailRes getBookDetail(String id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            GetBookDetailRes getBookDetailRes = bookMapper.convertBookToGetBookDetail(book);
            log.info("getBookDetailRes : {}", getBookDetailRes);
            return getBookDetailRes;
        }
        return new GetBookDetailRes();
    }
}
