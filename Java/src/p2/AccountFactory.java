package p2;

public class AccountFactory {
public Account openSavings(String holder) {
	return new Savings(holder);
}
public Account openCurrent(String holder)
{
	return new Current(holder);
}
}
