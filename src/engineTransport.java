public class engineTransport extends  transport{
    public engineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    private void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
