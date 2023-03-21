package ma.enset.computer;

import org.springframework.stereotype.Component;

@Component("ecran")
public class Ecran implements VGA {
    @Override
    public void print(String s) {
        System.out.println("---------------- Ecran ----------------");
        System.out.println(s);
        System.out.println("---------------- /Ecran ----------------");
    }
}
