package fatorial;

public class Fatorial {

        public static void main(String[] args) {
        
            int num = 0; 
            int fat = 1;
            int cont = 1;
                        
            for(int i = 1; i <= num; i++) {
                
                String s = "";
                fat = fat * i;
            
            }
            
            System.out.println(num + "!" + " = " + fat);
            cont++;
            
        }
    
}
