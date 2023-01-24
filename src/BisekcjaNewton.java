import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class BisekcjaNewton {

            public static void program(){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Wprowadz epsilon: ");
                double epsilon = scanner.nextDouble();
                System.out.print("Wprowadz maksymalna liczbe iteracji: ");
                int maxIteracje = scanner.nextInt();
                System.out.print("Wprowadz dolna granice zakresu: ");
                double a = scanner.nextDouble();
                System.out.print("Wprowadz gorna granice zakresu: ");
                double b = scanner.nextDouble();

                int iteracje = 0;
                double s = 0;
                double fs = 0;
                while (iteracje < maxIteracje) {
                    s = (a + b) / 2;
                    fs = pow(s,4) + 5 * pow(s,2) - 3 * s - 15;
                    System.out.println("Iteracja nr: " + (iteracje + 1) + " S: " + s + " Wartosc funkcji: " + fs);iteracje++;
                    if(abs(fs)>epsilon) {
                        if (fs * (pow(a,4) + 5 * pow(a,2) - 3 * a - 15) < 0) {
                            b = s;
                        } else {
                            a = s;
                        }
                    }
                    else {
                        break;
                    }
                }
                System.out.println("S: " + s);
                System.out.println("Wartosc funkcji w punkcie S " + fs);
                System.out.println("Liczba wykonanych itearcji " + iteracje);
            }
        }



