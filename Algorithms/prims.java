import java.io.*;
import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);

    int N=sc.nextInt();
    int M=sc.nextInt();
    int[][] T=new int[N][M];
    int min=0;
    int[] visited=new int[M];
    int result=0;

    int v=0;

    for(int i=0;i<N;i++)
        { visited[i]=0;

         for(int j=0;j<M;j++)
        T[i][j]=1000000;

    }
    for(int i=0;i<M;i++)
    {

     int a=sc.nextInt();
     int b=sc.nextInt();
     T[a-1][b-1]=sc.nextInt();
     T[b-1][a-1]=T[a-1][b-1];

    }
    for(int k=1;k<=N;k++)
        {
        min=1000000;

        for(int i=0;i<M;i++)
            {
            if(visited[i]==1)
                for(int j=0;j<M;j++)
                {

                if(visited[j]==0)
                    {
                        if(min>T[i][j])
                        {
                            min=T[i][j];
                            v=j;
                    }
                }
            }
        }
       visited[v]=1;
       if(min<1000000)
        result +=min;
    }
    System.out.println(result);
}
}
