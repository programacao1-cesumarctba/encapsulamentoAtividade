package com.github.juliamello08.main;

import com.github.juliamello08.classes.Curso;

public class Programa {
	public static void main(String[] args) {
        try {
        	Curso curso = new Curso();
            curso.setNome("Julia Mello");
            curso.setProfessor("Maycon"); //tem que ser 5 dígitos
            curso.setTema("Programação I");
            curso.setValor(1000d);
        	
            System.out.println(String.format("Nome: %s \n" +
                    "Professor: %s \n" +
                    "Tema %f \n" +
                    "Valor %f \n", curso.getNome(), curso.getProfessor(), curso.getTema(), curso.getValor()));

        } catch (Exception e) {
    		e.printStackTrace();
    	}

    }
}
