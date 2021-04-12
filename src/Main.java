import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int X[] = new int[50];
      //  CRectangle rect1 = new CRectangle();

       CRectangle rect = new CRectangle(5, 6);
       Fun(rect);
    //   int y = 6;
      // Fun(y);

//        CRectangle rect1 = new CRectangle();
//        Scanner input = new Scanner(System.in);
//        double hh = input.nextDouble();
//
//        rect.settHight(hh);
//        double ww = input.nextDouble();
//        rect.setWidth(ww);
//        double a = rect.getArea();
//        CRectangle.Shape();
//        PrintWriter output = new PrintWriter(System.out, true);
//        output.println(a);

        //System.out.println(y);
        System.out.println(rect);


    }

    public static void Fun(CRectangle r){
        r.setWidth(8);

    }
//    public static void Fun(int x){
//        x = 8;
//
//    }




}
//this, shape, overloading, loop






