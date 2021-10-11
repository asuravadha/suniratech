package assignments;

public class ProjectEuler8 {
    public static void main(String[] args) {
    findProduct();

    }
    public  static  void findProduct()
    {
        for(int a=1;a<1000;a++)
        {
            for(int b=a+1;b<1000;b++)
            {
                int c=1000-a-b;
                if(a*a+b*b==c*c)
                {
                    System.out.println("Answer is :"+a*b*c);
                }
            }
        }
    }
}
