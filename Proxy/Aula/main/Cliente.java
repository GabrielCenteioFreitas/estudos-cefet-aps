package Proxy.Aula.main;

import Proxy.Aula.pessoas.*;

public class Cliente {
	public static void main(String[] args) {
		
		//Cria vários objetos ProxyPessoa
		Pessoa p1 = new ProxyPessoa(1);
		Pessoa p2 = new ProxyPessoa(2);
		Pessoa p3 = new ProxyPessoa(3);
		
		//Acessa os atributos de pessoa
		System.out.println(p1.getId());
		System.out.println(p2.getId());
		System.out.println(p2.getNome());
		System.out.println(p3.getNome());
		System.out.println(p2.getNome());
		
	}
}
