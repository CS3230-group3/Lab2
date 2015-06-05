
public class Group {
	
	Students partner;
	Students additionalPartner;
	
	public Group(Students partner, Students additionalPartner)
	{
		this.partner = partner;
		this.additionalPartner = additionalPartner;
		this.partner.setPartner(additionalPartner);
		this.additionalPartner.setPartner(partner);
	}
	
	@Override 
	public boolean equals(Object o)
	{
		if(!(o instanceof Students))
			return false;
		
		Students s = (Students) o;
		return s.firstName.equals(partner.firstName) && s.lastName.equals(partner.lastName);
	}
	
	@Override 
	public int hashCode()
	{
		return 37 * partner.firstName.hashCode() + partner.lastName.hashCode();
	}
}
