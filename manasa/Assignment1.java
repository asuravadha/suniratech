public class Assignment1 {
    public static void morseToEnglish(String[] code,String morseCode)
    {
        String[] array=morseCode.split(" ");
        System.out.print("Morse code "+morseCode+" to English is ");
        // Morse code to english
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<code.length;j++)
            {
                if(array[i].compareTo(code[j])==0)
                {
                    System.out.print((char)(j+'a')+" ");
                    break;
                }
            }
        }
    }
    public static void englishToMorse(String[] code,String englishLang,char[] letter)
    {
        System.out.print("Morse code of "+englishLang+" is ");
            for(int i=0;i<englishLang.length();i++)
            {
                for(int j=0;j<letter.length;j++)
                {
                 if(englishLang.charAt(i)==letter[j])
                 {
                     System.out.print(code[j]+" ");
                     break;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        char[] letter={'a','b','c','d','e','f',
                       'g','h','i','j','k','l',
                       'm','n','o','p','q','r',
                       's','t','u','v','w','x',
                       'y','z'};
        String[] code={ ".-","-...","-.-.","-..",".",
                        "..-","--.","....","..",".---",
                         "-.-",".-..","--","-.","---",
                         ".--.","--.-",".-.","...","-",
                         "..-","...-",".--","-..-","-.--",
                         "--.."};
        String morseCode="... .- .. .-- -...";
        String englishLang="manasa";
        morseToEnglish(code,morseCode);
        System.out.println();
        englishToMorse(code,englishLang,letter);
    }
}
