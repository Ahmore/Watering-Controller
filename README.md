# Watering controller
Kontroler obsługujący system nawadniania roślin napisany w oparciu o zbiory rozmyte w bilbiotece Fuzzy.
W zależności od danych wejściowych jakimi są stopień nawadniania, temperatura i wilgotność rozstrzyga o ile powinien 
zostać zmieniony stopień nawadniania w danych warunkach.

## Uruchomienie:
`java WateringFuzzy <plik_fcl> <stopien nawadniania> <temperatura> <wilgotnosc>`

## Wejście
Stopień nawadniania: (0 .. 10)
![Image](screens/Stopien%20nawadniania.png)

Temperatura: (0 .. 50)
![Image](screens/Temperatura.png)

Wilgotność: (0 .. 100)
![Image](screens/Wilgotnosc.png)

## Wyjście
Zmiana stopnia nawadniania: (0 .. 10)
![Image](screens/Zmiana%20stopnia%20nawadniania.png)
![Image](screens/Zmiana%20stopnia%20nawadniania%20-%20wynik.png)

## Przykład
`java WateringFuzzy watering_controller.fcl 3 25 50`
