package hangman;

public class Word {
    private final String wordFromList;
    private final char[] guessesWord;

    public Word(String wordFromList){
        this.wordFromList = wordFromList;
        this.guessesWord = new char[wordFromList.length()];
        for (int i = 0; i < wordFromList.length(); i++) {
            guessesWord[i] = '_';
        }
    }

    public boolean guessLetter(char letter){
        boolean correct = false;
        for (int i = 0; i < wordFromList.length(); i++) {
            if (wordFromList.charAt(i) == letter){
                guessesWord[i] = letter;
                correct = true;
            }
        }
        return correct;
    }
    public boolean isGuessed() {
        return String.valueOf(guessesWord).equals(wordFromList);
    }

    public String getGuessableWord() {
        return String.valueOf(guessesWord);
    }

    public String getWord() {
        return wordFromList;
    }

}
