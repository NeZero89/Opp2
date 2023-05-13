
public class Truck extends  Transport {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    @Override
    public void serv() {
        updateTyre();
        System.out.println();
        checkEngine();
        System.out.println();
        checkTrailer();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}