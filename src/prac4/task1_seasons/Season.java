package prac4;

public enum Season {
    WINTER(-10.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(15.0) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    SUMMER(25.0) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public abstract String getDescription();
}