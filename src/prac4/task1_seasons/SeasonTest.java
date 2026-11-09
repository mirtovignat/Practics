package prac4;

public class SeasonTest {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + favoriteSeason + ", средняя температура: " + favoriteSeason.getAverageTemperature() + ", описание: " + favoriteSeason.getDescription());

        printSeasonMessage(Season.WINTER);
        printSeasonMessage(Season.SUMMER);

        System.out.println("\nВсе времена года:");
        for (Season currentSeason : Season.values()) {
            System.out.println(currentSeason + " | Температура: " + currentSeason.getAverageTemperature() + " | " + currentSeason.getDescription());
        }
    }

    public static void printSeasonMessage(Season seasonValue) {
        switch (seasonValue) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}