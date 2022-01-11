
public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        //a)
        Punkt punktA = new Punkt(7);
        System.out.println(punktA);
        //b
        Punkt punkt = new Punkt(1,2,3);
        System.out.println(punkt);
        //c
        punkt.setpX(2);
        punkt.setpY(3);
        punkt.setpZ(6);
        System.out.println(punkt);
        //d
        System.out.println(punkt.getpX());
        System.out.println(punkt.getpY());
        System.out.println(punkt.getpZ());
        //e
        System.out.println(punkt.suma());
        System.out.println(punkt.roznica());
        System.out.println(punkt.roznica(2,4,10));

    }
}