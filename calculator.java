import java.util.*;
public class calculator_app {
    static class calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int sub(int a, int b) {
            return a - b;
        }

        public double mul(double a, double b) {
            return a * b;
        }

        public double div(int a, int b) {
            if (b == 0)
                return 0;
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator c = new calculator();
        int ch;

        do {
            System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("1.Two int\n2.Three int\n3.Two double");
                    int t = sc.nextInt();

                    if (t == 1) {
                        int a = sc.nextInt(), b = sc.nextInt();
                        System.out.println("Ans=" + c.add(a, b));
                    } else if (t == 2) {
                        int a = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt();
                        System.out.println("Ans=" + c.add(a, b, d));
                    } else if (t == 3) {
                        double a = sc.nextDouble(), b = sc.nextDouble();
                        System.out.println("Ans=" + c.add(a, b));
                    } else
                        System.out.println("Wrong");
                    break;

                case 2:
                    int a = sc.nextInt(), b = sc.nextInt();
                    System.out.println("Ans=" + c.sub(a, b));
                    break;

                case 3:
                    double x = sc.nextDouble(), y = sc.nextDouble();
                    System.out.println("Ans=" + c.mul(x, y));
                    break;

                case 4:
                    int p = sc.nextInt(), q = sc.nextInt();
                    if (q == 0)
                        System.out.println("Divide by 0 not allowed");
                    else
                        System.out.println("Ans=" + c.div(p, q));
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong");
            }
        } while (ch != 5);

        sc.close();
    }
}
