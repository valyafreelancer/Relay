
import lombok.Data;
import static java.lang.Math.random;

@Data
public class SportsMan {

    private String name;
    private int number;


    public void sportsMan(){
        System.out.println(" Спортсмен " + this.name + " под номером " + this.number);
    }

    public void takeBaton(SportsMan sportsMan) {
        this.sportsMan();
        System.out.println( " берет эстафетную палочку");

    }

    public void runWithBaton() throws Exception {
        this.sportsMan();
        int random = (int) ((random() * 100) + 1);
        if (random < 20)
            throw new Exception( " упал");
        else
            System.out.println( " бежит с эстафетной палочкой");

    }

    public void passBaton() throws Exception {
        int random = (int) ((random() * 100) + 1);
        if (random < 20)
            throw new Exception("Рисковая передача палочки");
        else
            this.sportsMan();
            System.out.println(" передает эстафетную палочку другому спортсмену");


    }

}