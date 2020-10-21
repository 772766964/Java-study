package com.xl.java.week6;

import lombok.*;

/**
 * @ClassName Phone
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
public class Phone {
    private String brand;
    private Integer price;
}
