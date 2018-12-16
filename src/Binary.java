import java.util.Scanner;

public class Binary
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Введите бинарное число для конвертации:");

        String n=s.nextLine();

        System.out.println(Integer.parseInt(n,2));
    }
}
