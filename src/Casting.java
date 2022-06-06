public class Casting {
    public static void main(String[] args) {

        //En un año me dediqué a ubicar a 30 perritos
        //Cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        //Casteo entre tipos de datos
        double c = (double) a/b;
        System.out.println(c);

        //Casteo automatico
        char n = '1';
        int nI = n;
        System.out.println(nI);

        //Casteo Explicito
        short nS = (short) n;
        System.out.println(nS);
    }
}
