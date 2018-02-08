package Exc_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exc_08
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("Bitch!");
        set.add("Mega bitch!");
        set.add("fds");
        System.out.println(maxLength(set));
    }

    public static int maxLength(Set<String> set)
    {
        if(set.isEmpty())
        {
            return 0;
        }
        int count = 0;
        for(String s: set)
        {
            if(s.length()>count)
            {
                count = s.length();
            }
        }
        return count;

    }
}
