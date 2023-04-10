public class Truck extends EngineTransport {

    public Truck(String modelName, int Wheels_Count) {
        super(modelName, Wheels_Count);
    }
    private void checkTrayler(){
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkTrayler();
    }
}
