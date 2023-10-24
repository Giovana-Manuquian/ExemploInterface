package br.senai.sp.jandira.model;

public class Moto implements Veiculo{
    @Override
    public void andar() {
        System.out.println("A moto está andando");
    }

    @Override
    public void freiar() {
        System.out.println("A moto está freiando");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("randan randan");
    }
}
