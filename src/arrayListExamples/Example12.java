package arrayListExamples;

public class Example12 {
	
    public static void main(String[] args) {      
          
        int my_Array [] = {9, 7, 1, 4, 2, 7, 1, 8, 3, 6};   
          
        System.out.println("Dublle elements in array are: ");  
        for(int i = 0; i < my_Array.length; i++) {  
            for(int j = i + 1; j < my_Array.length; j++) {  
                if(my_Array[i] == my_Array[j])  
                    System.out.println(my_Array[j]);  
            }  
        }  
    }  
}  


