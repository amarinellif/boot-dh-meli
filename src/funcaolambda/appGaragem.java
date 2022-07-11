package funcaolambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class appGaragem {

    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("Ford", "Fiesta", 1000.0));
        veiculos.add(new Veiculo("Ford", "Focus", 1200.0));
        veiculos.add(new Veiculo("Ford", "Explorer", 2500.0));
        veiculos.add(new Veiculo("Fiat", "Uno", 500.0));
        veiculos.add(new Veiculo("Fiat", "Cronos", 1000.0));
        veiculos.add(new Veiculo("Fiat", "Torino", 1250.0));
        veiculos.add(new Veiculo("Chevrolet", "Aveo", 1250.0));
        veiculos.add(new Veiculo("Chevrolet", "Spin", 2500.0));
        veiculos.add(new Veiculo("Toyota", "Corola", 1200.0));
        veiculos.add(new Veiculo("Toyota", "Fortuner", 3000.0));
        veiculos.add(new Veiculo("Renault", "Logan", 950.0));

        Garagem garagem = new Garagem(1010, veiculos);

        System.out.println("\nLISTA ORDENADA POR PREÇO E MARCA:");
        final Stream<Veiculo> LISTA_ORDENADA_PRECO_MARCA = garagem.getVeiculos().stream()
                .sorted(Comparator.comparingDouble(Veiculo::getPreco))
                .sorted(Comparator.comparing(Veiculo::getModelo));
        LISTA_ORDENADA_PRECO_MARCA.forEach(System.out::println);

        System.out.println("\nLISTA DE CARROS BARATOS (PREÇO <= R$1000.0):");
        final Stream<Veiculo> LISTA_VEICULOS_BARATOS = garagem.getVeiculos().stream()
                .filter((current) -> current.getPreco() <= 1000.0)
                .sorted(Comparator.comparing(Veiculo::getModelo));
        LISTA_VEICULOS_BARATOS.forEach(System.out::println);

        System.out.println("\nLISTA DE CARROS CAROS (PREÇO > R$1000.0):");
        final Stream<Veiculo> LISTA_VEICULOS_CAROS = garagem.getVeiculos().stream()
                .filter((current) -> current.getPreco() > 1000.0)
                .sorted(Comparator.comparing(Veiculo::getModelo));
        LISTA_VEICULOS_CAROS.forEach(System.out::println);

        System.out.println("\nLISTA DE CARROS CAROS (PREÇO > R$1000.0):");
        double media = garagem.getVeiculos().stream()
                .mapToDouble(p -> p.getPreco())
                .average().getAsDouble();
        System.out.printf("\nPREÇO MÉDIO: R$ %.2f", media);

    }
}

//Anotações de insights em grupo durante o desenvolvimento do código
//OUTRAS ALTERNATIVAS PRA ORDENAR LISTAS
//final Stream<Veiculo> LISTA_ORDENADA = garagem.getVeiculos().stream().sorted(Comparator.comparing(Veiculo::getPreco));
//LISTA_ORDENADA.forEach(System.out::println);

//  final Stream<Veiculo> LISTA_ORDENADA = garagem.getVeiculos().stream()
//       .sorted((current,next) -> (next.getPreco().compareTo(current.getPreco())));
//LISTA_ORDENADA.forEach(System.out::println);

//   LISTA_VEICULOS_CAROS.forEach(System.out::println);
//   Double media = garagem.getTotal() / (garagem.getVeiculos().size());