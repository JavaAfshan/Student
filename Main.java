import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args)
	{
		String students=JOptionPane.showInputDialog("Enter the number of students whose data that you want to store");
		int student=Integer.parseInt(students);
		int type1=0;
		Student s[]=new Student[student];
		for(int i=0;i<student;i++)
		{
			do
			{
			String type=JOptionPane.showInputDialog("Enter 1 for hostelite student\nEnter 2 for Day Scholar ");
			type1=Integer.parseInt(type);
			if(type1==1)
			{
				Hostlite h1=new Hostlite();
				s[i]=h1;
				s[i].set();
			}
			else if(type1==2)
			{
				DayScholar d1=new DayScholar();
				s[i]=d1;
				s[i].set();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Enter the right choice");
			}
			}while(type1!=1&&type1!=2);
			
		}
		
		for(int i=0;i<student;i++)
		{
			JOptionPane.showMessageDialog(null, s[i].get()+"\nThe total fee is: \t"+s[i].feeCalculation(),"Student Number"+(i+1),JOptionPane.PLAIN_MESSAGE);
			
		}

	}

}
