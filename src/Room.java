public class Room {

    double actuallTemp;
    double area;
    boolean isThereKlima;
    double minTemp;

    public Room(double actuallTemp, double area, boolean isThereKlima) {
        this.actuallTemp = actuallTemp;
        this.area = area;
        this.isThereKlima = isThereKlima;
        this.minTemp = 18;
    }

    public boolean decriseTemp() {
        actuallTemp = actuallTemp - 1;
        if (isThereKlima && actuallTemp >= minTemp) {
            return true;
        } else {
            return false;
        }
    }
}
