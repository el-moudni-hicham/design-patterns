package ma.enset.adapter;

import ma.enset.computer.HDMI;
import ma.enset.computer.VGA;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vhadapter")
public class VgaHdmiAdapter implements VGA {
    private HDMI hdmi;

    public VgaHdmiAdapter(@Qualifier("tv") HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String s) {
        System.out.println("---------------- Vga Hdmi Adapter ----------------");
        byte[] b = s.getBytes();
        hdmi.view(b);
        System.out.println("---------------- /Vga Hdmi Adapter ----------------");
    }

    /*public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }

     */
}
