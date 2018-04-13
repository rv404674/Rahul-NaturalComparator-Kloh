//Goal - Write a comparator that enforces a "natural" sort ordering that is intuitive to end user.

class OrderComparator
{
    //this function checks whether a char is a digit or not
    private static boolean isDigit(char ch)
    {
        return ( (ch>=48) && (ch<=57));
    }

    //This is the function that does the main part. Althoug there are two nested while loop, but still the time complexity is O(N)
    //as we are only considering a character once and we are only looping till size of bigger string.

    public int compare(String s1, String s2)
    {

        int curIndex1 = 0,result1;
        int curIndex2 = 0,result2;
        int s1Length = s1.length();
        int s2Length = s2.length();

        char c1,c2;

        //Now the main comparison starts.In this part we basically make a number( till we don't encounter a delimeter) from each string
        //and compare them one by one.
        
        while(curIndex1 < s1Length && curIndex2 < s2Length)
        {
            c1 = s1.charAt(curIndex1);
            while(curIndex1 < s1Length && !isDigit(c1))
            {
                curIndex1++;
                c1 = s1.charAt(curIndex1);
            }

            result1 = 0;
            while( curIndex1 < s1Length && isDigit( s1.charAt(curIndex1)) )
            {
                result1 = result1*10 + (s1.charAt(curIndex1)-'0');
                curIndex1++;
            }

            System.out.println(result1);


            c2 = s2.charAt(curIndex2);
            while(curIndex2 < s2Length && !isDigit(c2))
            {
                curIndex2++;
                c2 = s2.charAt(curIndex2);
            }

            result2 = 0;
            while( curIndex2 < s2Length && isDigit( s2.charAt(curIndex2)) )
            {
                result2 = result2*10 + (s2.charAt(curIndex2)-'0');
                curIndex2++;
            }

            System.out.println(result2);

            if(result1 < result2)
                return -1;
            else if (result1 > result2)
                return 1;
        }

        return 0;
    }

}

class RahulNaturalOrder
{
    public static void main (String args[])
    {
        OrderComparator obj = new OrderComparator();
        System.out.println(obj.compare("test10","test2"));
    }
}












