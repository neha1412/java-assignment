public class computation {

    public int sumofNumbers(int num1, int num2) {
        return (num1 + num2);
    }

    public int subtractionOfNumbers(int num1, int num2) {
        if (num1 > num2)
            return (num1 - num2);
        else
            return (num2 - num1);
    }

    public int productOfNumbers(int num1, int num2) {
        return (num1 * num2);
    }

    public int divisionOfNumbers(int num1, int num2) {
        try {
            if (num1 > num2 && num2 != 0)
                return (num1 / num2);
            else if (num2 > num1 && num1 != 0)
                return (num2 / num1);
            }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return(0);
    }

    public String numberPair(int num1, int num2){
        return "{"+num1+","+num2+"}" ;
    }
}
