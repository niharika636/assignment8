import java.lang.*;
class AlphabetsPattern
{
  public static void main(String abc[])
  {
   for(int i=1;i<=3;i++)
   {
   int alphabet=97;                         
   for(int j=1;j<=i;j++)
   {
   System.out.print((char)alphabet);
   alphabet++;
   }
   System.out.println();
   }
  }
}