package com.vcs.lects.l18.cleancode;



/**
 * <ul>
 * <li>Naming convetion:<b>
 * https://en.wikipedia.org/wiki/Naming_convention_(programming)</b></li>
 * <li>Kintamuju pavadinimu ilgis tiesiogiai turetu priuklausyti nuo to
 * kintamojo scope'o</li>
 * <li>Nesikartokim patys saves: person.getPersonName() ... ->
 * person.getName()</li>
 * <li>Klases pavadinimas turi atititikti jos turini</li>
 * <li>Jeigu nepavyksta sugalvoti taiklaus klases pavadinimo - refactoring
 * indikacija</li>
 * <li>Jeigu nepavuksta pavadinti metodo - jis daro per daug</li>
 * <li>Blogas kodas daro per daug! Geras kodas - konkreciai ir glaustai</li>
 *
 * <li>Palikti galimybe koda plesti ir vystyti nekoreguojant orginalaus: vengti
 * static ir final jie to nebutina</li>
 * <li>Dependencies: kuo maziau tuo geriau.</li>
 * <li>Komentarai - aiskinimas kaip tas turi buti naudojama ar kaip veikti:
 * refactor indikacija</li>
 * <li>Jeigu rasai komentara, pagalvok ar butu galima tiesiog pataisyti koda.
 * Jei ne - rasyk komentara</li>
 * </ul>
 *
 *
 * <p>
 * Rekomendacijos, bet ne taisykles:
 *
 * <li>Metodo ilgis - iki 20 eiluciu</li>
 * <li>Klases ilgis - iki 200 eiluciu</li>
 * </p>
 *
 * <h2><b>SOLID</b></h2>
 * <li><a href=
 * "https://en.wikipedia.org/wiki/SOLID">https://en.wikipedia.org/wiki/SOLID</a></li>
 * <li>Single responsibility principle</li>
 * <li>Open/closed principle</li>
 * <li>Liskov substitution principle</li>
 * <li>Interface segregation principle</li>
 * <li>Dependency inversion principle</li>
 *
 *
 */

public class RegisterAndController {


    int indexOfRegisterCounter;

    int registerAndControllerIndexOfTwoIntegrationFromEPSIISystemForTemporary = 8;

    int intergrationIndex;


    private String name;


    private void daroSkaiciavimaIrIsvedima() {

        skaiciuojam();
        isvedam();

    }

    private void isvedam() {

        new MyStuff() {
            @Override
            public void doJob() {
                System.out.println("neisiu i darba");
            }
        }.doJob();
    }

    private void skaiciuojam() {

        for (int i = 0; i < 10; i++) {

        }
    }


}
