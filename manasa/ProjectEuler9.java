public class ProjectEuler9 {
    public static void main(String[] args) {
    int a=0,b=0,c=0;
    int sum=1000;
    boolean found=false;
    for(a=1;a<sum/3;a++)
    {
        for(b=a;b<sum/2;b++)
        {
            c=sum-a-b;
            if(a*a+b*b==c*c && a<b && b<c && a+b+c==1000)
            {

                found=true;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                break;
            }
        }

    }

    }
}
