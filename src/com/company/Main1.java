package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie(1, "base Salary ", "", 10_000));
        movieList.add(new Movie(2, "tax Percent", "", .02));
        movieList.add(new Movie(3, "incentive Per Hour", "", 50));
        movieList.add(new Movie(4, "bonus Hours", "", 10));



        DataInput data = new DataInput();  // işçi girişi yapılabilmesi için DataInput sınıfından nesne oluşturularak getData() fonksiyonu çağrılıyor.
        data.getData(movieList);
    }


}