import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        count_digits cd=new count_digits();
        cd.fun(n);

    }

    void fun(int n) {
        int N=n;
        int count=0;
        int rem;
while(n>0)
{
rem=n%10;
n=n/10;

if(rem!=0&&N%rem==0)
count++;


}
System.out.println(count);

        

    }
}
