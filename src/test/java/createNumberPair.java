import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class createNumberPair {

    @Test
    public void getNumberPair() {

        //Arrange

            int[] inputarray = {1, 2, -1, -2, 4, 5, -9, 0, 10, 40};
            int key = 4;
            int iter1, iter2;
        computation result = new computation();

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("{1,4}");
        expectedOutput.add("{2,-2}");
        expectedOutput .add("{-1,5}");
        expectedOutput.add("{4,0}");
        expectedOutput.add("{10,40}");

        List<String> actualResult = new ArrayList<>();

        //Act

        for (iter1 = 0; iter1 < inputarray.length; iter1++) {
            for (iter2 = iter1 + 1; iter2 < inputarray.length; iter2++) {
                if(result.sumofNumbers(inputarray[iter1],inputarray[iter2]) == key)
                {
                    actualResult.add(result.numberPair(inputarray[iter1],inputarray[iter2]));
                }
                else if(result.subtractionOfNumbers(inputarray[iter1],inputarray[iter2])==key)
                {
                    actualResult.add(result.numberPair(inputarray[iter1],inputarray[iter2]));
                }
                else if(result.productOfNumbers(inputarray[iter1],inputarray[iter2])==key)
                {
                    actualResult.add(result.numberPair(inputarray[iter1],inputarray[iter2]));
                }
                else if(result.divisionOfNumbers(inputarray[iter2],inputarray[iter1])==key)
                {
                    actualResult.add(result.numberPair(inputarray[iter1],inputarray[iter2]));
                }
                }
        }

        int i=0;
        for (String expected:expectedOutput){
            System.out.println(expected);

            //Assert
            Assert.assertEquals(expectedOutput.get(i++),expected);

    }
}
}
