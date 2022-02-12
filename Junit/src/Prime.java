public class Prime {
    private int x,i;
    public boolean prime(int n)
    {
        for (i=2; i<=n; i++)
        {
            if(n%i==0)
            {
                break;
            }
        }

        if(i == n)
        {
            return true;
        }
        return false;
    }
}
