package ma.enset.computer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("uc")
public class UC {
    private USB usb;
    private VGA vga;

    public UC(@Qualifier("vhadapter") VGA vga,@Qualifier("souris") USB usb) {
        this.vga = vga;
        this.usb = usb;
    }

    public void print(String s){
        vga.print(s);
    }

    public int readData(){
        return usb.read();
    }

    /*public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }

     */
}
