
# Informazioni sul Progetto

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
  - `toString()`: restituisce una stringa che rappresenta il pilota distinguendo `nome` e `cognome` e `scuderia`.
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
 - `Matrice(String verme)`: Inizializza la matrice con la chiave segreta specificata.
  - `setElemento(int r, int c, int el)`: Imposta un elemento della matrice alla posizione specificata.
  - `getElemento(int r, int c)`: Ottiene l'elemento della matrice alla posizione specificata.
  - `stampa()`: Stampa la matrice.
  - `cifra(String fch)`: Cifra una stringa utilizzando l'algoritmo di Vigenere.
  - `deCifra(String fcf)`: Decifra una stringa cifrata utilizzando l'algoritmo di Vigenere.

 
