package com.xl.java.week6;

import lombok.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 1
 * @Date 2020/10/15
 **/
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private Phone phone;
    private Book[] books;
}
