package epam.JUNIT.taskjunit;

public class stringremoval {

	public String R(String str)
    {
        String res = str;
        int len = str.length();

        if(len > 2)
        {
            if(str.charAt(0) == 'A' && str.charAt(1) == 'A')
            {
                res = str.substring(2);
            }
            else if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
            {
                res = str.substring(1);
            }
            else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
            {
                res = str.charAt(0) + str.substring(2);
            }
        }
        else
        {
            if(len == 2)
            {
                if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
                {
                    res = str.charAt(1) + "";
                }
                else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
                {
                    res = str.charAt(0) + "";
                }
                else
                {
                    res = "";
                }
            }
            else
            {
                res = "";
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        stringremoval str = new stringremoval();
        System.out.println(str.R("AASSSSA"));
        System.out.println(str.R("BAMMB"));
        System.out.println(str.R("AAAAA"));
        System.out.println(str.R("CABDC")); 
        System.out.println(str.R("CCCCC"));
        System.out.println(str.R("KAEEYC"));
        System.out.println(str.R("AAABDC"));
        
}
}
