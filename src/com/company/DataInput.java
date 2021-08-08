package com.company;
import java.util.List;
import java.util.Scanner;


public class DataInput{

    public void getData(List<Movie> movieList) {

        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("işçi adı giriniz: ");
        customer.name = scanner.next();
        System.out.print("işçi soyadı giriniz: ");
        customer.surname = scanner.next();
        System.out.print("işçi yaşı giriniz: ");
        customer.age = scanner.nextInt();
        System.out.println("\n--------------------------");
        for (Movie movies : movieList) {
            System.out.println(movies.id + "\t" + movies.name);
        }
        System.out.println("--------------------------");

        int id = scanner.nextInt();
        for (Movie movies : movieList) {
            if (id == movies.id) {
                customer.selectedMovie = movies; // Eğer seçilen maaşın id'si movieList'teki id'lerinden birine eşitse müşterinin seçtiği maaş olarak atanıyor.
            }
        }
        if (customer.selectedMovie == null) { // listede olmayan bir id girilirse tekrar girmesi için fonksiyon tekrar çağrılıyor. geçerli bir id ise hesaplama fonk. çağrılyr.
            System.out.println("Yanlış id girildi. Tekrar deneyiniz.");
            getData(movieList);
        } else maas.calculate(customer);
    }
}