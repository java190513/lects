package com.vcs.lects.l09.trpriemones;

import com.vcs.lects.l09.trpriemones.varikliai.EV;
import com.vcs.lects.l09.trpriemones.varikliai.EVTurbo;
import com.vcs.lects.l09.trpriemones.varikliai.KuroRusis;

public class UostasMain {

	public static void main(String[] args) {

		UostasMain uostas = new UostasMain();

//		uostas.parkingUndeground(new Trabant(30));
		uostas.parkingUndeground(new Maserati<>(CarColor.BALCK, new EVTurbo()));
//		uostas.parkingUndeground(new Maserati<>(CarColor.BALCK, new VidausDegimo()));
		uostas.parkingUndeground(new EVPaspirtukas());
//		uostas.parkingUndeground(new Paspirtukas(1.6));
		
		
		Trabant tr = new Trabant(34);
		tr.getVariklis().piltiKura(KuroRusis.D);
		
		EVPaspirtukas p = new EVPaspirtukas();
		p.getVariklis().ikraunamBaterija();

	}

	private void parkingUndeground(TuriVarikli<? extends EV> trVar) {

		System.out.println(trVar);

	}

//	private void parkingUndeground(TrPriemone trPr) {
//		if (trPr instanceof TuriVarikli) {
//			if (((TuriVarikli) trPr).getVariklis() instanceof EV) {
//				System.out.println(trPr);
//				return;
//			}
//		}
//
//		System.err.println(trPr);
//	}

}
