import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
  	public static int isKapre(int num){
      int sqr, sum = 0, c= 1, a=0, b=0;
      sqr = num*num;
      int temp = num;
      while(temp!=0){
        c=c*10;
        temp = temp/10;
      }
     a=sqr%c;
     b = sqr/c;
     sum = a+b;
	if(sum == num){
      return 1;
    }
      else {
       return 0;
      }
    }
  
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      
      	for(int i=0;i<n;i++){
          int temp = scan.nextInt();
          System.out.println(isKapre(temp));
        }
    }
}
