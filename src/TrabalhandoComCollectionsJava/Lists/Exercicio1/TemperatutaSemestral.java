package TrabalhandoComCollectionsJava.Lists.Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class TemperatutaSemestral {

    private double mediaTemperatura;
    private double soma;
    Scanner escreva = new Scanner(System.in);
    List<Double> temperaturas = new ArrayList<>();

    public TemperatutaSemestral() {}

    public TemperatutaSemestral(double mediaTemperatura, double soma, Scanner escreva, List<Double> temperaturas) {
        setMediaTemperatura(mediaTemperatura);
        setSoma(soma);
    }

    public double getMediaTemperatura() {
        return mediaTemperatura;
    }

    public void setMediaTemperatura(double mediaTemperatura) {
        this.mediaTemperatura = mediaTemperatura;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public void addTemp() {
        for (int i = 1; i <= 6; i++) {
            System.out.print("\nDigite a temperatura: do mês " + i + ": ");
            double temp = escreva.nextDouble();
            temperaturas.add(temp);
            setSoma(getSoma() + temp);
        }
    }

    public void showTempMedia() {
        setMediaTemperatura(getSoma() / temperaturas.size());
        System.out.println("\nTemperatura semestral: " + temperaturas);
        System.out.println("\nMédia semestral: " + getMediaTemperatura() + "ºC");
    }

    public void calculoMesesAbaixoMedia() {
        System.out.println("\nMeses abaixo da media.");
        for (Double temp : temperaturas) {
            if (temp < mediaTemperatura) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 1:
                        System.out.println((index + 1) + "- Janeiro: " + temp + "ºC");
                        break;
                    case 2:
                        System.out.println((index + 1) + "- Fevereiro: " + temp + "ºC");
                        break;
                    case 3:
                        System.out.println((index + 1) + "- Março: " + temp + "ºC");
                        break;
                    case 4:
                        System.out.println((index + 1) + "- Abril: " + temp + "ºC");
                        break;
                    case 5:
                        System.out.println((index + 1) + "- Maio: " + temp + "ºC");
                        break;
                    case 6:
                        System.out.println((index + 1) + "- Junho: " + temp + "ºC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
    public void calculoMesesAcimaMedia() {
        System.out.println("\nMeses acima da média.");
        for (Double temp : temperaturas) {
            if (temp > mediaTemperatura) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 1:
                        System.out.println((index + 1) + "- Janeiro: " + temp + "ºC");
                        break;
                    case 2:
                        System.out.println((index + 1) + "- Fevereiro: " + temp + "ºC");
                        break;
                    case 3:
                        System.out.println((index + 1) + "- Março: " + temp + "ºC");
                        break;
                    case 4:
                        System.out.println((index + 1) + "- Abril: " + temp + "ºC");
                        break;
                    case 5:
                        System.out.println((index + 1) + "- Maio: " + temp + "ºC");
                        break;
                    case 6:
                        System.out.println((index + 1) + "- Junho: " + temp + "ºC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
    public void showAllmonthsTemp() {
        System.out.println("\nMostrar todos os graus durante os 6 meses");
        for (Double index : temperaturas) {
            temperaturas.indexOf(index);
            System.out.println(index);
        }
    }
}
