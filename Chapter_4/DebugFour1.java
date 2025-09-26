import java.util.Scanner;

class DebugFour1 {
   private int radius;
   private int diameter;
   private double area;

   public DebugFour1(int radius) {
      this.radius = radius;
      this.diameter = radius * 2;
      this.area = Math.PI * radius * radius;
   }

   public int getRad() {
      return radius;
   }

   public int getDiam() {
      return diameter;
   }

   public double getArea() {
      return area;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int radius;
      DebugFour1 c;
      System.out.print("Enter a radius for a circle >> ");
      radius = input.nextInt();
      c = new DebugFour1(radius);
      System.out.println("The radius is " + c.getRad());
      System.out.println("The diameter is " + c.getDiam());
      System.out.println("The area is " + c.getArea());
      input.close();
   }
}
