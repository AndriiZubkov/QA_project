package New_package;

public class my_main3 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*899+100),a,b,c;
        a = n/100;
        b = (n%100)/10;
        c = n%10;
        if(a>=b&&a>=c) {
            System.out.println("В числе "+n+" наибольшая цифра "+a);
        } else if(b>=a&&b>=c) {
            System.out.println("В числе "+n+" наибольшая цифра "+b);
        } else {
            System.out.println("В числе "+n+" наибольшая цифра "+c);
        }
    }
}
