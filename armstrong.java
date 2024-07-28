import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        armstrong a=new armstrong();
        String digits=a.calculate(x);
        System.out.println(digits);
    }
String calculate(int n)
{
    int l,d=0,N=n,arm=0,x=n;
    String t="true",f="false";
while(n>0)
{
l=n%10;
n=n/10;
d++;
}
for(int i=0;i<d;i++)
{
l=N%10;
N=N/10;
arm=(int) (Math.pow(l, d)+arm);
}

if (x==arm) 
return t;
else
return f;    


}
}
