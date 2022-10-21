import javax.swing.JOptionPane;

public class DayScholar extends Student

{
	private int Busno;
	private double transportFee;
	
	DayScholar()
	{
		super();
		Busno=0;
		transportFee=0;
	}
	DayScholar(DayScholar ob)
	{
		super(ob);
		Busno=ob.Busno;
		transportFee=ob.transportFee;
	}
	
	void set()
	{
		super.set();
		String Busno=JOptionPane.showInputDialog("Enter the bus number: ");
		this.Busno=Integer.parseInt(Busno);
		String transportFee=JOptionPane.showInputDialog("Enter the Transport Fee: ");
		this.transportFee=Double.parseDouble(transportFee);
	}
	
	String get()
	{
		String data=super.get()+"\nThe bus number: \t"+Busno+"\nThe transport fee is: \t"+transportFee;
		return data;
	}
	
	double fee()
	{
		return ( transportFee+super.fee());
	}

	double feeCalculation()
	{
	
	return fee();
	}

}
