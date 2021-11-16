import Utility.*;
import Things.*;
import LivingBeing.*;

public class Story {
    public static void main(String[] args) {

        Shorty shorty1 = new Shorty("Незнайка", 5, Location.HOUSE, 12d, true, true);
        Shorty shorty2 = new Shorty("Сиропчик", 6, Location.HOUSE, 10d, true, true);
        Shorty shorty3 = new Shorty("Торопыжка", 7, Location.UNDEFINED, 20d);


        Car car = new Car(80d, 5, Location.BACKYARD);

        shorty1.joinStory();
        shorty2.joinStory();
        shorty3.joinStory();
        car.joinStory();

        shorty2.loveToRideCarMassage();
        shorty1.loveToRideCarMassage();

        shorty2.drinkLemonade();
        shorty1.drinkLemonade();

        shorty1.communicateWith(shorty3, "Прокати меня машине");

        shorty1.moveTo(Location.BACKYARD);
        shorty1.driveCar(car);
        shorty2.communicateWith(shorty1, "Ты куда?!!");
        shorty2.moveTo(Location.BACKYARD);
        shorty2.communicateWith(shorty1, "Ты куда?!!");

        shorty1.moveTo(Location.PUBLIC_ROAD);

        for (int i = 0; i < 5; i++) {
            Shorty shorty = new Shorty("Неизвестный" + i, 6, Location.HOUSE, 15d);
            shorty.joinStory();
            shorty.speedUp(15d);
            shorty.moveTo(Location.BACKYARD);
        }
    }
}
