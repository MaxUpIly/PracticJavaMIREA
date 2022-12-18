package mirea.pr7.w6;

public class ProcessStrings implements Strings {
    @Override
    public String ne_chet(String str) {
        String new_str = "";
        for (int i = 1; i <= str.length(); ++i)
        {
            if(!((i % 2) == 0))
            {
                new_str+=str.charAt(i-1);
            }
        }
        return new_str;
    }

    @Override
    public int size(String str) { return str.length(); }

    @Override
    public String reverse(String str) {
        String new_str = "";
        for (int i = 0; i < str.length(); ++i)
        {
            new_str+=str.charAt(str.length()-1-i);
        }
        return new_str;
    }
}
