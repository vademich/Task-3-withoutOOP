public class Main {
    public static void main(String[] args){
        System.out.println("Задача 3 без ООП");
        double r1 = 8;
        double R2 = 10;
        System.out.println("Площадь 1 фигуры = " + figure1(r1, R2));
        System.out.println("Площадь 2 фигуры = " + figure2(r1, R2));
        System.out.println("Площадь 3 фигуры = " + figure3(r1, R2));
    }
    public static double corner(double R2){
        return (4 * R2 * R2 - Math.PI * R2 * R2) / 8;
    }
    public static double ring(double r1, double R2){
        return (Math.PI * R2 * R2 - Math.PI * r1 * r1) / 8;
    }
    public static double center(double r1){
        return Math.PI * r1 * r1 / 8;
    }
    public static double figure1(double r1, double R2){
        return 4 * corner(R2) + 3 * center(r1);
    }
    public static double figure2(double r1, double R2){
        return corner(R2) + ring(r1, R2) + 6 * center(r1);
    }
    public static double figure3(double r1, double R2){
        return 2 * corner(R2) + 6 * ring(r1, R2) + 2 * center(r1);
    }    
}
