package com.intro;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello wotrld");
//        String name = "hothaifa";
//        int age = 15 ;
//        double salary = 1500.76;
//        char op = '$';
//        age = age + 1;
//        age++;
//        age += 4;
//        System.out.println(age);
//        boolean IsNine = true;
//        if (4 > 5)
//            // true block
//            System.out.println(4);
//        else
//            //false block
//            System.out.println(5);
//
//        System.out.println((4>5)? 4 : 5);
//        condion ? true  block : false block
//
//        Scanner scanner= new Scanner(System.in);
//        for (int i = 0 ; i < 60 ; i++)
//            System.out.println(i);
//        int x = 0;
//        while (x != 7)
//            x = scanner.nextInt();
//        greet("hodi");
//        Car car = new Car("audi", 1990);
//        Car car2 = new Car("cupra",2023);
//        System.out.println(car.make);
//        car2.go();
//        car.go();

//        TaxCalculator calculator = getCalculator();
//        double  x =calculator.calculateTax();
//        System.out.println(x);
//        Chef chef  = getChef();
//        System.out.println(chef.spMeal());
//        BankAccount account = new BankAccount();
//        account.setBalance(55);
//        System.out.println(account.getBalance());
//        var service = new MailService();
//        service.sendEmail();
        var car = new Car();
        car.make = "seat";

        var vehicle= new Vehicle[3];
        vehicle[0]= car;
        vehicle[1]= car;
        vehicle[2]= new Truck();

        for (var v: vehicle) {
            v.go();
        }

    }

//    public static TaxCalculator getCalculator(){
//        return new TaxCalculator2022();
//    }
//    public static Chef getChef(){
//        return new AsianChef();
//        }
}
