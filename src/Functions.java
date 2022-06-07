public class Functions {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo
        //pi * r2
        //double area = circleArea(y);
        System.out.println(circleArea(y));

        //Area de una esfera
        //4PI * r2
        //System.out.println(4 * Math.PI * Math.pow(y,2));
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*pi * r3
        //System.out.println((4/3) * Math.PI * Math.pow(y,3));
        System.out.println(sphereVolume(y));

        System.out.println("BOB a US$: " + convertToDolar(200,"BOB"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    public static double convertToDolar(double quantity, String currency) {
        switch (currency) {
            case "BOB":
                quantity = quantity * 0.15;
                break;
            case "MXN":
                quantity = quantity * 0.052;
                break;
        }
        return quantity;
    }
}
