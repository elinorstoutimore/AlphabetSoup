//Elinor Stoutimore
//09/25/26
//This program will generate a list of letters that form words advertising a certain company

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //precondition: empty pool called letters
    //postcondition: every time add is inputted, a letter is added
    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }

    //precondition: Nothing is returned from the letters string at any point
    //postcondition: A single random character from the letters string is outputted when randomLetter is inputted
    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
       char ret =  letters.charAt((int)(Math.random()*letters.length()));
        return ret;
    }

    //precondition: The letters string contains characters that the person inputs w/o any company stored in the string
    //postcondition: No matter what letters are inputted by the user, the relevant company will be stored in the middle of the list
    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        String firstParts = letters.substring(0, letters.length()/2);
        String secondParts = letters.substring(letters.length()/2);
        return letters = (firstParts + company + secondParts);
    }

    //precondition: The letters string contains vowels.
    //postcondition: The first vowel contained in the string is removed.
    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
    letters.replaceFirst("[aeiouAEIOU]", "");
    }

    //precondition: Letters string contains more than 1 letter which are all inputted by the user
    //postcondition: A certain number of letters are removed from the inputted value of string letter.
    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
    int location = (int)(Math.random()*(letters.length() - num));
    String firstPart = letters.substring(0, location);
    String lastPart = letters.substring(location);
    letters = (firstPart + lastPart);
    }

    //precondition: There is a string letters that contains the word "word"
    //postcondition: There is a string letters that does not contain the word "word"
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
    letters.replace("word", "");
    }
}
