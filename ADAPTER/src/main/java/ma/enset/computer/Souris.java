package ma.enset.computer;

import org.springframework.stereotype.Component;

@Component("souris")
public class Souris implements USB {
    @Override
    public int read() {
        return 1;
    }
}
