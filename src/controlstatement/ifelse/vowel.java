package controlstatement.ifelse;

public class vowel {
    public void checkVowel(){
        char vol = 'a';

        if (vol == 'a' ||vol == 'e' ||vol == 'i' ||vol == 'o' ||vol == 'u'){
            System.out.println("It is vowel");
        } else{
            System.out.println("It is not vowel");
        }
    }
        public void switchVowel(){
            int letter = 'f';
            switch (letter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
    }
}
