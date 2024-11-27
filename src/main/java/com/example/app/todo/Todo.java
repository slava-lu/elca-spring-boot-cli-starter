package com.example.app.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Todo {

    private Long id;

    private String title;

    private String description;

    private boolean completed;
}
