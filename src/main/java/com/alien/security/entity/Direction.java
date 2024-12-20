package com.alien.security.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

@Entity
@Table(name = "direction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id", nullable = false)
    //@JsonIgnore Из за этой хрени меняеться метод создание обновлнения, нашел решение в создание dto
    @JsonBackReference // Обратная ссылка помогло убирает связвает
    private Faculty faculty;


}
