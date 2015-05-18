public class Account {

	private int m_accountId = -1;
	private String m_accountName;
	private int m_customerId = -1;
	private double m_amount = 0.0;
	private String GetAccountId;

	public Account(int accountId, String accountName, int customerId)
	{
		SetAccountId(accountId);
		SetAccountName(accountName);
		SetCustomerId(customerId);
	}
	private void SetCustomerId(int customerId) {

	}
	public int GetAccountId()
	{
		return m_accountId;
	}
	private void SetAccountId(int accountId)
	{
		m_accountId = accountId;
	}

	public String GetAccountName()
	{
		return m_accountName;
	}

	private void SetAccountName(String accountName)
	{
		m_accountName = accountName;
	}

	private  void UpdateAmount(double newAmount)
	{
		SetAmount(newAmount);
	}
	private void SetAmount(double newAmount) 
	{			
	}
	public void UpdateAmountSecurely(double newAmount, String password)
	{

		if (password != null) 
		{
			if (password.equals("admin"))
			{
				UpdateAmount(newAmount);			
				System.out.println("Updated amount in account id " + m_accountId + " to " + m_amount);
			}
			else
			{
				System.out.println("Call the police! Unsecure access!!");
			}
		}
	}
	public int getM_customerId() 
	{
		return m_customerId;
	}
	public void setM_customerId(int m_customerId) 
	{
		this.m_customerId = m_customerId;
	}
	public String GetAmount() {
		return null;
	}
	public String getGetAccountId() {
		return GetAccountId;
	}
	public void setGetAccountId(String getAccountId) {
		GetAccountId = getAccountId;
	}




}
