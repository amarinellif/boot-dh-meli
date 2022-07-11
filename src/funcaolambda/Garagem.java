package funcaolambda;

import java.util.ArrayList;

public class Garagem {
    private int id;
    private ArrayList<Veiculo> veiculos;
    private double total;

    public Garagem(int id, ArrayList<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Double getTotal() {
        this.total = 0.0;
        for (Veiculo veiculo : this.veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }
}