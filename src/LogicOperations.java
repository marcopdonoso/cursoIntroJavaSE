public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;

       /* //Operadores asignacion
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente de b? -> " + (a != b));

        //Operadores relacionales
        System.out.println("a es mayor a b? -> " + (a > b));
        System.out.println("a es menor a b? -> " + (a < b));
        System.out.println("a es mayor o igual a b? -> " + (a >= b));
        System.out.println("a es menor o igual a b? -> " + (a <= b));*/

        if ((a != b) && (a > b)) {
            System.out.println("a es diferente de b porque a es mayor.");
        } else if ((a != b) && (a < b)) {
            System.out.println("a es diferente de b porque b es mayor.");
        } else {
            System.out.println("a es igual a b");
        }
    }
}
