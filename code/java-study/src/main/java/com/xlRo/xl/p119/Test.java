package com.xlRo.xl.p119;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 1
 * @Date 2020/10/21
 **/
public class Test {
    public static void main(String[] args) {
        CPU cpu = CPU.builder()
                .speed(2200)
                .build();
        HardDisk disk = HardDisk.builder()
                .amount(200)
                .build();
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setDisk(disk);
        pc.show();
    }
}
