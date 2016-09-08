import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        BigInteger primo;
        BigInteger zero;
        BigInteger yourNumber;
        BigInteger resposta[];
        primo = new BigInteger("131071");
        zero = new BigInteger("0");
        
        Scanner in = new Scanner(System.in);
        String binario;
        
        while(in.hasNext()){
            binario = "";
            String entrada;
            char temp = ' ';
            while(temp != '#'){
                entrada = in.nextLine();
                temp = entrada.charAt(entrada.length() - 1);
                binario = binario + entrada;
            }

            if(binario.length() == 1) break;
            
            if (!binario.isEmpty()) binario = binario.substring (0, binario.length() - 1);
            
            yourNumber = new BigInteger(binario, 2);           
            
            /*divideAndRemainder(BigInteger val)
              Returns an array of two BigIntegers containing (this / val) followed by (this % val).
            */        
            resposta = yourNumber.divideAndRemainder(primo);
            
            if(resposta[1].compareTo(zero) == 0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
                    
        }
    }
    
}
