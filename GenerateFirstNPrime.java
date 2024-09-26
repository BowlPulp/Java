import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int m = scan.nextInt();
      	int c = 1; //counter which shouldn't go over m;
      	for(int i=2;i<=n;i++){
          if(c>m){
          break;
        }
         int count =0;
         for(int j=2;j<i;j++){
           if(i%j==0){
             count++;
             break;
           }
         }
          if(count==0){
            System.out.println(i);
            c++;
          }
        }
    }
}
