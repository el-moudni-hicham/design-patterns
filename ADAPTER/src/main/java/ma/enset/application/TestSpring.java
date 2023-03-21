package ma.enset.application;

import ma.enset.adapter.VgaHdmiAdapter;
import ma.enset.computer.TV;
import ma.enset.computer.UC;
import ma.enset.computer.VP;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext springContext = new AnnotationConfigApplicationContext("ma.enset"); // Scan this packages

        UC uc = springContext.getBean(UC.class);
        VgaHdmiAdapter vgaHdmiAdapter = springContext.getBean(VgaHdmiAdapter.class);
        uc.print("vga interface");
        System.out.println("Val via Clavier : " + uc.readData());
    }
}
