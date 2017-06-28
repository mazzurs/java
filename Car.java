package sample;

/**
 * Created by Сергей on 28.06.2017.
 */
public class Car {

    private Engine engine;

   public Car(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "engine=" + engine + '}';

    }



}
