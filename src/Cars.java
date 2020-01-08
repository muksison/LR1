public class Cars {
    private String CarBrand;
    private int Model;

    public Cars(String CarBrand, int Model){
        this.CarBrand = CarBrand;
        this.Model = Model;
    }

    public void information(){
        System.out.println(toString()+" Легковой автомобиль");
    }

    @Override
    public String toString(){
        return "Марка: " + CarBrand + ", " + "Модель: " + Model;
    }


}
