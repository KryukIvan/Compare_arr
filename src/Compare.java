import java.util.Scanner;

public class Compare {
    public static void main (String[] args)
    {
        int x = 10;
        int y = 23;
        int z = 15;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int k = in.nextInt();
        int i = k;
        int arr_x [];
        arr_x = new int[i];
        int length = arr_x.length;
            for ( i = 0; i < arr_x.length; i++) {
                if ( i < length + 1) {
                    System.out.print("Введите число в массив: ");
                    int a = in.nextInt();
                    arr_x[i] = a;
                }
            }
            for ( i = 0; i < arr_x.length; i++) {
                if ( (arr_x[i] == x)|(arr_x[i] == y)|(arr_x[i] == z)) {
                    System.out.println("Данное значение имеется в константах");
                break;
                }
       // System.out.println("Массив заполнен");
            }
    }
}
