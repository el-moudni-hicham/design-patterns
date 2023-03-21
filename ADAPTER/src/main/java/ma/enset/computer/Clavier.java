package ma.enset.computer;

import org.springframework.stereotype.Component;

@Component("clavier")
public class Clavier implements USB {
    @Override
    public int read() {
        return 13;
    }
}
