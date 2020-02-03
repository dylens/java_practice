/*
Rna Transcription

Write a program that, given a DNA strand, returns its RNA complement (per RNA transcription).

Both DNA and RNA strands are a sequence of nucleotides.

The four nucleotides found in DNA are adenine (**A**), cytosine (**C**),
guanine (**G**) and thymidine (**T**).

The four nucleotides found in RNA are adenine (**A**), cytosine (**C**),
guanine (**G**) and uracil (**U**).

Given a DNA strand, its transcribed RNA strand is formed by replacing
each nucleotide with its complement:

* `G` -> `C`
* `C` -> `G`
* `T` -> `A`
* `A` -> `U`

*/

public class ToRNA {

    private char[] dnalist = {'G', 'C', 'T', 'A'};
    private char[] ralist = {'C', 'G', 'A', 'U'};

    public String dnaToRNA(String dna) {
        char[] dnas = dna.toCharArray();
        char[] rnas = new char[dnas.length];

        int dnaLi = 0;
        for (char d : dnas) {
            int li = 0;
            for (char c : dnalist) {
                if (d == c) {
                    rnas[dnaLi] = ralist[li];
                    break;
                }
                li++;
            }
            dnaLi++;
        }

        return Tool.charArrayToString(rnas);
    }
}
