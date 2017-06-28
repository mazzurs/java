package sample;

/**
 * Created by Сергей on 28.06.2017.
 */
public class Engine {
    public int XP;

    public Engine (int xp){
        this.XP = xp;
    }

    @Override
    public String toString(){
        return "Engine{"+"XP="+XP+'}';
    }

}
