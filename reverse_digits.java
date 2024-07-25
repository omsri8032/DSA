import java.util.Scanner;
import java.math.*;

public class reverse_digits {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        reverse_digits rd=new reverse_digits();
        int output=rd.fun(x);
        System.out.println(output);
    }

int fun(int x) {
    int N=Math.abs(x);
    int n=Math.abs(x);
int count=0;
double rem;
double rn=0;
while(n>0)
{
rem=n%10;
n=n/10;
count++;
}
for(int i=count;i>0;i--)
{
rem=N%10;
N=N/10;
rn=rem*(Math.pow(10, i-1))+rn;


}
double  nrn= -1* (int)rn;

if(nrn<=Math.pow(-2,31)||rn>=(Math.pow(2,31)-1))
return(0);
else if(x>0)
return((int)rn); 
else
{
return((int)nrn);
}
}
}