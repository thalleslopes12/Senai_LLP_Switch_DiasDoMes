import java.util.*;

public class DiaDoMes {
    public static boolean isBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }

    public static int DiaNoMes(String mes, int ano) {
        mes = mes.toLowerCase();

        switch (mes) {

            case "1":
            case "janeiro":
                return 31;

            case "2":
            case "fevereiro":
                if (isBissexto(ano)) {
                    return 29;
                } else {
                    return 28;
                }

            case "3":
            case "março":
            case "marco":
                return 31;

            case "4":
            case "abril":
                return 30;

            case "5":
            case "maio":
                return 31;

            case "6":
            case "junho":
                return 30;

            case "7":
            case "julho":
                return 31;

            case "8":
            case "agosto":
                return 31;

            case "9":
            case "setembro":
                return 30;

            case "10":
            case "outubro":
                return 31;

            case "11":
            case "novembro":
                return 30;

            case "12":
            case "dezembro":
                return 31;
            default:
                return -1;

        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do mes ou o numero: ");
        String mesEntrada = leia.nextLine().toLowerCase();

        int mesNumero = -1;

        try {
            mesNumero = Integer.parseInt(mesEntrada);
        } catch (NumberFormatException e) {
            // usa o nome de entrada aqui
        }

        int ano = 0;

        if (mesEntrada.equals("2") || mesEntrada.equals("fevereiro") || mesNumero == 2) {
            System.out.print("Digite o ano pra verificar se é bissexto: ");
            ano = leia.nextInt();
        } else {
            ano = 2000;
        }

        int dias = DiaNoMes(mesEntrada, ano);

        if (dias == -1) {
            System.out.println("Mes invalido.");
        } else {
            System.out.println("Quantidade de dias: " + dias);
        }
    }
}