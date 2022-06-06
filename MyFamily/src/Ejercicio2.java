public class Ejercicio2 {
    public static void main(String[] args) {

        char c = 'z';
        int cI = c;
        System.out.println("Conversion implicita de char a int, con el dato: " + c + " calculando exactitud: " + cI);

        int i = 250;
        long iL = i;
        short iS = (short) iL;
        System.out.println("Conversion implicita de int a long, con el dato: " + i + " calculando exactitud: " + iL + " Converion explicita de long a short, calculando estimacion:" + iS);

        double d = 301.067;
        long dL = (long) d;
        System.out.println("Conversion explicita de double a long, con el dato: " + d + " calculando estimacion: " + dL);

        int k = 100;
        k += 5000.66;
        float kF = k;
        System.out.println("Conversion implicita de int a float, con el dato: " + k + " calculando exactitud: " + kF);

        int j = 737;
        j *= 100;
        byte jB = (byte) j;
        System.out.println("Conversion explicita de int a byte, con el dato: " + j + " calculando estimacion: " + jB);

        double e = 298.638;
        e /= 25;
        long eL = (long) e;
        System.out.println("Conversion explicita de double a long, con el dato: " + e + " calculando estimacion: " + eL);
    }
}
