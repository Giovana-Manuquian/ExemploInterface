package br.senai.sp.jandira.model;

public class Caminhao implements Veiculo{
    @Override
    public void andar() {
        System.out.println("O caminhão está andando");
    }

    @Override
    public void freiar() {
        System.out.println("O caminhão está freiando");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("rhammmm shuuu");
    }
}
