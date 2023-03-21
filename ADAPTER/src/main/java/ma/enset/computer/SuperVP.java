package ma.enset.computer;

public class SuperVP implements VGA, HDMI {
    @Override
    public void view(byte[] data) {
        String msg = new String(data);
        System.out.println("---------------- SuperVP HDMI ----------------");
        System.out.println(msg);
        System.out.println("---------------- /SuperVP HDMI ----------------");
    }

    @Override
    public void print(String s) {
        System.out.println("---------------- SuperVP VGA ----------------");
        System.out.println(s);
        System.out.println("---------------- /SuperVP VGA ----------------");
    }
}
