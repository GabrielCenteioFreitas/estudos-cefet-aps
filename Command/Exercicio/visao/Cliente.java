package visao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Scanner;

import controle.Invoker;

public class Cliente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String comando = "";

		while (!comando.equals("Sair")) {
			String input = scanner.nextLine();

			Pattern pattern = Pattern.compile("^(.*?\\bClientes?\\b)(?:\\s+(.*))?$");
			Matcher matcher = pattern.matcher(input);

			if (matcher.find()) {
				comando = matcher.group(1);

				String resto = matcher.group(2);
				String[] listaArgs = resto == null ? new String[0] : resto.split("\\s+");

				Invoker.invoke(comando, listaArgs);
			}
		}

		scanner.close();
	}
}
