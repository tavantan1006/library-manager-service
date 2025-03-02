package com.library.library_manager.mapper;

import com.library.library_manager.model.response.GetBookDetailRes;
import com.library.library_manager.repository.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    GetBookDetailRes convertBookToGetBookDetail(Book book);


}
