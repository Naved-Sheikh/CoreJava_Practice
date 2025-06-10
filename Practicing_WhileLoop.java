
    public class EvenOddUsingwhile {

        public static void main(String[] args) {
            int number=4;
            int finish=20,sum=0;
            int coumt=0;

            while (number<=finish){
                number++;

                if (!isEven(number)) {
                    continue;
                }
                if(coumt<5)
                {  sum=sum+number;
                    coumt++;
                }
                System.out.print(" "+number);


            }
            System.out.println(" ");
            System.out.println("  sum =  "+sum);
        }

        public static boolean isEven(int number) {
            if (number % 2 == 0) {
                return true;
            } else return false;

        }
    }
