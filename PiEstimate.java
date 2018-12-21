public class PiEstimate
{
   public static void main(String[] args)
   {
      int n=0;
      int cirkel=0;
      double x;
      double y;
      while (true)
      {
         x = Math.random();
         y = Math.random();
         if (x*x + y*y < 1) cirkel++;
         n++;
         //forholdet mellem arealet af et kvadrat og den indskrevne cirkel pi/4 
         System.out.println(4*(double)cirkel/(double)n);
      }
   }
}