public class Bike extends Transport{

    public Bike(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку мотоцикла");
    }

    @Override
    public void service(){
        updateTyre();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель мотоцикла");
    }
}