import javax.swing.JOptionPane;

public class Hostlite extends Student {
private int hostelno, roomno, hfee;
Hostlite()
{
	super();
hostelno=roomno=hfee=0;

}
Hostlite(Hostlite ob)
{
	super(ob);
	hostelno=ob.hostelno;
	roomno=ob.roomno;
	hfee=ob.hfee;
}

void set()
{
super.set();
String hostelno=JOptionPane.showInputDialog("Enter the hostel no: ");
String roomno=JOptionPane.showInputDialog("Enter the roomno: ");
String hfee=JOptionPane.showInputDialog("Enter the hostel fee: ");
this.hostelno=Integer.parseInt(hostelno);
this.roomno=Integer.parseInt(roomno);
this.hfee=Integer.parseInt(hfee);
}


String get()
{
super.get();
String data=super.get()+"\t This student is hostlite \nThe hostel number is: \t"+hostelno+"\nThe room number is:\t"+roomno+"\nThe hostel fee is\t"+hfee;
return data;
}

double fee()
{
	return (hfee+super.fee());
}

double feeCalculation()
{

return fee();
}
}
