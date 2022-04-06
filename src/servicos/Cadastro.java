Package Miniflix 
import java.util.Scanner;

public class Cadastro{

	public static void main (Srting[] args){
	Scannner nome = new Scanner (Systen.in);
    Scannner idade = new Scanner (Systen.in);
    Scannner login = new Scanner (Systen.in);
    Scannner senha = new Scanner (Systen.in);
    Scannner ddb = new Scanner (Systen.in);
    Scannner versao = new Scanner (Systen.in);
    Scannner email = new Scanner (Systen.in);
	String str;
	
	Systen.out.println("Criar Conta MiniFlix");

	Systen.out.Println("Nome: ");
	str = nome.nextLine();

	Systen.out.Println(str);
	Systen.out.Println("Idade: ");
	str = idade.nextLine();

    Systen.out.Println("Email: ");
	str = email.nextLine();

    Systen.out.Println("Login: ");
	str = login.nextLine();

    Systen.out.Println("Senha: ");
	str = senha.nextLine();

    Systen.out.Println("Dados Bancarios: ");
	str = ddb.nextLine();

    Systen.out.Println("Versão: ");
	str = versao.nextLine();
	
	login.close();
	}
}
