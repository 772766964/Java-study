package com.xl.java.week6;

import lombok.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Book
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
public class Book {
    private String bookName;
    private Integer price;
    private Date publicDate;


    @Override
    public String toString() {
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String now = df.format(this.publicDate);
//        String s1 = "{book{name:%s,price:%d,publicDate:%s";
//        return String.format(s1,bookName,price,publicDate);
        return bookName;
    }
}
