import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int ans = 0;
    int multi = 1;
    while(n>0){
      int digit = n%10;
      if(digit == 9){
        ans = ans + (0*multi);
      }
      else {
        ans = ans + ((digit+1)*multi);
      }
      multi = multi*10;
      n = n/10;
    }
   System.out.print(ans);
  }
}
