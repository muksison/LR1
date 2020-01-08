import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Cars cars = new Cars("Subaru",3);
        Cars Cargo = new Cargo("Nissan", 6);
        Cars Special = new Special("Uralaz", 9);
        
        List<Cars> list = Arrays.asList(cars,Cargo,Special);
        for (Cars c: list){
            c.information();
        }
    }
}
