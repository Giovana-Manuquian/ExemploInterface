package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Caminhao;
import br.senai.sp.jandira.model.Carro;
import br.senai.sp.jandira.model.Moto;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.fazerBarulho();

        Moto moto = new Moto();
        moto.freiar();

        Caminhao caminhao = new Caminhao();
        caminhao.andar();
    }
}
