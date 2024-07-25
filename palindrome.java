import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        palindrome p=new palindrome();
        boolean output=p.fun(x);
        System.out.println(output);
    }

boolean fun(int x) {
    int N=x;
    int n=x;
int count=0;
double rem;
double rn=0;
    if (x<0||x<=Math.pow(-2,31)||x>=(Math.pow(2,31)-1)){
        return(false);
    }
    else
    {

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
    }
    if (x==rn) {
        return(true);
        
    }
    else
    return(false);


}
}
