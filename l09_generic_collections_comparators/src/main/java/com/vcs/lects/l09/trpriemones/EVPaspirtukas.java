package com.vcs.lects.l09.trpriemones;

import com.vcs.lects.l09.trpriemones.varikliai.EV;
import com.vcs.lects.l09.trpriemones.varikliai.Variklis;

public class EVPaspirtukas extends Paspirtukas implements TuriVarikli<EV> {

	@Override
	public EV getVariklis() {
		return new EV();
	}

}
