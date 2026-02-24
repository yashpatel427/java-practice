public class ternaryop{
    public static void main(String[] args) {
        //VARIABLE = (CONDITION) ? IFTRUE(STATEMENT 1) : IFFALSE(STATEMENT 2);

        int salary = 5000;

        double taxrate = (salary >= 50000) ? 0.25 : 0.15;
        System.out.println(taxrate);
    }
}