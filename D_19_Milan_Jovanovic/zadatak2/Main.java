package zadatak2;

/*
Racunar - br. procesora, kolicinu RAM, kolicinu memorije
Laptop ext. racunar - velicina ekrana, tastatura(enum int./US)
Mobilni telefon ext. racunar - jacina kamere(mpx), mreza(enum 3g/4g/5g)
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PC> device = new ArrayList<>();
        device.add(new Laptop("4","8", "240","18",Keyboard.INTERNATIONAL));
        device.add(new MobilePhone("4","16","64","24",Service._3G));
        device.add(new PC("8","16","516"));


        for (int i = 0; i < device.size(); i++) {
            System.out.println(device.get(i).getClass().getSimpleName());
            System.out.println(device.get(i));
        }

    }
}
