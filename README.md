# Pandemic Simulation

Aplikacja typu REST umożliwiająca sumulację rozwoju epidemii. Po podaniu parametrów tworzy rekordy w bazie danych dla każdego dnia symulacji (liczba dni symulacji podana w parametrach).

Początkowe parametry:
● N - Nazwa symulacji (string)
● P - wielkość populacji
● I - początkowa liczba osób zarażonych
● R - wskaźnik określający ile osób zaraża jedna zarażona osoba
● M - wskaźnik śmiertelności, określający ilu spośród zarażonych umiera
● Ti - ilość dni, która upływa od momentu zarażenia do wyzdrowienia chorego
● Tm - ilość dni, która upływa od momentu zarażenia do śmierci chorego
● Ts - ilość dni, dla których ma być przeprowadzona symulacja

Po zdefiniowaniu symulacji system będzie generował początkową populację, a nastepnie zasymulowane dla każdego dnia symulacji dane (Pi, Pv, Pm, Pr), przechowyjące informacje odpowiednio o: liczbie osób zarażonych, zdrowych i podatnych na infekcję, zmarłych oraz osób, które wyzdrowiały i nabyły odporność.
