package map.ordenacao.exercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	Map<LocalDate, Evento> eventoMap;
	
	public AgendaEventos() {
		this.eventoMap = new HashMap<LocalDate, Evento>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventoMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		if(!eventoMap.isEmpty()) {
			Map<LocalDate, Evento> eventosTreeMap = new TreeMap<LocalDate, Evento>(eventoMap);
			System.out.println(eventosTreeMap);
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public void obterProximoEvento() {	
		if(!eventoMap.isEmpty()) {
			LocalDate dataAtual = LocalDate.now();
			LocalDate proximaData = null;
			Evento proximoEvento = null;
			Map<LocalDate, Evento> eventosTreeMap = new TreeMap<LocalDate, Evento>(eventoMap);
			for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
				if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
					proximaData = entry.getKey();
					proximoEvento = entry.getValue();
					System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
					break;
				}
			}
		}else {
			System.out.println("O conjunto está vazio");
		}
		
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
	    
	    agendaEventos.exibirAgenda();
	    
	    agendaEventos.obterProximoEvento();
	}
}
