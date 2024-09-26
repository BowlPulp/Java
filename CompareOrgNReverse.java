import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      
      for(int i=0;i<n;i++){
        StringBuilder str = new StringBuilder();
        String temp = scan.next();
        str.append(temp);
        String rev = str.reverse().toString();
        if(temp.equals(rev)){
          System.out.println("Equal");
        }
        else {
          System.out.println("Not Equal");
        }
      }
    }
}
