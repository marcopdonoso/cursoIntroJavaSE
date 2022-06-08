public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String daysOfTheWeek[] = new String[7];

        String[][] cities = new String[4][2]; // 4 * 2 = 8 elementos
        /*
        *+--------------------+
        *| Country | City     |
        *----------------------
        *| Bolivia | CBB      |
        *| Bolivia | SCZ      |
        *| Mexico  | CDMX     |
        *| Colombia| Bogota   |
        *+---------------------
         */

        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Bogota";
        cities[1][0] = "Mexico";
        cities[1][1] = "CDMX";
        cities[2][0] = "Bolivia";
        cities[2][1] = "SCZ";
        cities[3][0] = "Bolivia";
        cities[3][1] = "CBB";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);
    }
}
