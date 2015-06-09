package Example;

public class Potrebitel {
	String email;
	String password;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws EmailException {
		if(email.length() < 5 || !email.contains("@") || !email.contains(".")){
			throw new EmailException("Invalid email!");
		}
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws PasswordExeption {
			if(password.length() < 6){
				for (int i = 0; i < password.length(); i++) {
					if(!Character.isDigit(password.charAt(i)))				
						throw new PasswordExeption("Invalid password!");
					}
			}
		this.password = password;
	}
	
	
}
