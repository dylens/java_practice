import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToRNATest {

    ToRNA toRNA = new ToRNA();

    @Test
    public void test_transcribes_guanine_to_cytosine() {
        String dna = "G";
        String rna = "C";
        assertEquals(rna, toRNA.dnaToRNA(dna));
    }

    @Test
    public void test_transcribes_thymine_to_adenine() {
        String dna = "C";
        String rna = "G";
        assertEquals(rna, toRNA.dnaToRNA(dna));
    }

    @Test
    public void test_transcribes_adenine_to_uracil() {
        String dna = "T";
        String rna = "A";
        assertEquals(rna, toRNA.dnaToRNA(dna));
    }

    @Test
    public void test_transcribes_all_occurences() {
        String dna = "A";
        String rna = "U";
        assertEquals(rna, toRNA.dnaToRNA(dna));
    }

    @Test
    public void test_transcribes_cytosine_to_guanine() {
        String dna = "ACGTGGTCTTAA";
        String rna = "UGCACCAGAAUU";
        assertEquals(rna, toRNA.dnaToRNA(dna));
    }

}
