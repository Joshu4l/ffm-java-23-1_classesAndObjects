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

import com.sun.source.tree.NewArrayTree;

public class Library {

    public Book[] inventory = new Book[10];

    public Library() {
        // CONSTRUCTOR HERE IS NEEDED, EVEN IF THERE ARE NO
    }


}
