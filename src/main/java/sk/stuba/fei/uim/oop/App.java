package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
            int[] pole = new int [10];

            for (int i=0;i<pole.length;i++){
                pole[i]=i;
            }

        for (int i=0;i<pole.length;i++){
            App.vypis(pole[i]);
        }
      }
    public static void vypis(int a){
        System.out.println(a);
    }
    }

