public class Cargo extends Cars {

    public Cargo(String CarBrand, int Model) {
        super(CarBrand, Model);
    }
    public void information(){
        System.out.println(toString()+" Грузовой автомобиль");
    }
}
