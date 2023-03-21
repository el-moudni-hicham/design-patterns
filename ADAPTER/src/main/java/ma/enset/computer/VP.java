package ma.enset.computer;

import org.springframework.stereotype.Component;

@Component("vp")
public class VP implements VGA {
    @Override
    public void print(String s) {
        System.out.println("---------------- VP ----------------");
        System.out.println(s);
        System.out.println("---------------- /VP ----------------");
    }
}
