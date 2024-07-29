import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        divisors d =new divisors();
        d.sumofall(N);
        
    }
void sumofall(int N)
{  
    int add=0;
for(int i=1;i<=N;i++)
{
add=add+calculate(i);
}
System.out.println(add);
}
int calculate(int n)
{
int sum=0;
for(int i=1;i*i<=n;i++)
{
   if(n%i==0)
   {
   sum=sum+i;
   if((n/i)!=i)
   {
    sum=sum+(n/i);
   }
   }
}
return sum;
}

}
