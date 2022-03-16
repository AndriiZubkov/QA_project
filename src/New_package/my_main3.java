package New_package;

public class my_main3 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*999);
        int a = n/100;
        int b = (n%100)/10;
        int c = n%10;
        if(a>=b&&a>=c) {
            System.out.println("В "+n+" наибольшая цифра "+a);
        } else if(b>=a&&b>=c) {
            System.out.println("В "+n+" наибольшая цифра "+b);
        } else {
            System.out.println("В "+n+" наибольшая цифра "+c);
        }
    }
}
