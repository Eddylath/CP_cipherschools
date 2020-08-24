import java.util.*;
import java.io.*;
import java.lang.*;
class SWASTHIK
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(i==N/2 || j==N/2)
					System.out.print("*");
				else if(j>N/2 && i==0)
					System.out.print("*");
				else if(j<N/2 && i==N-1)
					System.out.print("*");
				else if(i>N/2 && j==N-1)
					System.out.print("*");
				else if(i<N/2 && j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}