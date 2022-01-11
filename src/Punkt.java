/* klasa Punkt */
public class Punkt {
    private int pX,pY,pZ;
    /* stworzyć zmienne prywatne pX, pY, pZ */

    public Punkt(int pX, int pY, int pZ) {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    public Punkt() {
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "pX=" + pX +
                ", pY=" + pY +
                ", pZ=" + pZ +
                '}';
    }

    public Punkt(int pX) {
        this.pX = pX;
    }

    public int getpX() {
        return pX;
    }

    public int getpY() {
        return pY;
    }

    public int getpZ() {
        return pZ*10;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }



    public void setpZ(int pZ) {
        this.pZ = pZ;
    }
    /* stworzyć
            a) pusty konstruktor,
            b) konstruktor inicjalizujacy zmienną pX,
            c) konstruktor inicjalizujący wszystkie zmienne,
            d) stworzyć settery i gettery,
            e) getter do zmiennej pZ niech zwraca return pZ * 10;
            podpowiedz ALT + INSERT można wybrać generowanie automatyczne
            konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
        */
    public int suma(){
        return pX+pY+pZ;
    }
    public int roznica(){
        return pX-pY-pZ;
    }
    public int roznica(int x,int y, int z){
        return pX*x - pY*y - pZ*z;
    }

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
}