package main.aplication;

import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme("Poderoso Chefao", 1970);
		meuFilme.setDuracaoEmMinutos(180);
		meuFilme.avalia(8);
		meuFilme.exibeFichaTecnica();
		
		Serie lost = new Serie("Lost", 2000);
		
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(12);
		lost.setMinutosPorEpisodio(50);
		
		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
		
		Filme outroFilme = new Filme("Avangers", 2019);
		
		outroFilme.setDuracaoEmMinutos(200);
		
		CalculadoraDeTempo calcula = new CalculadoraDeTempo();
		calcula.inclui(meuFilme);
		calcula.inclui(outroFilme);
		calcula.inclui(lost);
		System.out.println(calcula.getTempoTotal());
		
		Filme favorito = new Filme("The Matrix", 1999);
		favorito.setDuracaoEmMinutos(135);
		favorito.setIncluidoNoPlano(true);

		Filme outro = new Filme("John Wick", 2014);
		outro.setDuracaoEmMinutos(101);
		outro.setIncluidoNoPlano(true);

		Serie serie = new Serie("La Casa de Papel", 2017);
		serie.setIncluidoNoPlano(true);
		serie.setAtiva(true);
		serie.setTemporadas(5);
		serie.setEpisodiosPorTemporada(10);
		serie.setMinutosPorEpisodio(45);

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(favorito);
		calculadora.inclui(outro);
		calculadora.inclui(serie);

		System.out.println("Tempo total: " +calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		
		filtro.filtra(meuFilme);
		
		
		Episodio episodio = new Episodio();
		
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVizualizacoes(300);
		filtro.filtra(episodio);
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(outroFilme);
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outro);
		listaDeFilmes.add(favorito);
		
		System.out.println("Tamanho da lista: " + listaDeFilmes.size());
		System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
		System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).toString());
		System.out.println(listaDeFilmes);
		System.out.println(meuFilme.toString());	
	}

}
