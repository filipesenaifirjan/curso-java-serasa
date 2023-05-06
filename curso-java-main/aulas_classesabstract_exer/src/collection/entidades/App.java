package collection.entidades;

import java.util.ArrayList;
import java.util.Arrays;
/*import java.util.HashMap;*/
/*import java.util.HashSet;*/
import java.util.List;
/*import java.util.Map;*/
/*import java.util.Set;*/


public class App {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
	  Aluno aluno1 = new Aluno ("Jose da Silva", "Quimica", 10);
		Aluno aluno2 = new Aluno ("Mario", "Fisica", 9);
		Aluno aluno3 = new Aluno ("Maria", "Matematica", 8);
		Aluno aluno4 = new Aluno ("Marta", "Quimica", 10);
		
		//Para adicionar elementos a lista ,usa-se o metodo add()
		
		
		alunos.addAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));
		
		System.out.println("aluno:" +alunos.get(0));
		
		alunos.remove(aluno3);
		
		System.out.println("Tamanho da lista:" + alunos.size());
		
		
		System.out.println("Contém:" + alunos.contains(aluno3));
		
		alunos.remove(aluno3);
		
		for(Aluno aluno : alunos) {
		 System.out.println(aluno.getNome());
			
		}
		System.out.println();
		
		alunos.add(aluno4);
		if(!alunos.isEmpty()) {
			alunos.forEach(aluno -> System.out.println(aluno.getNome()));
		}
		
		/*Set<String> alunos = new HashSet<String>();
		alunos.add("Jose");
		alunos.add("Mario");
		alunos.add("maria");
		alunos.add("Marta");
		
		Map<String, Aluno> mapa= new HashMap<>();
		
		Aluno aluno1 = new Aluno ("Jose da Silva", "Quimica", 10);
		Aluno aluno2 = new Aluno ("Mario", "Fisica", 9);
		Aluno aluno3 = new Aluno ("Maria", "Matematica", 8);
		Aluno aluno4 = new Aluno ("Marta", "Quimica", 10);
		
		mapa.put("jose", aluno1);
		mapa.put("Mario", aluno2);
		mapa.put("Maria", aluno3);
		mapa.put("Marta", aluno4);*/
		
		
		
	}	
		
	

	}


