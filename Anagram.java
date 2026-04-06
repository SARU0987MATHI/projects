public class Main{
    public static void main(String[] args){
        int numbers={1,2,3,4,5};
        int length=numbers.length;
        int lowestNumber=numbers[0];
        for(int num:numbers){
            if(lowestNumber>num){
                lowestNumber=num;
            }
            System.out.println("lowest number:"+lowestNumber);
        
        }
    }
}
        
