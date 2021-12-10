import java.util.Scanner;
import model.Ambulancia;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		String modeloCarro, tipoAmbulancia, tipoArmario, equipamentos;
		double valorModeloCarro = 0, valorTipoAmbulancia = 0, valorTipoArmario = 0, valorEquipamentos = 0;
		int prazo = 0;
		
		System.out.print("\nModelo do carro (Fiorino, Master ou Sprinter) ....: ");
		modeloCarro = sc.nextLine();	
		switch(modeloCarro){
			case "Fiorino": valorModeloCarro = 80000;
							prazo = 30;
							break;
			case "Master":	valorModeloCarro = 180000;
							prazo = 45;
							break;
			case "Sprinter": valorModeloCarro = 210000;
							 prazo = 60;
							 break;
		}
		
		System.out.print("Tipo da ambulância ('Tipo B' ou 'Tipo D') ........: ");
		tipoAmbulancia = sc.nextLine();
		switch(tipoAmbulancia){
			case "Tipo B": valorTipoAmbulancia = 30000; break;
			case "Tipo D": valorTipoAmbulancia = 50000; break;
		}

		System.out.print("Tipo do Ármario (MDF, MDP ou 'Compensado Naval') .: ");
		tipoArmario = sc.nextLine();
		switch(tipoArmario){
			case "MDF": valorTipoArmario = 5000; break;
			case "MDP": valorTipoArmario = 7500; break;
			case "Compensado Naval": valorTipoArmario = 10000; break;
		}	

		System.out.print("Equipamento ('Tipo B' ou 'Tipo D') ...............: ");
		equipamentos = sc.nextLine();
		switch(equipamentos){
			case "Tipo B": valorEquipamentos = 5000; break;
			case "Tipo D": valorEquipamentos = 7500; break;
		}
		
		Ambulancia ambulancia = new Ambulancia(modeloCarro, valorModeloCarro, tipoAmbulancia, valorTipoAmbulancia, tipoArmario, valorTipoArmario, equipamentos, valorEquipamentos, prazo);
		
		System.out.print("\nValor total .: R$ " + String.format("%.2f",ambulancia.getSoma()));
		System.out.print("\nPrazo .......: "    + ambulancia.getPrazo() + "\n\n");

		sc.close();

    }
}
