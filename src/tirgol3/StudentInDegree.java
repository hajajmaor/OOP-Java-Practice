package tirgol3;
/*
 * סטודנט בתואר
 *  ת.ז. שם,מערך קורסים,גובה,משקל גיל
 * ת.ז. תקינה- ישראל ספרת זיהוי מספר 9
 * משקל - 40 עד 250 
 * גיל גדול מ15 עד 130
 * גובה - 60 עד 230
 */
public class StudentInDegree {
	
	//תכונות
	private int ID;
	private String name;
	private Course[] courses;
	private double height;
	private double weight;
	private double age;

	
	public StudentInDegree(int ID,String name,double height,
			double weight,double age) {
		
	
		//private Course[] courses; - תלמדו בהמשך!!!!!
		setHeight(height);
		setAge(age);
		setName(name);
		setWeight(weight);
		this.ID=ID;
	}
	
	
	public void setHeight(double newHeight) {
		if(newHeight<60) {
			System.out.println("value too low");
			this.height=60;
		}
		else
			if(newHeight>230) {
				System.out.println("value too high");
				this.height=230;
			}
			else
				this.height=newHeight;
	}
	
	public void setWeight(double newWeight) {
		if(newWeight>40) {
			this.weight=40;
			System.out.println("weight is lower then 40");
		}
		else
			if(newWeight>250) {
				this.weight=250;
				System.out.println("weight is bigger then 250 kg");
			}
			else
			{
				this.weight=newWeight;
				System.out.println("the weight is: "+newWeight);
			}
	}
	
	public void setAge(double newAge) {
		if (newAge<15) {
			this.age=15;
			System.out.println("age is small then 15");
		}
		else
			if(newAge>130) {
				this.age=130;
				System.out.println("age is bigger then 130");
			}
			else
				this.age=newAge;
			
	}
	
	public void setName(String newName) {
		if(this.name==null) {
			this.name=newName;
		}else {
			if(age>=18) {
				this.name=newName;
			}
			else {
				System.out.println("you are younger then 18, "
						+ "do you have a consent from your "
						+ "rabbi or a perent?");
				boolean answer=false;//scanner.nextboolean();
				if (answer==true)
					this.name=newName;
			}
				
		}
	}
}

