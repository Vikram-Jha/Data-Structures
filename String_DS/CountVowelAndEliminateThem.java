import java.util.Scanner;

public class CountVowelAndEliminateThem {
    public static void main(String[] args) {
        String vWord2 = "11065666797989911210110177";
        int step = 2;
        var result2 = new StringBuilder();

        for (int i = 0; i < vWord2.length(); i += step)
        {
            if (Integer.TryParse(vWord2.substring(i, step), out int n) && n < 127)
                {
                    if (n <= 12 & i == 0) {
                    i = -3; step = 3; ;
                }
            else if(n <= 12 & i >= 2) {
            step = 3; i -= step;
            }
        else {
            result2.append((char)n);
            if (step == 3) ++i;
            step = 2;
        }
    }
    else {
        System.out.println(vWord2.substring(i, step)+ "is not a vaid input");
        break;
    }
    }
        System.out.println("Result string: "+ result2.toString());
    }
    
}
