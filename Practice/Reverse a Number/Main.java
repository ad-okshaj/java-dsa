public class Main{
    public static void main(String[] args) {
         System.out.println(reverse(12344454));
        }
        public static int reverse(int number){
            int reverse = 0, digit = 0;
            while(number!=0){
                digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
            }
            return reverse;
        }
    }