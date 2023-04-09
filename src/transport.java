public abstract class transport implements Diagnostible {
    public final String modelName;
    public final int Wheels_Count;

    public transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.Wheels_Count = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return Wheels_Count;
    }
    private void updateTyres(){
        for (int i = 0; i < Wheels_Count; ++i) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        updateTyres();
    }
}
