package main.aplication;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		
		meuFilme.setNome("Poderoso Chefao");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		meuFilme.avalia(8);
		meuFilme.exibeFichaTecnica();
		
		Serie lost = new Serie();
		
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(12);
		lost.setMinutosPorEpisodio(50);
		
		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
		
		Filme outroFilme = new Filme();
		
		outroFilme.setNome("Avangers");
		outroFilme.setAnoDeLancamento(2019);
		outroFilme.setDuracaoEmMinutos(200);
		
		CalculadoraDeTempo calcula = new CalculadoraDeTempo();
		calcula.inclui(meuFilme);
		calcula.inclui(outroFilme);
		calcula.inclui(lost);
		System.out.println(calcula.getTempoTotal());
		
		Filme favorito = new Filme();
		favorito.setNome("The Matrix");
		favorito.setAnoDeLancamento(1999);
		favorito.setDuracaoEmMinutos(135);
		favorito.setIncluidoNoPlano(true);

		Filme outro = new Filme();
		outro.setNome("John Wick");
		outro.setAnoDeLancamento(2014);
		outro.setDuracaoEmMinutos(101);
		outro.setIncluidoNoPlano(true);

		Serie serie = new Serie();
		serie.setNome("La Casa de Papel");
		serie.setAnoDeLancamento(2017);
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
		
	}

}