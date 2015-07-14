package ci.experts.bulksms.model.beans;

public abstract class Account{
	int id; //account id
	double credit; // account credit
	boolean status;
	
	public int getId(){
		return id;	
	}
	public void setId(int id){
		this.id=id;
	}
	
	public double getCredit(){
		return credit;	//comment
	}
	public void setCredit(double credit){
		this.credit=credit;
	}
	public boolean getStatus(){
		return status;
		
	}
	
	public void setStatus(boolean status){
		this.status=status;
		
	}
	

}