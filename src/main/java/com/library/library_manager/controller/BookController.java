package com.library.library_manager.controller;

import com.library.library_manager.model.response.GetBookDetailRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("client-api/book")
public interface BookController {
    @GetMapping("/{id}")
    ResponseEntity<GetBookDetailRes> getBookDetail(@PathVariable("id") String id);
}
