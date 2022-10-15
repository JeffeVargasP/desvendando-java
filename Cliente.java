public class Cliente {
     private String name;
     private int age;
     private double incomeMonth;

    void changeName(String name){
        this.name = name;
    }

    void changeAge(int age){
        this.age = age;
    }

    void changeIncomeMonth(double incomeMonth){
        this.incomeMonth = incomeMonth;
    }


    String consultName(){
        return this.name;
    }

    int showAge(){
        return this.age;
    }

    double showIncomeMonth(){
        return this.incomeMonth;
    }

}
