package com.example.app.todo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class TodoInitializer {

    @PostConstruct
    public void initData() {
        Todo todo1 = Todo.builder()
                .title("todo 1")
                .description("description 1")
                .completed(true)
                .build();

        Todo todo2 = Todo.builder()
                .title("todo 2")
                .description("description 2")
                .completed(false)
                .build();

        System.out.println(todo1.toString());
        System.out.println(todo2.toString());
    }
}
