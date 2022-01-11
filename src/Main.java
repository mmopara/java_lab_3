import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student student = new Student();
        student.imie = "Maciej";
        student.nazwisko = "Opara";
        student.wiek = 29;
        student.aktywny = true;

        List<Object> student1 = new ArrayList<>();
        student1.add(student.imie);
        student1.add(student.nazwisko);
        student1.add(student.wiek);
        student1.add(student.aktywny);

        for (Object lista : student1) {
            System.out.println(lista);
        }

        Student Student2 = new Student();
        student.imie = "Kamil";
        student.nazwisko = "Gralik";
        student.wiek = 30;
        student.aktywny = true;

        List<Object> student2 = new ArrayList<>();
        student2.add(student.imie);
        student2.add(student.nazwisko);
        student2.add(student.wiek);
        student2.add(student.aktywny);

        System.out.println("\n");

        for (Object lista : student2) {
            System.out.println(lista);
        }

        Student studentC = new Student();
        studentC.imie = "Grzegprz";
        studentC.nazwisko = "Krychowiak";
        studentC.wiek = 32;
        studentC.aktywny = false;

        List<Object> student3 = new ArrayList<>();
        student3.add(studentC.imie);
        student3.add(studentC.nazwisko);
        student3.add(studentC.wiek);
        student3.add(studentC.aktywny);

        System.out.println("\n");

        for (Object lista : student3) {
            System.out.println(lista);
        }

    }
}