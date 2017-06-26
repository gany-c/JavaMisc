/*— Nested String tokenizers seem to create weird problems, 
—— resolves by wrapping the higher token in new String() - will it cause a memory issue?
https://stackoverflow.com/questions/691184/scanner-vs-stringtokenizer-vs-string-split
Below seems to be working fine*/

import java.util.StringTokenizer;

public class TokenTester {
    
    public static final String TOP_DELIMITER = "|";
    public static final String SUB_DELIMITER = "#";
    public static final String SUB_SUB_DELIMITER = ",";
    
    public static void main(String[] args){
        System.out.println("In TokenTester");
        
        String input = "first,1#section,2|second,3#section,4|third,5#section,6";
        StringTokenizer tokenizer1 = new StringTokenizer(input,TOP_DELIMITER);
        
        while (tokenizer1.hasMoreTokens()){
            
            String topToken = tokenizer1.nextToken();
            System.out.println("topToken = "+topToken);
            
            StringTokenizer tokenizer2 = new StringTokenizer(topToken, SUB_DELIMITER);
            
            while(tokenizer2.hasMoreTokens()){
                
                String subToken = tokenizer2.nextToken();
                System.out.println("subToken = "+subToken);
                
                StringTokenizer tokenizer3 = new StringTokenizer(subToken, SUB_SUB_DELIMITER);
                
                while(tokenizer3.hasMoreTokens()){
                    String subSubToken = tokenizer3.nextToken();
                    System.out.println("subSubToken = "+subSubToken);
                }
            }
            
            
        }
    }

}
