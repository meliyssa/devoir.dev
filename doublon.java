import java.util.Arrays;
class doublon {
 public static void main(final String[] args) {
 
   final String[] words = { "lundi", "mardi", "mercredi", "lundi", "jeudi", "vendredi", "jeudi", "Samedi"};
 
   final String[] uniqueWords = new String[words.length];
 
   String test = "";
 
   for (int i = 0; i < words.length; i++) {
     int indexAtWord = -1;
     final String word = words[i];
 
     for(int j = 0; j < uniqueWords.length; j++) {
       if(uniqueWords[j] == null || uniqueWords[j].equals(word)) {
         indexAtWord = j;
       }
     }
 
     if(indexAtWord >= 0) {
       uniqueWords[indexAtWord] = word;
 
     }
   }
   for (int count = 0; count < words.length; count++) {
     for (int countBeta = 0; countBeta < uniqueWords.length; countBeta++) {
         if (words[count] == uniqueWords[countBeta]) {
             test = "erreur";
         }
     }
 
     if (test != "erreur") {
       uniqueWords[count] = words[count];
     }
 
     test = "";
 }
   Arrays.sort(uniqueWords);
 
   System.out.println(Arrays.toString(uniqueWords));
 }
 
}