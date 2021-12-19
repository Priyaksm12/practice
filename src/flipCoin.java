public class flipCoin
{
    public static void main(String[] args)
    {
        int loopCount = 1;
        double result;
        int heads = 0;
        while(loopCount <= 10)
        {
            result = Math.random();
            if(result <=0.5)
                System.out.println("Coin is heads.");
            if(result <= 0.5)
                heads = heads++;
            else
                System.out.println("Coin is tails.");
            loopCount = loopCount + 1;
        }
        double percentHeads = heads/10*100;
        double percentTails = (10-heads)/10*100;
        System.out.println("Coin of heads is: " +percentHeads);
        System.out.println("Coin of tails is: " +percentTails);

    }

}