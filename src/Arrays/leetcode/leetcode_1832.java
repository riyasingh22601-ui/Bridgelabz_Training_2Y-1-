package Arrays.leetcode;

public class leetcode_1832 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
        for(int ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)<0)
            {
                return false;
            }
        }
        return true;
    }
}
