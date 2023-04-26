import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) throws Exception {

		String a = JOptionPane.showInputDialog("Informe seu cep: ");

		Address address = CEPService.addressSearch(a);

		System.out.println("Logradouro = " + address.getLogradouro());
		System.out.println("Bairro = " + address.getBairro());
		System.out.println("Localidade = " + address.getLocalidade());
		System.out.println("UF = " + address.getUF());
		System.out.println("DDD = " + address.getDDD());


	}

}
