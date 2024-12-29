# TP 5 : Gestion des exceptions

## Objectif
Ce TP consiste à créer des applications Java qui manipulent des exceptions personnalisées dans différents cas d'utilisation. Vous allez travailler sur deux exercices distincts : gestion des entiers naturels et gestion d'un système bancaire.

---

## Exercice 1 : Gestion des entiers naturels et exceptions personnalisées

### Description
L'objectif est de créer une classe `EntierNaturel` qui permet de gérer des entiers naturels (positifs ou nuls) et d'intégrer un système d'exceptions personnalisées avec la classe `NombreNegatifException`.

### Détails des fonctionnalités :
- **EntierNaturel** :
    - **Attribut `val`** : Un entier naturel (de type `int`).
    - **Constructeur** : Prend un `int` en argument et génère une exception `NombreNegatifException` si la valeur est négative.
    - **Méthodes** :
        - `getVal()` : Retourne la valeur de `val`.
        - `setVal(int)` : Modifie `val` en vérifiant si la nouvelle valeur est positive.
        - `decrementer()` : Décrémente `val` de 1, mais génère une exception si la valeur devient négative.

- **Exception `NombreNegatifException`** :
    - Cette exception est lancée quand une valeur négative est fournie à un entier naturel.
    - Elle doit permettre de mémoriser la valeur erronée qui a provoqué l'exception, avec une méthode pour la consulter.

### Fonctionnement :
- Le programme principal (`main`) utilise les méthodes de la classe `EntierNaturel`, et capture les exceptions potentielles (par exemple, lors de l'initialisation ou de la modification de la valeur d'un entier).

---

## Exercice 2 : Gestion d'un système bancaire avec exceptions

### Description
Cet exercice consiste à créer un système bancaire en Java avec des comptes bancaires et des opérations associées (dépôts, retraits, transferts).

### Détails des fonctionnalités :
- **Classe `CompteBancaire`** :
    - Attributs :
        - `numeroCompte` : Le numéro de compte bancaire.
        - `solde` : Le solde actuel du compte.
        - `nomTitulaire` : Le nom du titulaire du compte.
    - Méthodes :
        - `deposer(double)` : Dépôt d'argent sur le compte.
        - `retirer(double)` : Retrait d'argent, avec gestion de l'exception `FondsInsuffisantsException` si le solde est insuffisant.
        - `afficherSolde()` : Affichage du solde actuel.
        - `transférer(double, CompteBancaire)` : Transfert d'argent entre deux comptes, avec gestion de l'exception `CompteInexistantException` si le compte de destination est invalide.

- **Classes dérivées `CompteCourant` et `CompteEpargne`** :
    - **CompteCourant** : Permet un découvert.
    - **CompteEpargne** : Permet la génération d'intérêts.

- **Exceptions personnalisées** :
    - `FondsInsuffisantsException` : Lancée lorsqu'il y a un solde insuffisant pour effectuer un retrait.
    - `CompteInexistantException` : Lancée lorsqu'un transfert est effectué vers un compte inexistant.

### Fonctionnement :
- Dans la classe `Main`, créez une liste de comptes (`ArrayList<CompteBancaire>`), et effectuez diverses opérations telles que l'ajout et la suppression de comptes, ainsi que des opérations bancaires (dépôts, retraits, transferts).
- Chaque exception doit être gérée et des messages d'erreur appropriés doivent être affichés.

---

## Cloner le projet

   ```bash
   git clone https://url-de-votre-depot.git
   ```

## Compilation et exécution

- **Avec un IDE** : Ouvrez le projet dans votre IDE préféré (par exemple IntelliJ IDEA, Eclipse, etc.) et exécutez le programme directement.

- **Via la ligne de commande** :
    1. Naviguez dans le répertoire du projet :
       ```bash
       cd chemin/vers/le/projet
       ```
    2. Compilez les fichiers Java :
       ```bash
       javac *.java
       ```
    3. Exécutez le programme principal (`Main`) :
       ```bash
       java Main
       ```

---

## Tests

Testez les différents cas d'utilisation, notamment les exceptions :
- Ajoutez des valeurs négatives à un `EntierNaturel`.
- Effectuez des retraits avec un solde insuffisant dans `CompteBancaire`.
- Essayez de transférer de l'argent vers un compte inexistant.

Assurez-vous que chaque exception est correctement gérée et que des messages d'erreur appropriés sont affichés pour chaque situation.

---

## Technologies utilisées

- **Java** (version 17 ou supérieure recommandée)
- IDE comme **IntelliJ IDEA**, **Eclipse** ou **VS Code**

---

## Auteurs

- **Abdelmajid BOUSSELHAM**, 2024
