/*
# ROT13 is a weak form of encryption that involves "rotating" each letter in a
# word by 13 places. To rotate a letter means to shift it through the alphabet,
# wrapping around to the beginning if necessary, so 'A' shifted by 3 is 'D' and
# 'Z' shifted by 1 is 'A'. Write a function called rotate_word that takes a 
# string and an integer as parameters, and that returns a new string that 
# contains the letters from the original string 'rotated' by the given amount.
# For example, 'cheer' rotated by 7 is 'jolly' and 'melon' rotated by -10 is 
# 'cubed'. You might want to use the built-in functions ord, which converts a 
# character to a numeric code, and chr, which converts numeric codes to characters.
# Potentially offensive jokes on the Internet are sometimes encoded in ROT13. 
# If you are not easily offended, find and decode some of them..
*/

public class RotateLetter {
    //0-2=24
    private char[] ca = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public String rotate(String input, int number) {
        char[] ic = input.toCharArray();
        char[] result = new char[ic.length];
        for (int i = 0; i < ic.length; i++) {
            int index = ((int) ic[i] % 97 + (number % 26))%26;
            int offSet = index < 0 ? index + 26 : index;
            result[i] = ca[offSet];
        }
        return Tool.charArrayToString(result);
    }
}
