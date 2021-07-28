package com.generation28.Juntes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello()
	{
		return "\t\t******Hello, Generation!!!******\t\t"
				+ "\n\t\tMentalidades e habilidades: \n"
				+ "\nPara a relaização dessa atividade a mentalidade de persistência"
				+ "\nfoi muito utilizada, juntamente com as 'Mentalidade de Crescimento' e"
				+ "\n 'Responsabilidade pessoal'."
				+ "\nTambém foi muito utilizada a habilidade de 'Atenção aos Detalhes"
				+ "\n####################################################################\n"
				+ "\n\n"
				+ "\n\t\tOBJETIVOS DE APRENDIZAGEM\n"
				+"\n- Começar a dominar com mais eficiência o "
				+ "\nvocabulário de programação;"
				+ "\n- Dominar a construção de uma aplicação;"
				+ "\n- Entender cada etapa para a construção das camadas"
				+ "\n- Aprender a fazer pesquisas e pedir ajuda;"
				+ "\n- Não desistir."; 
	}
	
}