import javax.swing.JOptionPane;
abstract public class Student {
private String sname, regno, address, fname,cnic;
private  double fee;
Student()
{
sname=regno=address=fname=cnic="unknown";
fee=0;
}
Student(Student ob)
{
sname=ob.sname;
regno=ob.regno;
address=ob.address;
fname=ob.fname;
cnic=ob.cnic;
fee=ob.fee;
}

void set()
{
sname=JOptionPane.showInputDialog("Enter the name of the student");
regno=JOptionPane.showInputDialog("Enter the registration number");
address=JOptionPane.showInputDialog("Enter the address of the student");
fname=JOptionPane.showInputDialog("Enter the father name of the student");
cnic=JOptionPane.showInputDialog("Enter the CNIC: ");
String fee=JOptionPane.showInputDialog("Enter the fee of the student");
this.fee=Double.parseDouble(fee);
}

String  get()
{
	String data="Student name: \t"+sname+"\n Registration Number:\t "+regno+"\nAddress: \t"+address+" \nFather Name: \t"+fname+"\n CNIC: \t"+cnic+"\nFee: \t"+fee;
	return data;
}

double fee()
{
	return fee;
	
}
abstract double feeCalculation();

}
