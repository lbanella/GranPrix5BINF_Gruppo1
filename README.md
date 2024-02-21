
# Informazioni sul Progetto
> [!CAUTION] 
> 
> Questo progetto è ancora in fase di sviluppo e test. 

## Collaboratori
- **Lorenzo Banella**
  - [GitHub](https://github.com/lbanella)

- **Marco Moroni**
  - [GitHub](https://github.com/MarcoMoro16)

- **Adile Benazza**
  - [GitHub](https://github.com/Eidol469)

## Guida Didattica
- **Docente: Monica Ciuchetti**
  - [GitHub](https://github.com/mciuchetti)

- **Docente di Laboratorio: Francesco Amendola**

## Dettagli Scolastici
- **Anno Scolastico: 2023/2024**
- **Classe: 5BINF**
- **Corso: TPSIT**
- **Istituto: [ITTS A. Volta](https://www.avoltapg.edu.it/)**
  - *Perugia (PG), Italia*


## Spiegazioni delle Classi

## Giocatore

- **Descrizione :**
  - Rappresenta il giocatore , per giocare ha l' `obbligo`  di `identificarsi`,  se non dispone di un account , `registrarsi` e poi `loggarsi`.

- **Metodi:**
    - `Giocatore()`  - inizializza un oggetto Giocatore,utilizza uno Scanner per richiedere in input da tastiera gli attributi:
        - `username`
        - `password`
  - `getUsername()`: Restituisce il valore dell'attributo `username`.
  - `getPassword()`: Restituisce il valore dell'attributo `password`.
  - `toString()`: Restituisce una stringa che rappresenta `l'username` e `la password`.

## Pilota

- **Descrizione :**
  - Rappresenta il pilota che guida l'auto.


- **Metodi:**
    - `Pilota()`  : inizializza un oggetto Pilota,utilizza uno Scanner per richiedere in input da tastiera gli attributi:
        - `nome`
        - `cognome`
        - `scuderia`
  - `getNome()`: restituisce il valore dell'attributo `nome`.
  - `getCognome()`: restituisce il valore dell'attributo `password`.
  -  `getScuderia()`: restituisce il valore dell'attributo `scuderia`.
  - `toString()`: restituisce una stringa che rappresenta il Pilota distinguendo `nome` e `cognome` e `scuderia`.
 ## Vigenere

- **Descrizione :**
  - Implementa l'algoritmo di Vigenere e implementa l'interfaccia `Runnable`.
  - Serve per la `cifratura` della password, è strettamente collegato alle classi:
    - `Cifrario` 
    -  `Matrice` 

- **Attributi:**
  - `ir`: Indice di partenza per le righe.
  - `fr`: Indice finale per le righe.
  - `ic`: Indice di partenza per le colonne.
  - `fc`: Indice finale per le colonne.
  - `matrix`: Oggetto della classe `Matrice`.



- **Metodi:**
    - `Vigenere(int ir, int fr, int ic, int fc, Matrice matrix)`: inizializza un oggetto Vigenere 
  - `popola()`: popola la matrice secondo l'algoritmo di Vigenere.
  -  `run()`: contiene il metodo `popola()`.
 ## Matrice

- **Descrizione:**
  - Implementa la matrice utilizzata nell'algoritmo di cifratura `Vigenere`.
  - Serve per la cifratura della password ed è strettamente collegata alle classi:
    - `Cifrario`
    - `Vigenere`

- **Attributi:**
  - `mv`: Array bidimensionale di caratteri rappresentante la matrice.
  - `verme`: Stringa che rappresenta la `chiave segreta` per l'algoritmo di cifratura Vigenere.


 

- **Metodi:**
 - `Matrice(String verme)`: inizializza un oggetto Matrice con la chiave segreta specificata.
  - `setElemento(int r, int c, int el)`: imposta un elemento della matrice alla posizione specificata.
  - `getElemento(int r, int c)`: ottiene l'elemento della matrice alla posizione specificata.
  - `stampa()`: stampa la matrice.
  - `cifra(String fch)`: `cifra` una stringa utilizzando l'algoritmo di Vigenere.
  - `deCifra(String fcf)`: `decifra` una stringa cifrata utilizzando l'algoritmo di Vigenere.

 ## Cifrario

- **Descrizione:**
  - Rappresenta il cifrario basato sull'algoritmo di `Vigenere`.
  - Utilizza una matrice e quattro oggetti della classe `Vigenere` per cifrare e decifrare messaggi.
  
- **Attributi:**
  - `matrice`: oggetto della classe `Matrice` utilizzato per l'algoritmo di cifratura.
  - `quadranti`: `ArrayList` contenente `quattro` oggetti della classe `Vigenere`, rappresentanti i quadranti della matrice.


 

- **Metodi:**
 - `Cifrario(String verme)`: inizializza l'oggetto `Matrice` e i quadranti della matrice utilizzati per la cifratura.
  - `cifra(String messaggio)`: `cifra` un messaggio utilizzando l'algoritmo di Vigenere e restituisce la frase criptata.
  - `decifra(String messaggio)`: `decifra` un messaggio cifrato utilizzando l'algoritmo di Vigenere e restituisce la frase decriptata.



## Circuito

- **Descrizione:**
  - Rappresenta il circuito di gara per il Grand Prix  ed è strettamente collegata alle classi:
    - `Macchina`
    - `GestoreGara`


- **Attributi:**
  - `nome`: nome del circuito.
  - `lunghezza`: lunghezza del circuito in chilometri.
  - `numeroMacchinePartecipanti`: numero di macchine che parteciperanno alla gara.
  - `numeroGiri`: numero di giri previsti per la gara (minimo 10).
  - `numeroPitStopMinimi`: numero minimo di pit stop richiesti (1) numero massimo di pit stop (3).



- **Metodi:**
  - `Circuito()`: - inizializza un oggetto Circuito,utilizza uno Scanner per richiedere in input da tastiera gli attributi:
        - `nome`
        - `lunghezza`
        - `numeroMacchinePartecipanti`
        - `numeroGiri`
        - `numeroPitStopMinimi`
  - `getNome()`: restituisce il nome del circuito.
  - `getLunghezza()`: restituisce la lunghezza del circuito.
  - `getNumeroMacchinePartecipanti()`: restituisce il numero di macchine partecipanti.
  - `getNumeroGiri()`: restituisce il numero di giri previsti.
  - `getNumeroPitStopMinimi()`: restituisce il numero minimo di pit stop da fare.
   - `toString()`: restituisce una stringa che rappresenta il Circuito distinguendo `nome` , `lunghezza` e `numeroMacchinePartecipanti`,`numeroGiri` e `numeroPitStopMinimi` .

