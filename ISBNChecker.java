public class ISBNChecker{
    public static Boolean isISBN (String s){   
        int x = 0;
        int length = 0;
        int lastdigit = Character.getNumericValue(s.charAt(9));
        while (length >= 0 && length < 9){
            int y = Character.getNumericValue(s.charAt(length));
            x += y*(length+1);
            length++;
            System.out.println (x);
        }
        if (x%11 == 10 &&  s.charAt(9) == 'X' || x%11 == lastdigit){
          System.out.println ("True");
            return true;
        }
        else
            System.out.println ("False");
        return false;
    }
                                 
    public static void main (String[] args) {
        String a = "0205080057";
        String b = "0136091812";
        String c = "123456789X";
        isISBN (a);
        isISBN (b);
        isISBN (c);
    }
}
                                     
                             
                     
