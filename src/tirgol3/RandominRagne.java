package tirgol3;
import java.util.Random;

public class RandominRagne {
	/*
     * TODO: 1. פונקציה שמקבלת מספר N ומערך ARR מחזירה מספר רנדומלי בין 0לN שלא קיים
     * במערך ARR מחזירה -1 אם לא נמצא מספר מעל כמות ניסיונות מסוים. הדפסה הודעה
     *הטווח הוא בין [0 - n-1] 
     *בהתאם!!! אופציה ל-1 או למספר אחר
     * n=5
     * arr =[2,3,4,2,3,1,2,3]
     * shoule return : 0
     */
	static int randomNotInArray(int n,int [] arr) {
		
		Random randomInt=new Random();
		
		for (int i = 0; i < 5; i++) {
			//random number between 0-(n-1)
			int randomNumber=randomInt.nextInt(n);
			System.out.println("random number from function is:"+randomNumber);
			
			boolean randomInArray=false;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==randomNumber) {
					randomInArray=true;
					break;
				}
			}
			if(randomInArray==false) {
				return randomNumber;
			}
			//אם המספר לא מופיע במערך, נחזיר את המספר שיצא
		}
		//אם בדקנו 5 פעמים ולא מצאנו מספר, נחזיר -1		
		return -1;
	}
	
	
	
    public static void main(String[] args) {
        
    	
    	
    	int [] arr= {2,3,4,2,3,1,2,3};
    	int n=5;
    	System.out.println(randomNotInArray(n, arr)+" is not in array");
    }
}