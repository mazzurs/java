package sample;
import java.util.ArrayList;

/* Припускаємо, що у нас є якісь персони (Person) та розробники (Developer). Розробники мають усі властивості
* персони, тільки вони мають ще додаткову властивість, вони можуть казати яку задачу вони виконують (метод develop).
* Щоб не переписувати код для розробників ми наслідуємо розробників від персон.
*       Інкапсуляція полягає у тому, що
* ми приховуємо дані персон роблячи їх приватними, а для зчитування та додавання даних робимо гетери та конструктор.
*       Поліморфізм полягає у перевизначенні метода changeId(), який повертає для персони id, до якого додає двійку, а для розробника
 *трійку.
 *      Також я привів приклад агрегації на прикладі машин і моторів. У машин можуть бути різні мотори з різною потужністю. Щоб
 *  не вказувати кожен раз, коли створюємо машину потужність мотора ми робимо, скажем так, коробку із моторами і потім при
 *  додаванні машини ми просто указуємо номер мотора який нам потрібно.
* */

public class Main {


    public static void main(String[] args)
    {
        Person p1 = new Person("Sergey", "Mazur", 1);
        Person p2 = new Person("Vitaliy", "Jaroviy", 2);

        Developer d1 = new Developer ("Ruslan", "Bilmakovsky", 3);
        Developer d2 = new Developer ("Ivan", "Kolisnik", 4);

      System.out.println(p1.getFirstName() + " " + p1.getLastName()+" "+ p1.changeId());    // changeId добавляет 2 к id
        System.out.println(d1.getFirstName() + " " + d1.getLastName()+ " "+ d1.changeId()); // changeId добавляет 3 к id

        ArrayList<Engine> engines = new ArrayList();
        engines.add(new Engine(10));
        engines.add(new Engine(15));
        engines.add(new Engine(36));
        engines.add(new Engine(100));

        ArrayList<Car> cars = new ArrayList();
        cars.add(new Car(engines.get(1)));
        cars.add(new Car(engines.get(2)));
        cars.add(new Car(engines.get(3)));
        cars.add(new Car(engines.get(2)));
        cars.add(new Car(engines.get(2)));
        cars.add(new Car(engines.get(0)));

        for (Car car: cars){
            System.out.println(car.toString());
        }

    }


}