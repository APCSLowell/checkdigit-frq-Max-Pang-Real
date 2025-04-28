public class CheckDigit 
{   
 
   public static int getCheck(int num) 
   {  
     int sum = 0;
     for(int i = 1; i <= getNumberOfDigits(num); i++){
        sum+=getDigit(num, i) * (8-i);
     }
     return sum%10;
   }
 
    
   public static boolean isValid(int numWithCheckDigit)    
   {      
     int checkdigit = getCheck(numWithCheckDigit%10);
     int rightdigit = numWithCheckDigit%10;
     if(checkdigit == rightdigit){
      return true;
     } else {
      return false;
     }
   }    
   
    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
  
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}
