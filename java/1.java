import java.util.Scanner;
class StartClass 
{
   public static void main(String[] args) 
   {
      int num1;     
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите две цифры");
      num1 = reader.nextInt();
      reader.close();
      double summ = 0.5*num1*(num1+1);
      System.out.print(summ);  
   }
}