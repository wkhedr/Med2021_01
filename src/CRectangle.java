public class CRectangle {
    private double h,w;

    public CRectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    public CRectangle(){

}

    public void settHight(double h1){
        if(h1>0){
            h=h1;
        } else{
            System.out.println("Please enter positive number");
        }

    }
    public void setWidth(double w1) {
        if(w1>0){
            w=w1;
        } else{
            System.out.println("Please enter positive number");
        }

    }
    public double getArea()
    {
        return h*w;
    }

    public static void Shape(){
        System.out.println("Rectangle");
    }


}
