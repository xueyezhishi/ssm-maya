package spi;

public class BeanTest {
    public static void main(String[] args) {
        Chinese p = new Chinese();
        SteelAxe axe = new SteelAxe();
  //      SteelAxe axe = new SteelAxe();
        p.setAxe(axe);
        p.useAxe();
    }
}