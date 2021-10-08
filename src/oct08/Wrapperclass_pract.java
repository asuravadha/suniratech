package oct08;

public class Wrapperclass_pract {
    int data;
    public static void main(String[] args){
        Integer intdata=123456;
        Double doubledata=1232.34324;
        Character chardata='A';
        String stringdata="d123";
        for(char i:intdata.toString().toCharArray()){
            System.out.println(i);
        }
    }
}
