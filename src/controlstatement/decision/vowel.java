package controlstatement.decision;

public class vowel {
    public void checkVowel(){
        char vol = 'a';

        if (vol == 'a' ||vol == 'e' ||vol == 'i' ||vol == 'o' ||vol == 'u'){
            System.out.println("It is vowel using if-else");
        } else{
            System.out.println("It is consonant using if-else");
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
                    System.out.println("It is Vowel using Switch");
                    break;
                default:
                    System.out.println("It is Consonant using Switch");
            }
    }
}
