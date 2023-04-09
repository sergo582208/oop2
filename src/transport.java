public abstract class transport implements diagnostible {
    public final String modelName;
    public final int wheelsCount;

    public transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    private void updateTyres(){
        for (int i = 0; i < wheelsCount; ++i) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        updateTyres();
    }
}
