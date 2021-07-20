package javapojects;
import java.util.*;  
import oopsjavacreator.*;
 class data{
	String name; //Instance variable.
	int n;
	
	public data(String name,int n)
	{
	this.name=name;
	this.n=n;
	}
	public void Comment()
	{
		System.out.println("These information is of diffrent civil services post of India");
	}
	
}
class GOI extends data{
	GOI(String name, int n){
		super(name,n);
	}
	public void Comment() {
		System.out.println("You quried about post "+name+" from given option");
	}
	public void firstRating() {
		System.out.println("Your rating for this portal for first appearance from 0 to 10 scale is "+n);
	}
	
}
class Rating{
	public void onc(int a, String m) {
		System.out.println("After experiencing the portal, You decided to visit again- "+m+". You Rated our app on scale "+a);
	}
	public void onc(String m, int a) {   //Method overloading.
		System.out.println("After experiencing the portal, You'll recommend others- "+m+". Desire to recommend other on scale is "+a);
	}
}
interface Officer{
	void io() ;
		
	
}
class IASData implements Officer{
	public void io(){        //overriding
		System.out.println("An IAS officer is selected through UPSC exam.");
		System.out.println("Rnak in UPSC:- Rank ranges from 1 to approx 90.");
		System.out.println("Training:-Lal Bahadur Shastri National Academy of Administration(LBSNAA) located at Mussoorie  Uttarakhand.");
		System.out.println("Salary:-Ranges from 56k to 2.25L.");
		System.out.println("Post :-From SDM level to Secretary.");
		System.out.println("Other Facilities:- Vechicle, Home,Medical allowance,Travel fair,Free water and electricty.");
	}
}
class IPSData implements Officer{
public	void io() {                //overriding
	System.out.println("An IPS officer is selected through UPSC exam or may get position after promotion from state government police department.");
	System.out.println("Rank in UPSC:-1 to 236.");
	System.out.println("Training:-Training of an IPS officer happen in 4 steps.\n:->Foundation Course (3 months): Lal Bahadur Shastri National Academy of Administration (LBSNAA), Mussoorie\n:->Phase I training (Basic Course – 11 months): Sardar Vallabhbhai Patel National Police Academy (SVPNPA), Hyderabad.\n:->District Practical Training (6 months): at the respective cadre.\n:->Phase II training (1 month): Sardar Vallabhbhai Patel National Police Academy (SVPNPA), Hyderabad.");
	System.out.println("Salary:-Ranges from 56K to 2.25L.");
	System.out.println("Post :- From DSP to DGP/Director of IB/Director of CBI.");
	System.out.println("Other facilities:-Vechicle,Home,Medical allowance,Travel fair,free water and electricity. ");
}
	}
