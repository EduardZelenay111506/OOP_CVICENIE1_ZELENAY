package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        int cislo=1;
      while (cislo<4) {
          switch (cislo) {
              case 1:
                  System.out.println("cislo je jedna");
                  break;
              case 2:
                  System.out.println("cislo je dva");
                  break;
              default:
                  System.out.println("cislo je ine");

          }
        cislo++;
      }
    }
}
