public class ForLoop {
    public static void main(String[] args) {
        int sum=0,j=0,i;
        for (i=1; i<1000; i++){
            if (i%3==0 && i%5==0){
                j++;
                System.out.println(i+" ");
                sum = sum+i;
                if (j==5){
                    break;
                }
            }
        }
        System.out.println("the sum of those No= "+sum);
    }
}
