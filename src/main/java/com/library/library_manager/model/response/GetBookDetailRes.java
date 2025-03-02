package com.library.library_manager.model.response;

import com.library.library_manager.repository.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBookDetailRes {
    private String id;
    private String name;
    private List<Author> authors;
}
