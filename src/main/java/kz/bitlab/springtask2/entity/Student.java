package kz.bitlab.springtask2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;

    private String name;

    private String surname;

    private int exam;

    private String mark;

}
