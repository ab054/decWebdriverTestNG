import org.testng.annotations.Test;

public class CodeEx {

    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if(eachChar== 'l') result++;
        }
        System.out.println("number of letters l is " + result);
    }



}
