import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.rule.FuzzyRuleSet;

public class WateringFuzzy {

    public static void main(String[] args) throws Exception {
        try {
            String fileName = args[0];
            int stopien_nawadniania = Integer.parseInt(args[1]);
            int temperatura = Integer.parseInt(args[2]);
            int wilgotnosc = Integer.parseInt(args[3]);
            FIS fis = FIS.load(fileName,false);

            //wyswietl wykresy funkcji fuzyfikacji i defuzyfikacji
            FuzzyRuleSet fuzzyRuleSet = fis.getFuzzyRuleSet();
            fuzzyRuleSet.chart();

            //zadaj wartosci wejsciowe
            fuzzyRuleSet.setVariable("stopien_nawadniania", stopien_nawadniania);
            fuzzyRuleSet.setVariable("temperatura", temperatura);
            fuzzyRuleSet.setVariable("wilgotnosc", wilgotnosc);
            //logika sterownika
            fuzzyRuleSet.evaluate();

            //graficzna prezentacja wyjscia
            fuzzyRuleSet.getVariable("zmiana_stopien_nawadniania").chartDefuzzifier(true);

            //System.out.println(fuzzyRuleSet);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Niepoprawna liczba parametrow. Przyklad: java WateringFuzzy string<plik_fcl> int<stopien nawadniania> int<temperatura> int<wilgotnosc>");
        } catch (NumberFormatException ex) {
            System.out.println("Niepoprawny parametr. Przyklad: java WateringFuzzy string<plik_fcl> int<stopien nawadniania> int<temperatura> int<wilgotnosc>");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

}