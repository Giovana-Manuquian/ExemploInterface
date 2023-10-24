package br.senai.sp.jandira.model;

public class Carro implements Veiculo{
    @Override
    public void andar() {
        System.out.println("O carro está andando");
    }
    @Override
    public void freiar() {
        System.out.println("O veiculo está freiando");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("vrum vrum");
    }
}
