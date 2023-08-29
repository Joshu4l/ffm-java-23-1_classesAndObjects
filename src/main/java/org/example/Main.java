//Erstellt gemeinsam eine Java-Anwendung, um das gelernte Wissen anzuwenden.

//Schritt 1: Erstellt eine Klasse 'Book' mit den Eigenschaften 'title', 'author' und 'isbn'.
//           Implementiert Getter und Setter Methoden für diese Eigenschaften.

//Schritt 2: Überschreibt die `toString` Methode der 'Book' Klasse,
//           um die Buchinformationen gut lesbar darzustellen.

//Schritt 3: Erstellt eine Klasse 'Library' mit einem Array von 'Book'-Objekten.

//Schritt 4: Überschreibt die `toString` Methode der 'Library' Klasse,
//           um die Informationen der 'Library' gut lesbar darzustellen.

//Schritt 5: Überprüft die Funktionalität eurer Klassen in der 'main' Methode,
//           indem ihr eine Instanz von 'Library' erstellt und ein Array vom Typ 'Book' verwendet.

package org.example;

public class Main {

    public static void main(String[] args) {

        Library myLib = new Library();

        myLib.inventory[0] = new Book("Die unendliche Geschichte", "Michel Ende", "9783423107952");
        myLib.inventory[1] = new Book("Alice im Wunderland", "Alice Carroll", "9780194229647");
        myLib.inventory[2] = new Book("Design Patterns", "John Vlissides", "9780201633610");

    }
}

