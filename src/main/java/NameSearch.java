import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch implements TypeSearch{

    public ArrayList<Dish> getResults(ArrayList<Dish> list){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Dish Name:");

        String input = in.nextLine();


        ArrayList<Dish> ret = new ArrayList<>();

        for(Dish dish: list){
            if (dish.getName().equals(input))
                ret.add(dish);


        }
        return ret;





    }

}
