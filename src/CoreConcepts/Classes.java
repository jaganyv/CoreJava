package CoreConcepts;

public class Classes {
    String carName;
    int carPrice;

    void speedGoes(){
        System.out.println("Vroom Vroom ratatatattatattatattatattatta");
    }
    public static void main(String[] args) {
        Classes obj = new Classes();
        obj.carName = "Audi";
        obj.carPrice = 200000;
        System.out.println(obj.carName);
        System.out.println(obj.carPrice);
        obj.speedGoes();
    }
}
