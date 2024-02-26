package itProger.basics.massiv;
/*
Создайте двумерный массив и выведите его на экран при помощи циклов while.
 */
public class Massiv2D {
    public static void main(String[] args) {
        int[][] x = { { 0, 34, 2 }, { 9, 12, 18, 5 }, { 3, 4, 5 } };

        int i = 0;

        while(i<x.length){
            int j = 0;
            while(j<x[i].length){

                System.out.print(x[i][j] + " ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
