import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count =1;
        int sum=0;
        while(count<=5){
            System.out.println("Enter number #"+count +": ");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                sum+=number;
                count +=1;
            }
            catch (NumberFormatException nfe){
                System.out.println("Invalid Massage");
            }


        }
        System.out.println("Sum = : "+ sum);
    }
}
