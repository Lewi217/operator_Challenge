public class operatorChallenge {
    public static void main(String[] args) {

        double num1 = 20.00;
        double num2 = 80.00;
        double result = num1 + num2;
        System.out.println("The result is " + result);

        result = result * 100;
        System.out.println(result);

        double myAnswer = result % 40.00;
        System.out.println("The remainder is "+ myAnswer);
        boolean isNoRemainder = (myAnswer == 0)? true : false;
        System.out.println("isNoRemainder= "+ isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }


    }

}
