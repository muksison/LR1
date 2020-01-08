public class Special extends Cars {
    public Special(String CarBrand, int Model) {
        super(CarBrand, Model);
    }
    @Override
    public void information(){
        System.out.println(toString()+" Спецтехника");
    }
}
