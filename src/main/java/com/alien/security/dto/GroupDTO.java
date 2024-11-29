package com.alien.security.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroupDTO {
    private Long id;
    private String name;
    private String code;
    private String yearBeginStudy;
    private FacultyDTO faculty;
}
