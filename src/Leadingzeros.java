

public class Leadingzeros {

	public static void main(String[] args) {
	String charges="CHR;FreightCharges;CCP;00000000000110;EUR;00000000000110;EUR;CHR;CHR;TotalToBeCharged;FMI;00000000000220;EUR;00000000000220;DKK;CHR;";
	StringBuffer tmp=new StringBuffer();
	System.out.println("******BEFORE changes **********************************");
	System.out.println(charges);
		
	tmp=new StringBuffer(charges.replaceFirst("0", ""));
	System.out.println("*********AFTER changes *******************************");
	System.out.println(tmp);
	tmp=new StringBuffer("CHRGRP;").append(tmp);
	tmp=tmp.append(new StringBuffer("CHRGRP;"));
	System.out.println("final charges "+tmp);
	
	}

}
