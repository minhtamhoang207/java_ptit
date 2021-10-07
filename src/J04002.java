import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h= Integer.parseInt(sc.next());
        int w= Integer.parseInt(sc.next());
        String color = sc.next();
        Rectangle rt = new Rectangle(h,w,color);
        System.out.println(rt);
    }
}

class Rectangle{
    int height;
    int width;
    String color;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    private int findPerimeter(){
        return (height+width)*2;
    }

    private int findArea(){
        return height*width;
    }

    private String color(){
        return color.substring(0,1).toUpperCase()+color.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        if(height<=0 || width<=0){
            return "INVALID";
        } else {
           return findPerimeter() + " " +
                    findArea() + " " +
                    color();
        }
    }
}
