package com.viitorgonzalez.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viitorgonzalez.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
        
}
