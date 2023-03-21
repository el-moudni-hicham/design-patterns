package ma.enset.computer;

import org.springframework.stereotype.Component;

@Component("tv")
public class TV implements HDMI {
    @Override
    public void view(byte[] data) {
        String msg = new String(data);
        System.out.println("---------------- TV ----------------");
        System.out.println(msg);
        System.out.println("---------------- /TV ----------------");
    }
}
