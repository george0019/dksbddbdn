
public class UserImpl implements User {

	//Made password field as String for simplicity. In real code it's better to user char[] for storing passwords.
	private String password;

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UserImpl user = (UserImpl) o;

		return password.equals(user.password);
	}

	@Override
	public int hashCode() {
		return password.hashCode();
	}
}
