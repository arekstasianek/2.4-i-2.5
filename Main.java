import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] liczby = new int[10];

        
        for (int i = 0; i < 10; i++) {
            liczby[i] = (int) (Math.random() * 101);
        }
        System.out.println("Wybierz operację do wykonania:");
        System.out.println("1 - Oblicz pole prostokąta");
        System.out.println("2 - Oblicz pole trójkąta prostokątnego");
        System.out.println("3 - Oblicz średnią");
        System.out.println("4 - Oblicz medianę");
      
        System.out.println("Wczytane liczby: " + Arrays.toString(liczby));
        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1:
                 System.out.println("Podaj długość pierwszego boku");
                 int bok1 =scanner.nextInt();
                 System.out.println("Podaj długość drugiego boku");
                 int bok2 = scanner.nextInt();
                 int wynik = bok1 * bok2; 
                 System.out.println("Pole wynosi:" + wynik);
                 break;
            case 2:
                System.out.println("Podaj długość podstawy");
                int podstawa = scanner.nextInt();
                System.out.println("Podaj wysokość");
                int wysokosc = scanner.nextInt();
                double wynik2 = 0.5 * podstawa * wysokosc; 
                System.out.println("Pole wynosi:" + wynik2);
                break;
            case 3:
                
                int suma = 0;
                for (int liczba : liczby) {
                    suma += liczba;
                }
                double srednia = (double) suma / liczby.length;
                System.out.println("Średnia wynosi: " + srednia);
                break;
            case 4:
               
                Arrays.sort(liczby);
                double mediana;
                if (liczby.length % 2 == 0) {
                    mediana = (double) (liczby[liczby.length / 2] + liczby[liczby.length / 2 - 1]) / 2;
                } else {
                    mediana = (double) liczby[liczby.length / 2];
                }
                System.out.println("Mediana wynosi: " + mediana);
                break;
            default:
                System.out.println("Niepoprawny wybór");
        }

        
        scanner.close();
    }
}