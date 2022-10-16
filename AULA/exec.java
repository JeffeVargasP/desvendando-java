public class exec {
 
    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        c1.changeName("Jerso");
        c1.changeAge(25);
        c1.changeIncomeMonth(7800.80);

        System.out.println("Name: " +c1.consultName());
        System.out.println("Age: " +c1.showAge());
        System.out.println("Money Month: " +c1.showIncomeMonth());



    }

}
