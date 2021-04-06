import java.io.PrintWriter;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int X[] = new int[50];

        CRectangle rect = new CRectangle(7, 8);
        Scanner input = new Scanner(System.in);
        double hh = input.nextDouble();

        rect.settHight(hh);
        double ww = input.nextDouble();
        rect.setWidth(ww);
        double a = rect.getArea();
        CRectangle.Shape();
        PrintWriter output = new PrintWriter(System.out, true);
        output.println(a);


        System.out.println(a);

    }

}


