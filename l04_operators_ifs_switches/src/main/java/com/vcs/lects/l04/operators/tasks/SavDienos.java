package com.vcs.lects.l04.operators.tasks;

public class SavDienos {
	
	
	
	public String weekDayToStr(int i) {
		
		if (i == 1) return "Pirmadienis";
		if (i == 2) return "Antradienis";
		if (i == 3) return "Trečiadienis";
		if (i == 4) return "Ketvirtadienis";
		if (i == 5) return "Penktadienis";
		if (i == 6) return "Šeštadienis";
		if (i == 7) return "Sekmadienis";
		
		return "???";
	}
	
	public String weekDayToStrType(int i) {
		
		if (i >= 1 && i <= 5) return "darbo diena";
		if (i >= 6 && i <= 7) return "savaitgalis";
		
		return "???";
	}
	
	// trumpesnis bet ne visi case padengiami
	public String weekDayToStrTypeShort(int i) {
		return (i >= 1 && i <= 5 ? "darbo diena" : "savaitgalis");
	}
	
	public String weekDayToStrSwitch(int i) {
		
		switch (i) {
			case 1: return "pirm";
			case 2: return "antr";
			case 3: return "trec";
			case 4: return "ketv";
			case 5: return "penk";
			case 6: return "sest";
			case 7: return "sekm";
			default: return "???";
		}
		
	}
	
	public String weekDayToStTyperSwitch(int i) {
		
		switch (i) {
			case 1: 
			case 2: 
			case 3: 
			case 4: 
			case 5: return "darbo diena";
			case 6: 
			case 7: return "savaitgalis";
			default: return "???";
		}
		
	}
	
	
	
	

}
