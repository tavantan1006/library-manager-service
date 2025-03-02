package com.library.library_manager.service;

import com.library.library_manager.model.response.GetBookDetailRes;

public interface BookService {
    GetBookDetailRes getBookDetail(String id);
}
