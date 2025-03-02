package com.library.library_manager.controller.impl;

import com.library.library_manager.controller.BookController;
import com.library.library_manager.model.response.GetBookDetailRes;
import com.library.library_manager.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookControllerImpl implements BookController {
    private final BookService bookService;
    @Override
    public ResponseEntity<GetBookDetailRes> getBookDetail(String id) {
        return ResponseEntity.ok(bookService.getBookDetail(id));
    }
}
