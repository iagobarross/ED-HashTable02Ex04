package view;

import controller.HashDivisao;
import controller.HashMultiplicacao;
import br.edu.fateczl.*;

public class Principal {
	public static void main(String[] args) {
		HashDivisao divCont = new HashDivisao();
		HashMultiplicacao multiCont = new HashMultiplicacao();

		Lista[] lista = new Lista[10];

		for (int i = 0; i < 10; i++) {
			lista[i] = new Lista();
		}

		try {
			lista[0].addLast(12);
			lista[0].addLast(647);
			lista[0].addLast(158);
			lista[0].addLast(136);
			lista[0].addLast(467);
			lista[1].addLast(156);
			lista[1].addLast(600);
			lista[1].addLast(551);
			lista[2].addLast(263);
			lista[2].addLast(414);
			lista[2].addLast(882);
			lista[2].addLast(945);
			lista[2].addLast(914);
			lista[2].addLast(953);
			lista[2].addLast(629);
			lista[3].addLast(884);
			lista[3].addLast(795);
			lista[3].addLast(194);
			lista[3].addLast(513);
			lista[4].addLast(591);
			lista[4].addLast(847);
			lista[4].addLast(66);
			lista[4].addLast(337);
			lista[4].addLast(979);
			lista[5].addLast(768);
			lista[5].addLast(53);
			lista[6].addLast(114);
			lista[6].addLast(803);
			lista[6].addLast(90);
			lista[6].addLast(339);
			lista[6].addLast(550);
			lista[7].addLast(574);
			lista[7].addLast(977);
			lista[7].addLast(216);
			lista[7].addLast(99);
			lista[7].addLast(617);
			lista[7].addLast(88);
			lista[8].addLast(142);
			lista[8].addLast(148);
			lista[8].addLast(227);
			lista[8].addLast(939);
			lista[8].addLast(585);
			lista[8].addLast(338);
			lista[8].addLast(206);
			lista[9].addLast(569);
			lista[9].addLast(708);
			lista[9].addLast(844);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			Lista[] divLista = divCont.hashTable(lista);
			Lista[] multiLista = multiCont.hashTable(lista);
			
			divCont.listTable();
			Thread.sleep(1000);
			multiCont.listTable();
		} catch (Exception e) {
		}
	}
}
