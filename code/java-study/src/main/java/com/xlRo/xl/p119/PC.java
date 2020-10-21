package com.xlRo.xl.p119;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PC
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PC {
    CPU cpu = new CPU();
    HardDisk disk = new HardDisk();

    public void show() {
        System.out.println(cpu.getSpeed());
        System.out.println(disk.getAmount());
    }
}
