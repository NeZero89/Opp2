public abstract class Transport implements Serviced{
        private final String modelName;
        private final int wheelsCount;

        public Transport(String modelName, int wheelsCount) {
                this.modelName = modelName;
                this.wheelsCount = wheelsCount;
        }
        protected void updateTyre() {
                for (int i = 0; i < wheelsCount; i++) {
                        System.out.println("Меняем покрышку");
                        System.out.println();
                }
        }
}
