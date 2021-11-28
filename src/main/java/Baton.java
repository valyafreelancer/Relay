import lombok.Data;

@Data
public class Baton {
    public static void main(String[] args) {

        SportsMan sportsMan1 = new SportsMan("Вася",1);
        sportsMan1.takeBaton(sportsMan1);

        try {
            sportsMan1.runWithBaton();
        } catch (Exception ex) {
            System.out.println("Мы перехватили исключение " + ex.getMessage());
        }

        try {
            sportsMan1.passBaton();
        } catch (Exception ex) {
            System.out.println("Мы перехватили исключение " + ex.getMessage());
        }


        SportsMan sportsMan2 = new SportsMan("Петя",2);
        sportsMan2.takeBaton(sportsMan2);

        try {
            sportsMan2.runWithBaton();
        } catch (Exception ex) {
            System.out.println("Мы перехватили исключение " + ex.getMessage());
        }

        try {
            sportsMan2.passBaton();
        } catch (Exception ex) {
            System.out.println("Мы перехватили исключение " + ex.getMessage());
        }


        SportsMan sportsMan3 = new SportsMan("Дима",3);
        sportsMan3.takeBaton(sportsMan3);

        try {
            sportsMan3.runWithBaton();
        } catch (Exception ex) {
            System.out.println("Мы перехватили исключение " + ex.getMessage());
        }

        try {
            sportsMan3.passBaton();
        } catch (Exception ex) {
            System.out.println("Мы перехватили исключение " + ex.getMessage());
        }


    }


}
