package com.vcs.lects.l10.trees;

import java.util.ArrayList;
import java.util.List;

public class PrekiuKatalogas {

	public static void main(String[] args) {

		/**
		 * Ukines
		 */

		Element vokiski = new Element("Vokiski", new Element("Gooten clean"), new Element("Fertxcdzasd"));
		Element lePrancuziski = new Element("LePrancuziskas", new Element("Parfume clean"),
				new Element("LeEifel clean"), new Element("LeParfume"));

		Element valikliai = new Element("Valikliai", vokiski, lePrancuziski);
		Element balikliai = new Element("Balikliai", new Element("Vanish"), new Element("Baltuoklis"));
		Element chemija = new Element("Chemija", new Element("Cezis"), new Element("Radis"), new Element("Boras"));

		Element ukines = new Element("Ukines", new Element("Buitine chemija", valikliai, balikliai, chemija));

		/**
		 * Laisvailaikio
		 */
		Element lauko = new Element("Lauko", new Element("Slides"), new Element("Dviratis"), new Element("Meskere"));
		Element vidaus = new Element("Vidaus", new Element("Stalo futbolas"), new Element("Dartai"));

		Element laisvaliakio = new Element("Laisvaliakis", lauko, vidaus);

		/**
		 * Statybines
		 */
		Element staybines = new Element("Statybines", new Element("Cementas"));

		/**
		 * Katalogas (root)
		 * 
		 */
		Element katalogas = new Element("Prekes", ukines, staybines, laisvaliakio, new Element("Atvezimo paslauga"));

		PrekiuKatalogas pk = new PrekiuKatalogas();

		System.out.println("Pirmas pasitaikes: " + pk.searchItem(katalogas, "  DAR "));

		System.out.println("Kiekis pagal zodi: " + pk.countItems(katalogas, "  eifel "));

		System.out.println("Paieska pagal fraze, sarasas: ");

		for (Element el : pk.searchAllElements(katalogas, "clean")) {
			System.out.println("   - " + el);
		}
		
		
		System.out.println( "Prekes path: " + pk.getCategoryPath(katalogas, "LeParfume") );

	}

	/**
	 * Suranda pirma pasitaikiusi elementa pagal paduota pavadinima
	 * 
	 * @param category   - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return pirmas surastas elementas
	 */
	public Element searchItem(Element category, String searchText) {

		if (isItContainsTheText(searchText, category.getName())) {
			return category;
		}

		for (Element childElement : category.getChilds()) {
			Element result = searchItem(childElement, searchText);
			if (result != null) {
				return result;
			}
		}

		return null;
	}

	/**
	 * Suskaiciuoja elementus pagal paieskos fraze
	 * 
	 * @param category   - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return kiekis
	 */
	public int countItems(Element category, String searchText) {

		int counter = isItContainsTheText(searchText, category.getName()) ? 1 : 0;

		for (Element childElement : category.getChilds()) {
			counter += countItems(childElement, searchText);
		}

		return counter;
	}

	/**
	 * Suranda elementus pagal paieskos fraze
	 * 
	 * @param category   - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return elemntu sarasas
	 */
	public List<Element> searchAllElements(Element category, String searchText) {

		List<Element> result = new ArrayList<>();
		if (isItContainsTheText(searchText, category.getName())) {
			result.add(category);
		}

		for (Element childElement : category.getChilds()) {
			result.addAll(searchAllElements(childElement, searchText));
		}

		return result;

	}

	/**
	 * Grazina elemnto kategorijos kelia (path)
	 * 
	 * @param category   - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return kelias iki elemento
	 */
	public String getCategoryPath(Element category, String elementName) {

		String path = "";
		if (category.getName().equals(elementName)) {
			return category.getName();
		} else {

			for (Element childEl : category.getChilds()) {
				String childPath = getCategoryPath(childEl, elementName);
				
				if (!childPath.isEmpty()) {
					path += category.getName() + " > " + childPath;
				}
				
			}
		}
		return path;
	}

	private boolean isItContainsTheText(String searchText, String name) {
		return name.toLowerCase().contains(searchText.trim().toLowerCase());
	}

}
