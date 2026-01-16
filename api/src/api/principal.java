package api;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bancodedados banc = new bancodedados();
		banc.conectar();
		if(banc.estaConectado()) {
		//	banc.inserirContato("Jeronimo Junio Araujo Silva","(21)96962-4869");
			banc.editarContato("1","Rayza" , "(85)986729024");
			banc.listarContato();
		}else {
			System.out.println("Não foi possivel conectar ao banco de dados");
		}

	}

}
