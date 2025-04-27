
public class test {
	public static void main(String[] args) {
		developer nils = new developer("Nils", 30, "DBInfraGO", "nils.fabian@hotmail.de", 1406);
		

        System.out.println("Name: " + nils.getName());
        System.out.println("Age: " + nils.getAge());
        System.out.println("Company: " + nils.getCompany());
        System.out.println("Email: " + nils.getEmail());
        System.out.println("Id: " + nils.getId());
	}
}
