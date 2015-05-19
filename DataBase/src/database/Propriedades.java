package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propriedades {
	public static Properties getProp() throws IOException{
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./properties/database.properties");//Caminho do arquivo database.properties
		props.load(file);
		return props;
	}
	public static void main(String[] args) throws IOException {
		
		String cdb;
		String url;
		String login;
		String senha;
		String porta;
		
		System.out.println("-----------Teste de leitura do arquivo de propriedades--------\n");
		
		Properties prop = getProp();
		
		url   = prop.getProperty("conexao.url");
		cdb   = prop.getProperty("conexao.database");
		login = prop.getProperty("conexao.login");
		senha = prop.getProperty("conexao.senha");
		porta = prop.getProperty("conexao.porta");
		
		System.out.println("URL = "+ url);
		System.out.println("DataBase name = " + cdb);
		System.out.println("Login = " + login);
		System.out.println("Senha = " + senha);
		System.out.println("Porta = " + porta);	
	}
}