class IFSData implements  Officer{
	public void io() {                          //overriding
		System.out.println("An IFS officer is selected throuh UPSC exam.");
		System.out.println("Rank in UPSC:-1 to 130");
		System.out.println("Training:->> For 15 weeks they are trained at Lal Bahadur Shastri National Academy of Administration(LBSNAA).\n :->>For around 32 weeks they are trained at Sushma Swaraj Foreign Service Institute, New Delhi.");
		System.out.println("Salary:- Ranges from 56K to 2.25L\n");
		System.out.println("Post:-It consist of two department.\n :->At an embassy-.\n------- From Third Secretary to High comissioner or Ambadassor or UN Permanent Represntative.\n:->At  Ministry of External Affairs.-\n------- From Assistant Secretary/Under Secretary to Foreign Secretary of India. ");
		System.out.println("Other facilities:-Home,Vechicle,Security Guard,Maids, Medical allowance, Travel fair, free water and electricity");
	}
}
class IRSData implements Officer{
	public void io() {               //overriding
		System.out.println("An IRS officer is selected throuh UPSC exam.");
		System.out.println("IRS officer are of two type\n:->>IRS(IT)\n:->>IRS(C&CS).");
	}
	public void IRSIT() {
		System.out.println("This info is for IRS(IT)(Income Tax)");
		System.out.println("Rank in UPSC:- 1 to 240.");
		System.out.println("Training:->>3-month Foundation Course at the Lal Bahadur Shastri National Academy of Administration (LBSNAA).\n:->>16-month specialised training at the National Academy of Direct Taxes (NADT), in Nagpur, Maharashtr. ");
		System.out.println("Salary:- Ranges from 56K to 2.25L.");
		System.out.println("Post:-From Assistant commissioner of income tax to principal chief commissioner of income tax /  Central Economic Intelligence Bureau.");
		System.out.println("This is controlled by  Central Board of Direct Taxes (CBDT)");
		System.out.println("Other facilities:-Home/HRA, Vechicle,Medical allowance, Travel fair, free water and electricity");
	}
	public void IRSCS() {
		System.out.println("This info is about IRS(C&IT)(Custom & Indirect Taxes)");
		System.out.println("Rank in UPSC:- 1 to 260.");
		System.out.println("Training:->>3-month Foundation Course at Lal Bahadur Shastri National Academy of Administration (LBSNAA).\n:->>16 montths specialised training at National Academy of Customs Indirect Taxes and Narcotics (NACIN), in Faridabad, Haryana.");
		System.out.println("Salary:- Ranges from 56K to 2.25L.");
		System.out.println("Post:-From Assistant commissioner of Central GST/Customs to Principal chief commissioner of Central GST/Customs /CBIC chairperson.");
		System.out.println("This is controlled by  Central Board of Indirect Taxes and Customs (CBIC).");
		System.out.println("Other facilities:-Home/HRA, Vechicle,Medical allowance, Travel fair, free water and electricity");
	}
}
class OtherCentralServices{
	private void msg() {     //Control mechanism eg.
		System.out.println("This comment will be not executed as by obj calling in other calss. It is private.");
	}
	protected void mes() {
		System.out.println("This pogramm will give info about Central Service Group A post");
	}
	public void ccs() {
		System.out.println("We provide detail info abt few speciall post.");
	}
}
class engineer extends OtherCentralServices{            //Inheritance
	 public void rtr() {
		 System.out.println("There are various job opportunity for enginnering background candidates.");
		 System.out.println("Posts are:- Border Roads Engineering Services (BRES).\n         :-Central Architects Service (CAS).\n         :-Central Engineering (Civil) Service.\n         :-Central Engineering (Electrical and Mechanical) Service.\n         :-Central Power Engineering Service (CPES).\n         :-Defence Aeronautical Quality Assurance Service (DAQAS).\n         :-Defence Research & Development Service (DRDS).");
		 System.out.println("   And there are  many more.");
		
	 }
}
class  medical extends OtherCentralServices{    //Inheritance
	public void rte() {
		System.out.println("There are various job opportunity for medical background candidates.");
		System.out.println("Posts are:- Border Security Force Health Service (BSFHS).\n         :-Central Reserve Police Health Service (CRPHS).\n         :-Indian Ordnance Factories Health Service (IOFHS).\n         :-Indian Railway Medical Services (IRMS).\n         :-Indo-Tibetan Border Police Health Service (ITBPHS) .");
		System.out.println("   And there are many more.");
	}
}
class railway extends engineer{                //Multilevel Hierarchy 
	public void erw() {
		System.out.println("This info is about Indian Railways Service of Engineers (IRSE) post.");
		System.out.println("UPSC rank:- 1 to 600.");
		System.out.println("Training:- The initial and refresher training  is done at  Indian Railways Institute of Civil Engineering, Pune ");
		System.out.println("Salary:- Range from 56K to 1.7L");
		System.out.println("Post:- DEN (Divisional Engineer) to Principal Executive Directors (Rank of joint secretary).");
		System.out.println("Other facility:- Home,Free train travel all over India,Medical allowance.");
	}
}
class Railways extends medical{     //Multilevel Hierarchy 
	public void tyu() {
		System.out.println("This info is about Indian Railway Health Service(IRHS) post");
		System.out.println("Selection ids done by UPSC through  Combined Medical Services Examination exam.");
		System.out.println("Training:- Full training is done at National Academy of Indian Railways,Lalbaug Vadodara. ");
		System.out.println("Salary:-Range from 56K to 2L");
		System.out.println("Post:- Assistant Divisional Medical Officer (ADMO) to Director General- Railway Health Service (DG/RHS).");
		System.out.println("Other facility:- Home, Medical treatment, Free train travel all over India, Water and electriocity free.");
	}
}
abstract class ramn{   //abstract class.
	abstract void ram();
}
class erty extends ramn{
	void ram() {
		System.out.println("Enter your choice 'Post' or 'Career'.");
	}
	void shyam() {
		System.out.println("Enter your choice 'Engineering' or 'Medical'.");
	}
}
class exer  extends Thread     //Threading
{
	public void run() {
		System.out.println("Thanks for your valuable suggestion.");
	try {	Thread.sleep(5000);}
	catch(InterruptedException e){
		System.out.println("Exception is caught "+e);
		}   
		
		System.out.println("Our programm is ending..");
		System.out.println("Our programm ended.");
	}
}

