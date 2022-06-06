public class DataTypes {
    public static void main(String[] args) {

        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.4567890123456789;
        float nF = 123.4567890123456789F;

        //Es posible usar la keyword var para que el sistema deduzca el tipo de dato de la variable
        var salary = 1000;
        //pension -3%
        var pension = salary*0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Marco Perez";
        System.out.println("Employee Name: " + employeeName + " Salary: " + totalSalary);
    }
}
