
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
   -  È strettamente collegata alle classi:
    - `GestoreGiocatori`
    - `GestoreGara`
 
- **Costruttore:**
  - `Giocatore()`  - inizializza un oggetto Giocatore,all'interno istanzia un oggetto Cifrario che cifrerà la password.
- **Metodi:**
  - `getUsername()`: Restituisce il valore dell'attributo `username`.
  - `getPassword()`: Restituisce il valore dell'attributo `password`.
  - `toString()`: Restituisce una stringa che rappresenta `l'username` e `la password`.

## Pilota

- **Descrizione :**
  - Rappresenta il pilota che guida l'auto.

- **Costruttore:**
  - `Macchina(Pilota pilota, Circuito circuitoSuCuiDeveGareggiare)`: Inizializza gli attributi della macchina attraverso l'input utente.
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

- **Costruttore:**
   - `Vigenere(int ir, int fr, int ic, int fc, Matrice matrix)`: inizializza un oggetto Vigenere 

- **Metodi:**
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


 - **Costruttore:**
 - `Matrice(String verme)`: inizializza un oggetto Matrice con la chiave segreta specificata.

- **Metodi:**
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
  - `quadranti`: `ArrayList` contiene `quattro` oggetti della classe `Vigenere`, rappresentanti i quadranti della matrice.


 - **Costruttore:**
  - `Cifrario(String verme)`: inizializza l'oggetto `Cifrario`,inizializza un oggetto Matrice e i quadranti (Vigenere) utilizzati per la cifratura.

- **Metodi:**
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

- **Costruttore:**
   - `Circuito()`: - inizializza un oggetto Circuito,utilizza uno Scanner per richiedere in input da tastiera gli attributi:
        - `nome`
        - `lunghezza`
        - `numeroMacchinePartecipanti`
        - `numeroGiri`
        - `numeroPitStopMinimi`

- **Metodi:**
  - `getNome()`: restituisce il nome del circuito.
  - `getLunghezza()`: restituisce la lunghezza del circuito.
  - `getNumeroMacchinePartecipanti()`: restituisce il numero di macchine partecipanti.
  - `getNumeroGiri()`: restituisce il numero di giri previsti.
  - `getNumeroPitStopMinimi()`: restituisce il numero minimo di pit stop da fare.
   - `toString()`: restituisce una stringa che rappresenta il Circuito distinguendo `nome` , `lunghezza` e `numeroMacchinePartecipanti`,`numeroGiri` e `numeroPitStopMinimi` .

## Macchina

- **Descrizione:**
  - Rappresenta una macchina da corsa nche gareggierà nel  Grand Prix.
  - Estende la classe `Thread` per consentire l'esecuzione concorrente della gara.

- **Attributi:**
  - `nome`: nome della macchina.
  - `idMacchina`: id della macchina.
  - `pilota`: oggetto della classe `Pilota` che guida la macchina.
  - `running`: booleano che indica se la macchina è in corsa.
  - `distanzaPercorsaInUnGiro`: distanza percorsa dalla macchina nel giro corrente.
  - `distanzaDaPercorrereInUnGiro`: distanza totale da percorrere in un giro.
  - `giriDisputati`: numero di giri  disputati.
  - `giriDaDisputare`: numero totale di giri da disputare.
  - `pitStopFatti`: numero di pit stop  effettuati.
  - `pitStopDaFare`: numero minimo di pit stop da effettuare.
  - `truccata`: booleano che indica se la macchina è truccata.
  - `incidentata`: booleano che indica se la macchina è incidentata.
  - `pitStopInCorso`: booleano che indica se è in corso un pit stop.
  - `tempoTotaleGara`: durata totale della gara.

- **Costruttore:**
  - `Macchina(Pilota pilota, Circuito circuitoSuCuiDeveGareggiare)`: inizializza un oggetto Macchina,utilizza uno Scanner per richiedere in input da tastiera gli attributi:
        - `nome`
        - `idMacchina`
        - `truccata`

- **Metodi:**
  - `getNome()`: restituisce il nome della macchina.
  - `getPilota()`: restituisce l'oggetto della classe `Pilota` che guida la macchina.
  - `getID()`: restituisce l'identificatore univoco della macchina.
  - `getRunning()`: restituisce il flag che indica se la macchina è in corsa.
  - `getDistanzaPercorsaInUnGiro()`: restituisce la distanza percorsa nel giro corrente.
  - `setDistanzaPercorsaInUnGiro(double distanzaPercorsaInUnGiro)`: imposta la distanza percorsa nel giro corrente.
  - `getDistanzaDaPercorrereInUnGiro()`: restituisce la distanza totale da percorrere in un giro.
  - `getGiriDisputati()`: restituisce il numero di giri  disputati.
  - `setGiriDisputati(int giriDisputati)`: imposta il numero di giri  disputati.
  - `getGiriDaDisputare()`: restituisce il numero totale di giri da disputare.
  - `isIncidentata()`: restituisce il booleano che indica se la macchina è incidentata.
  - `gareggia()`: simula la corsa della macchina.
  - `pitStop()`: simula un pit stop della macchina.
  - `incidente()`: simula un incidente della macchina.
  - `run()`: metodo ereditato dalla classe `Thread`, definisce la logica della gara di una singola macchina.
  - `toString()`: restituisce una stringa dell'oggetto `Macchina` che varia in base all'andamento della macchina in gara

 ## GestoreGiocatori

- **Descrizione:**
  - Il `GestoreGiocatori` gestisce l'autenticazione dei giocatori, consentendo loro di registrarsi o effettuare il login.
  - Rappresenta il circuito di gara per il Grand Prix  ed è strettamente collegata alle classi:
    - `Giocatore`
    - `GestoreGara`


- **Attributi:**
  - `listaGiocatori`: tutti i giocatori registrati.
  - `nomeFile`: nome del file dove sono `serializzati` i giocatori.


- **Costruttore:**
  - `GestoreGiocatori()`: inizializza un oggetto GestoreGiocatori.

- **Metodi:**
- `formUtente()`: mostra un menu per permettere all'utente di registrarsi o effettuare il login, restituendo true se l'utente viene autenticato con successo.
- `effettuaRegistrazione()`: consente all'utente di registrarsi inserendo username, verme e password, e cripta la password.
- `effettuaLogin()`: consente all'utente di effettuare il login inserendo username, verme e password, restituendo true se le credenziali sono corrette.
- `addGiocatore(Giocatore giocatore)`: aggiunge un giocatore alla lista dei giocatori.
- `esportaGiocatori()`: esporta la lista dei giocatori su file.
- `importaGiocatori()`: importa la lista dei giocatori da file.

## GestoreGara

Il `GestoreGara` gestisce l'intero processo della gara, dall'inizializzazione alla stampa della classifica finale.

### Metodi principali:

- `main(String[] args)`: Metodo principale che simula l'intero processo della gara.
- `faiScegliereCircuito()`: permette all'utente di scegliere il Circuito su cui si svolgerà la gara.
- `faiScegliereMacchine()`: Permette all'utente di scegliere le Macchine che parteciperanno alla gara.
- `avviaGara()`: avvia la gara, stampando un countdown e facendo partire ogni macchina sulla griglia di partenza.
- `safetyCar(int giroIncidente)`: simula l'intervento della safety car.
- `monitoraGara()`: monitora lo svolgimento della gara, gestendo le varie fasi e aggiornando la classifica.
- `stampaClassificaFinale()`: stampa la classifica finale della gara  esportandola in un file.