public class PublicServiceData {
public static void main(String[] args)
{
	try {      //Exception handling
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to our Civil Service post information portal.\nWe are happy to help you.");
	System.out.println("We provide detail info about few posts and provide career option in few field.");
	System.out.println("Options we have:-IAS, IPS, IFS, IRS(IT), IRS(C&IT).");
	System.out.println("Career in civil services are for Medical and Engineer");
	erty A1=new erty();
	A1.ram();
	
	String ob1=sc.next();
	if("Post".equals(ob1)) {
		System.out.println("Enter the post mentioned above.");
		String ob3=sc.next();
		System.out.println("Rate this portal for first appearance on scale 1 to 10.");
		int e=sc.nextInt();
		GOI A2=new GOI(ob3,e);
		A2.Comment();
		A2.firstRating();
		if("IAS".equals(ob3)) {
			IASData A3=new IASData();
			A3.io();
		}
		else if("IPS".equals(ob3)) {
			IPSData A4=new IPSData();
			A4.io();
		}
		else if("IFS".equals(ob3)) {
			IFSData A5=new IFSData();
			A5.io();
		}
		else if("IRS".equals(ob3)) {
			IRSData  A6=new IRSData(); 
			System.out.println("Enter the IRS department Income Tax(IT) orCustom(C&IT.)\n Use only short form for entry.");
			System.out.println();
			String ob4=sc.next();
			if("IT".equals(ob4)) {
				A6.IRSIT();
			}
			else if("C&IT".equals(ob4)) {
				A6.IRSCS();
			}
			else {
				System.out.println("You entered invalid input.");
			}
		}
		else {
			System.out.println("Sorry! Either your input is invalid or we don't possess that data.");
		}
	}
	else if("Career".equals(ob1)) {
		A1.shyam();
		String ob5=sc.next();
		
		if("Engineering".equals(ob5)) {
			railway A7=new railway();
			A7.mes();
			System.out.println();
			A7.ccs();
			System.out.println();
			A7.rtr();
			System.out.println();
			A7.erw();
			System.out.println();
		}
		else if("Medical".equals(ob5)) {
			Railways A8=new Railways();
			A8.mes();
			System.out.println();
			A8.ccs();
			System.out.println();
			A8.rte();
			System.out.println();
			A8.tyu();
			System.out.println();
		}
		else {
			System.out.println("For "+ob5+" field you can choose any service area except medical or engineering field.");
		}
	}
	else {
		System.out.println("Invalid input.");
	}
	System.out.println("Your valuable feedback is required.\n It wouldn't take much time.\n Please help us to improve!!");
	System.out.println();
	System.out.println("Please answer few questions.");
	System.out.println();
	System.out.println("1.Rate on scale of 0 to 10 after using this portal");
	int ob2=sc.nextInt();
	System.out.println();
	System.out.println("2.Would you love to visit again?");
	String obj6=sc.next();
	System.out.println();
	System.out.println("3.Would you recommend other to use this portal?");
	String obj7=sc.next();
	System.out.println();
	System.out.println("4.Rate your desire to recommend others on scale 0 to 10.");
	int obj8=sc.nextInt();
	System.out.println();
	Rating A9=new Rating();
	A9.onc(ob2,obj6);
	System.out.println();
	A9.onc(obj7,obj8);
	sc.close();
	exer obj1=new exer();
	Thread obj2=new Thread(obj1);
	obj2.start();
	}
	catch(Exception e)
	{
		System.out.println("Exception "+e+ " is caught");
	}
	finally {
			creator t=new creator();
		t.Myname();
	}
	 
}
}
