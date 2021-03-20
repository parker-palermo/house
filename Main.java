import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int intArray[];
    intArray = new int[t];
    for(int i = 0; t > i; i++)
    {
      intArray[i] = sc.nextInt();
    }
    System.out.println();
    for(int i = 0; t > i; i++)
    {
      intArray[i] = intArray[i] * 5;
      System.out.println(intArray[i]);
    }

  }
}