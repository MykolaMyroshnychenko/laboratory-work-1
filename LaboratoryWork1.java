package module1;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import java.util.Arrays;
/**
 * @version 1.0.0
 * @autor Mykola Myroshnychenko
 * @project module1
 * @class LaboratoryWork1
 * @since 15.03.2021 - 18.02
 */
public class LaboratoryWork1 {

    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("/Users/Николай/Downloads/harry.txt")));
        text = text.replaceAll("[^A-Za-z ']", "");
        String string = text;
        String[] parts = string.split(" C");

        for (int i = 0; i < parts.length; i++) {
            String[] word = parts[i].split(" ");

            if (i > 0) {
                System.out.println("C" + word[0]);
            } else {
                for (int j = 0; j < word.length; j++) {

                    if (word[j].startsWith("c") || word[j].startsWith("C"))
                        System.out.println(word[j]);
                }
            }
        }
    }
}
/*
CHAPTER
Come
Could
CarA
Couldn't
Could
CHAPTER
Comb
Christmas
Constrictor
COME
Caught
CHAPTER
Cupboard
Cokeworth
Come
Could
CHAPTER
Couldn't
Call
Class
Chf
Confed
CAR
CRASH
Could
Codswallop
CRACKPOT
CHAPTER
Come
Cornelius
Crikey
COURSE
Can
Could
Cauldron
Cauldron
Can't
Cauldron
Cauldron
Crockford
Crockford
Come
Crockford
Cauldrons
Copper
Collapsible
Can't
Columns
Come
Cauldron
Cauldron
Curses
Countercurses
Curious
Curious
Cauldron
Cauldron
Cross
CHAPTER
Cross
Cross
Cross
Cross
CarA
C'mere
Coming
Can't
Charlie
Charlie
Charlie's
Chocolate
Cauldron
Cakes
Chocolate
Chocolate
Chocolate
Can
CURRENTLY
Considered
Chocolate
Circe
Cliodna
Century
Charlie's
Crabbe
Crabbe
Chocolate
Crabbe
Can
C'mon
CHAPTER
Ceremony
Ceremony's
Cap
Crabbe
Chocolate
Cauldron
Can't
Caput
CHAPTER
CONK
Charms
Crabbe
Crabbe
Cheer
Can
Can't
Charlie
Charlie's
CHAPTER
Charlie's
Crabbe
Come
Come
Come
Come
Come
Crabbe
Catch
Crabbe
Charlie
Cleansweep
Charlie
Crabbe
Crabbe
Crabbe
Crabbe
Catching
Can't
Come
Curse
Curse
Crabbe
Cups
Charms
CHARMS
CORRIDOR
CHAPTER
Crabbe
Comet
Comets
Chasers
Chasers
Chasers
Chasers
Chasers
Chasers
Compared
Chasers
Charlie
Charms
Can
Confuse
Come
CHAPTER
Cup
Charms
Chaser
Captain
Chaser
Captain
Chaser
Chaser
Chaser
Chasers
Can't
Can't
Come
CHAPTER
Christmas
Christmas
Crabbe
Christmas
Christmas
Charlie
Crabbe
Come
Christmas
Christmas
Christmas
Century
Christmas
Christmas
Christmas
Chocolate
Christmas
Christmas
Come
Christmas
Christmas
Christmas
Christmas
Christmas
Christmas
Can
Come
Can
Christmas
CHAPTER
Christmas
Chess
Curse
Chocolate
Christmas
Could
Curse
Crabbe
Crabbe
Come
Crabbe
Clearly
Crabbe
CHAPTER
Christmas
Convention
Charlie's
Common
Can't
Charlie
Charlie
Charlie
Charlie
Charlie
Charlie's
Could
Charlie
Charlie's
Charlie
Charlie's
Come
Chuckling
Charlie's
CHAPTER
Copyin'
Could
Can't
Can
Centaurs
Can
Codswallop
CHAPTER
Code
Conduct
Come
Christmas
Cold
Come
Can
Come
Choose
CHAPTER
Certainly
Cauldron
Come
Calm
Call
Chocolate
Curse
Christmas
Cross
 */

public class LaboratoryWork1 {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("/Users/Николай/Downloads/harry.txt")));
        String[] lines = text.split("\n");
        int counter = 0;

        for (int i = 0; i < lines.length; i++) {

            if (lines[i].contains("Harry")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("/Users/Николай/Downloads/harry.txt")));
        text = text.replaceAll("[^A-Za-z ']", "");
    String[] lines = text.split("\\n");

    int counter = 0;

        for (int i = 0; i < lines.length; i++) {
        if (lines[i].contains("Harry")) {
        counter++;
        }
        }
        System.out.println(counter);

        text = text.replaceAll("[^A-Za-z ']", "");

        String[] words = text.split(" ");

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {

        if (!stringOfDistincts.contains(words[i])) {
        stringOfDistincts += words[i] + " ";
        }
        }
        String[] distincts = stringOfDistincts.split(" ");

        int wordC = 0;

        for (int i = 0; i < distincts.length; i++) {
        if (lines[i].startsWith("C")) {
        wordC++;
        }
        }
        System.out.println(wordC);

        }
}