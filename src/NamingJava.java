public class NamingJava {
    public static void main(String[] args) {
        //Sensibilidad a mayusculas y minusculas
        int celphone = 123444;
        int celPhone = 432543;
        System.out.println(celphone);
        System.out.println(celPhone);

        //Tambien es correcto nombrar las variables iniciando con el simbolo $ o _
        String $countryName = "Spain";
        String _backgroundColor = "Green";

        //Es posible usar $ y _ en distintos lugares del nombre de variable, pero siempre el primer caracter debe ser letra, $ o _, nunca otra cosa
        String currency$ = "BOB";
        String background_color = "BLUE";

        //Los nombres de las constantes se escriben con MAYUSCULAS y si tienen mas de una palabla se separan con _

        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;
    }
}
