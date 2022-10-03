package y2022;

public class D20221003_dna_to_rna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dna="GCAT";
		String rna="";
		
		char [] dnaArray = dna.toCharArray();
		for (char i:dnaArray) {
			if (i=='T') {
				i='U';
			}
			rna=rna+String.valueOf(i);  
		}
		System.out.println(rna);
	}

}
/*
Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').

Create a function which translates a given DNA string into RNA.

For example:

"GCAT"  =>  "GCAU"
The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.

*Others
*public class Bio{
    public String dnaToRna(String dna){
        return dna.replace("T", "U");
    } 
}
*
*/
