package views;

import model.Tempo;

import java.util.Scanner;

public class TestTempo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Tempo tempo = new Tempo();

        System.out.println("tempo Do Evento");
        tempo.segundos = ler.nextInt();



        System.out.println(tempo.mostarDados());

    }
}
