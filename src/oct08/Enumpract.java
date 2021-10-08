package oct08;

public class Enumpract {
    enum list{
        signup,signin,auth
    }
    public static void main (String args[]){
        //to import a perticular enum value
        list value=list.signin;
        // to trigger operation based on the enum values
        switch(value){
            case signup:
                System.out.println("signup is triggered");
                break;
            case signin:
                System.out.println("signin is triggered");
                break;
            case auth:
                System.out.println("auth is triggered");
                break;
            default:
                System.out.println("invalid selection");
                break;
        }
//to traverse through the enum values
        for(list value1:list.values()){
            System.out.println(value1);
        }
    }

}
