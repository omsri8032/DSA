import java.util.Scanner;

public class demp {

    public static void main(String Args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        demp d = new demp();
        d.fun(n);

    }

    void fun(int n) {

      


int index=64;
for(int i=1;i<=n;i++)
{
  //space HERE
  for(int j=n-i;j>=0;j--)
  {
    System.out.print(" ");
  }
  //stars
  for(int j=1;j<=2*i-1;j++)
  {
    int bp=((2*i)-1)/2;
    int alp=64+j;
    if(j>=(bp))
   {alp--;}
   else
   {
    alp++;
   }
   
    System.out.print((char)alp);
  }
  //space
  for(int j=n-i;j>=0;j--)
  {
    System.out.print(" ");
  }



  System.out.println();
}
}
}