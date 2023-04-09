public class truck extends engineTransport{

    public truck(String modelName, int Wheels_Count) {
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
