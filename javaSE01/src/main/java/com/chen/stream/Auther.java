package com.chen.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Auther {
    private Long id;

    private String name;

    private Integer age;

    private String intro;

    private List<Book> books;
}
